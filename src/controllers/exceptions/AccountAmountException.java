package controllers.exceptions;

public class AccountAmountException extends Exception {

    public AccountAmountException() {
        super();
    }

    public AccountAmountException(String message) {
        super(message);
    }
}