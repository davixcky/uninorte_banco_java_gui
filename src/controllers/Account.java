package controllers;

import controllers.exceptions.AccountAmountException;
import controllers.exceptions.AccountPermissionDenied;
import java.util.UUID;

public class Account {
    private String firstname;
    private String lastname;
    private String accountID;
    private String pinPassword;
    private double totalAmount;

    public Account(String firstname, String lastname, String password, Double baseAmount) throws Exception {
        this.firstname = firstname;
        this.lastname = lastname;
        this.accountID = UUID.randomUUID().toString().replace('-', '\0');
        this.totalAmount = baseAmount;

        this.setPassword(password);
    }

    public String getFullName() {
        return String.format("%s %s", this.firstname, this.lastname);
    }

    public void setPassword(String pinPassword) throws IllegalArgumentException{
        if (pinPassword.length() != 4) {
            throw new IllegalArgumentException("Pin debe tener solo 4 caracteres");
        }

        // if pinPassword contains chars that are not numbers, it will return an exception
        if (!pinPassword.matches("[0-9]+")) {
            throw new IllegalArgumentException("Pin no puede contener letras");
        }

        this.pinPassword = pinPassword;
    }

    public double getTotalAmount(String pinPassword) throws Exception {
        this.checkPinPassword(pinPassword);
        return this.totalAmount;
    }

    public double setWithdraw(String pinPassword, double withdraw) throws Exception {
        this.checkPinPassword(pinPassword);

        if (withdraw <= 0) {
            throw new IllegalArgumentException("el monto de retiro debe ser mayor a 0");
        }

        if (withdraw > this.totalAmount) {
            throw new AccountAmountException("no puede retirar mas de lo que tiene");
        }

        this.totalAmount -= withdraw;
        return this.totalAmount;
    }

    public double addAmount(String pinPassword, double amount) throws Exception {
        this.checkPinPassword(pinPassword);

        if (amount <= 0) {
            throw new IllegalArgumentException("el monto a agregar debe ser mayor a 0");
        }

        this.totalAmount += amount;
        return this.totalAmount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", accountID='" + accountID + '\'' +
                ", pinPassword='" + pinPassword + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

    public String toString(String pinPassword) throws Exception{
        this.checkPinPassword(pinPassword);
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", accountID='" + accountID + '\'' +
                ", pinPassword='" + pinPassword + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

    private void checkPinPassword(String pinPassword) throws Exception {
        if (!pinPassword.equals(this.pinPassword)) {
            throw new AccountPermissionDenied("pin invalido");
        }
    }
}
