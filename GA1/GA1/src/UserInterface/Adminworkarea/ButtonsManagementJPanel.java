/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Adminworkarea;

import Business.Business;
import UserInterface.Customer.CustomerWorkAreaJPanel;
import UserInterface.Customer.ResgisterCustJPanel;
import UserInterface.Supplier.LoginSupplier;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rohan
 */
public class ButtonsManagementJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Business business;
    /**
     * Creates new form ButtonsManagementJPanel
     */


   public ButtonsManagementJPanel(JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        addSupplierjButton = new javax.swing.JButton();
        addProductsjButton = new javax.swing.JButton();
        custManagmentjButton = new javax.swing.JButton();
        btnMonitorSales = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NAVIGATION DASHBOARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        addSupplierjButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addSupplierjButton.setText("ADD SUPPLIERS>>");
        addSupplierjButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addSupplierjButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addSupplierjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSupplierjButtonActionPerformed(evt);
            }
        });

        addProductsjButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addProductsjButton.setText("ADD PRODUCTS>>");
        addProductsjButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addProductsjButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addProductsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductsjButtonActionPerformed(evt);
            }
        });

        custManagmentjButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        custManagmentjButton.setText("CUSTOMER MANAGEMENT>>");
        custManagmentjButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        custManagmentjButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        custManagmentjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custManagmentjButtonActionPerformed(evt);
            }
        });

        btnMonitorSales.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnMonitorSales.setText("MONITOR SALES>>");
        btnMonitorSales.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnMonitorSales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMonitorSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMonitorSalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(custManagmentjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addSupplierjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addProductsjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMonitorSales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(245, 245, 245))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(addSupplierjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(addProductsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(custManagmentjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnMonitorSales, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addSupplierjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSupplierjButtonActionPerformed
        // TODO add your handling code here:
     AdminWorkAreaJPanel aw = new AdminWorkAreaJPanel(userProcessContainer, business);
    userProcessContainer.add("AdminWorkAreaJPanel", aw);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_addSupplierjButtonActionPerformed

    private void addProductsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductsjButtonActionPerformed
        // TODO add your handling code here:
        LoginSupplier ls = new LoginSupplier(userProcessContainer, business);
        userProcessContainer.add("LoginSupplierJPanel", ls);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addProductsjButtonActionPerformed

    private void custManagmentjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custManagmentjButtonActionPerformed
        // TODO add your handling code here:
        ResgisterCustJPanel rp = new ResgisterCustJPanel(userProcessContainer,business);
        userProcessContainer.add("ResgisterCustJPanel", rp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_custManagmentjButtonActionPerformed

    private void btnMonitorSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMonitorSalesActionPerformed
        // TODO add your handling code here:
         UserInterface.MonitorSales.SalesWorkAreaPanel rp = new UserInterface.MonitorSales.SalesWorkAreaPanel(userProcessContainer,business);
        userProcessContainer.add("MonitorSalesJPanel", rp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnMonitorSalesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductsjButton;
    private javax.swing.JButton addSupplierjButton;
    private javax.swing.JButton btnMonitorSales;
    private javax.swing.JButton custManagmentjButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}