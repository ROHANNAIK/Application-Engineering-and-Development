/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Rohan
 */
public class ViewAccountsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAccountsJPanel
     */
    private JPanel UserProcessContainer;
    private Account account;

    ViewAccountsJPanel(JPanel UserProcessContainer, Account account) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.account = account;
        populateAccountDetails();
        savejButton.setEnabled(false);
        UpdatejButton.setEnabled(true);
    }
 
    private void populateAccountDetails()
    {
        routingNumberjTextField.setText(String.valueOf(account.getRoutingNumber()));
        accountNumberjTextField.setText(String.valueOf(account.getAccountNumber()));
        bankNamejTextField.setText(account.getBankName());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        routingNumberjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        accountNumberjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bankNamejTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        savejButton = new javax.swing.JButton();
        UpdatejButton = new javax.swing.JButton();

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Routing Number");

        routingNumberjTextField.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setText("Account Number");

        accountNumberjTextField.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Bank Name");

        bankNamejTextField.setEnabled(false);

        backjButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        backjButton.setText("<< Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("View Account Details");

        savejButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        savejButton.setText("Save");
        savejButton.setEnabled(false);
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        UpdatejButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        UpdatejButton.setText("Update");
        UpdatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(477, 477, 477)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160)
                .addComponent(savejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 354, Short.MAX_VALUE)
                .addComponent(UpdatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(351, 351, 351)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(62, 62, 62)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(routingNumberjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                        .addComponent(accountNumberjTextField)
                        .addComponent(bankNamejTextField))
                    .addContainerGap(367, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 591, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(103, 103, 103))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(233, 233, 233)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(routingNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(69, 69, 69)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(accountNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(67, 67, 67)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bankNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(339, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void UpdatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatejButtonActionPerformed
            // TODO add your handling code here:
        routingNumberjTextField.setEnabled(true);
        accountNumberjTextField.setEnabled(true);
        bankNamejTextField.setEnabled(true);
        savejButton.setEnabled(true);
        UpdatejButton.setEnabled(false);
    }//GEN-LAST:event_UpdatejButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        // TODO add your handling code here:
        try {
        account.setRoutingNumber(Integer.parseInt(routingNumberjTextField.getText()));
        account.setAccountNumber(Integer.parseInt(accountNumberjTextField.getText()));
        account.setBankName(bankNamejTextField.getText());
        savejButton.setEnabled(false);
        UpdatejButton.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Account updated successfully");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Invalid Entry.Please enter correct values", "Warning",JOptionPane.WARNING_MESSAGE);
        }

       
    }//GEN-LAST:event_savejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdatejButton;
    private javax.swing.JTextField accountNumberjTextField;
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField bankNamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField routingNumberjTextField;
    private javax.swing.JButton savejButton;
    // End of variables declaration//GEN-END:variables
}