
package controllers.exceptions;

public class AccountExistsException extends Exception {

    public AccountExistsException() {
        super();
    }

    public AccountExistsException(String message) {
        super(message);
    }
}
