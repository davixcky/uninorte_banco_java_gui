/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.exceptions;

public class AccountPermissionDenied extends Exception {

    public AccountPermissionDenied() {
        super();
    }

    public AccountPermissionDenied(String message) {
        super(message);
    }
}