/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screens.bankPanels;

import java.util.ArrayList;
import controllers.Account;
import controllers.Accounts;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author davidorozco
 */
public class AddAccount extends javax.swing.JFrame {

    private ArrayList<AccountListener> listeners;
    private Accounts accountsControllers;

    /**
     * Creates new form AddAccount
     */
    public AddAccount(Accounts accountsController) {
        initComponents();

        this.accountsControllers = accountsController;
        listeners = new ArrayList<>();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setResizable(false);

        inputInitialAmount.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                inputAmountTextChangedHandler(e);
            }
        });

        getRootPane().setDefaultButton(btnSubmit);
    }

    public void addAccountListener(AccountListener l) {
        listeners.add(l);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        inputFirstname = new javax.swing.JTextField();
        inputInitialAmount = new javax.swing.JTextField();
        inputPassword = new javax.swing.JTextField();
        inputLastname = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblLastnameHelp = new javax.swing.JLabel();
        lblFirstnameHelp = new javax.swing.JLabel();
        lblContrasenaHelp = new javax.swing.JLabel();
        lblInitialAmountHelp = new javax.swing.JLabel();
        lblGeneralHelp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre");

        jLabel2.setText("Apellido");

        jLabel3.setText("Contrasena");

        jLabel4.setText("Cantidad inicial");

        inputInitialAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputInitialAmountActionPerformed(evt);
            }
        });

        inputPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordActionPerformed(evt);
            }
        });

        inputLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputLastnameActionPerformed(evt);
            }
        });

        btnSubmit.setText("Guardar");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Fira Sans", 1, 13)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSubmit)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblGeneralHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(inputPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputInitialAmount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                    .addComponent(lblContrasenaHelp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblInitialAmountHelp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblLastnameHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(inputFirstname, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                                    .addComponent(inputLastname, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblFirstnameHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFirstnameHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLastnameHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblContrasenaHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputInitialAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInitialAmountHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGeneralHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSubmit))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputInitialAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputInitialAmountActionPerformed
        var event = new ActionEvent(btnSubmit, ActionEvent.ACTION_PERFORMED, "Anything");

        for (ActionListener listener : btnSubmit.getActionListeners()) {
            listener.actionPerformed(event);
        }
    }//GEN-LAST:event_inputInitialAmountActionPerformed

    private void inputPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordActionPerformed
        var event = new ActionEvent(btnSubmit, ActionEvent.ACTION_PERFORMED, "Anything");

        for (ActionListener listener : btnSubmit.getActionListeners()) {
            listener.actionPerformed(event);
        }
    }//GEN-LAST:event_inputPasswordActionPerformed

    private void inputLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputLastnameActionPerformed
        var event = new ActionEvent(btnSubmit, ActionEvent.ACTION_PERFORMED, "Anything");

        for (ActionListener listener : btnSubmit.getActionListeners()) {
            listener.actionPerformed(event);
        }
    }//GEN-LAST:event_inputLastnameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        var firstname = inputFirstname.getText();
        var lastname = inputLastname.getText();
        var password = inputPassword.getText();
        var initialAmount = inputInitialAmount.getText();

        boolean isEmptyFieldStatus = false;

        isEmptyFieldStatus = this.isEmptyField(firstname, "nombre", isEmptyFieldStatus);
        isEmptyFieldStatus = this.isEmptyField(lastname, "apellido", isEmptyFieldStatus);
        isEmptyFieldStatus = this.isEmptyField(password, "contrasena", isEmptyFieldStatus);
        isEmptyFieldStatus = this.isEmptyField(initialAmount, "saldo inicial", isEmptyFieldStatus);

        if (!isEmptyFieldStatus) {
            try {
                var a = new Account(firstname, lastname, password, Double.parseDouble(initialAmount));
                accountsControllers.addAccount(a);
                listeners.forEach(l -> {
                    l.accountCreated(a);
                });
                clearFields();
            } catch (Exception e) {
                lblGeneralHelp.setText(e.getMessage());
            }

        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        listeners.forEach(l -> {
            l.accountCanceled();
        });
        clearFields();
    }//GEN-LAST:event_btnCancelActionPerformed

    private boolean isEmptyField(String value, String label, boolean isPreviousFieldEmpty) {
        if (value.length() == 0 && !isPreviousFieldEmpty) {
            JOptionPane.showMessageDialog(this, "El campo <" + label + "> es obligatorio.");
        }

        return value.length() == 0;
    }

    private void inputAmountTextChangedHandler(KeyEvent e) {
        if (e.getKeyCode() == 8) {
            return;
        }

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            var event = new ActionEvent(btnSubmit, ActionEvent.ACTION_PERFORMED, "Anything");

            for (ActionListener listener : btnSubmit.getActionListeners()) {
                listener.actionPerformed(event);
            }
            
            return;
        }

        if (e.getKeyChar() >= '0' && e.getKeyChar() <= '9') {
            inputInitialAmount.setEditable(true);
            lblInitialAmountHelp.setText("");
        } else {
            inputInitialAmount.setEditable(false);
            lblInitialAmountHelp.setText("Solo se aceptan valores numericos");
        }
    }

    private void clearFields() {
        inputFirstname.setText("");
        inputLastname.setText("");
        inputPassword.setText("");
        inputInitialAmount.setText("");
        lblContrasenaHelp.setText("");
        lblFirstnameHelp.setText("");
        lblGeneralHelp.setText("");
        lblInitialAmountHelp.setText("");
        lblLastnameHelp.setText("");
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("123");

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            System.out.println("123");

            var event = new ActionEvent(btnSubmit, ActionEvent.ACTION_PERFORMED, "Anything");

            for (ActionListener listener : btnSubmit.getActionListeners()) {
                listener.actionPerformed(event);
            }
        }

    }

    public interface AccountListener {

        void accountCreated(Account a);

        void accountCanceled();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JTextField inputFirstname;
    private javax.swing.JTextField inputInitialAmount;
    private javax.swing.JTextField inputLastname;
    private javax.swing.JTextField inputPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblContrasenaHelp;
    private javax.swing.JLabel lblFirstnameHelp;
    private javax.swing.JLabel lblGeneralHelp;
    private javax.swing.JLabel lblInitialAmountHelp;
    private javax.swing.JLabel lblLastnameHelp;
    // End of variables declaration//GEN-END:variables
}
