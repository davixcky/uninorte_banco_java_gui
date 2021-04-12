/*
Se desea realizar un programa con GUI que permita agregar cuentas en un banco. 
Cada cuenta debe tener código,  nombre usuario, saldo. 
Las operaciones sobre las cuentas son modificar nombre usuario, 
retirar dinero, consignar dinero, consultar saldo. 
las operaciones sobre el banco son agregar cuenta, consultar cuenta, listar cuentas, 
eliminar cuenta. Listar cuentas debe mostrar nombre usuario y saldo de la cuenta

Banco:
    Agregar cuenta
    Consultar cuenta
    Listar cuentas (nombre usuario - saldo cuenta)
    Elimar cuenta
 */
package ejerciciobanco;

import controllers.Accounts;
import screens.MainUI;

public class EjercicioBanco {

    public static void main(String[] args) {
        Accounts accountsController = new Accounts();
        
        MainUI mainScreen = new MainUI(accountsController);
        mainScreen.setVisible(true);
    }
    
}
