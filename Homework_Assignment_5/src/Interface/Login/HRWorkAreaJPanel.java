/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.Login;

import Business.Business;
import Business.UserAccDirectory;
import Business.UserClass;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rohan
 */
public class HRWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccDirectory userAccDirect;
    private UserClass uc;
    private Business b;
    /**
     * Creates new form HRWorkAreaJPanel
     */


 public   HRWorkAreaJPanel(JPanel upc, UserClass uc, Business b) {
       initComponents();
       this.userProcessContainer = upc;
       this.userAccDirect = userAccDirect;
       this.uc = uc;
       this.b = b;
        //if (password.contains("admin") && (username.contains("admin")))
        //fnamejTextField.setText(p.getFirstName("Admin"));
         //p.getFirstName('Admin');
        //fnamejTextField.add(p);
        fnamejTextField1.setText(uc.getPerson().getFirstName());
        LnamejTextField1.setText(uc.getPerson().getLasttName());
        unamejTextField1.setText(uc.getUserName());
        managerolejTextField1.setText(uc.getUserAccType());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unamejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fnamejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        LnamejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        managerolejTextField = new javax.swing.JTextField();
        manageUserAccountjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        unamejTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fnamejTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        LnamejTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        managerolejTextField1 = new javax.swing.JTextField();
        managepersonAccountjButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        unamejTextField.setEditable(false);

        jLabel2.setText("First Name:");

        fnamejTextField.setEditable(false);
        fnamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnamejTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name:");

        LnamejTextField.setEditable(false);
        LnamejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnamejTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("User Role:");

        managerolejTextField.setEditable(false);

        manageUserAccountjButton.setText("Manage User Accounts >>");
        manageUserAccountjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageUserAccountjButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("You logged in as:");

        jLabel4.setText("UserName:");

        unamejTextField1.setEditable(false);
        unamejTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("First Name:");

        fnamejTextField1.setEditable(false);
        fnamejTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        fnamejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnamejTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Last Name:");

        LnamejTextField1.setEditable(false);
        LnamejTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LnamejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LnamejTextField1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("User Role:");

        managerolejTextField1.setEditable(false);
        managerolejTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        managepersonAccountjButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        managepersonAccountjButton1.setText("Manage Person Accounts >>");
        managepersonAccountjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managepersonAccountjButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("You logged in as:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("UserName:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LnamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(managerolejTextField1)
                            .addComponent(unamejTextField1))))
                .addContainerGap(551, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(managepersonAccountjButton1)
                .addGap(137, 137, 137))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fnamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(LnamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(managerolejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addComponent(managepersonAccountjButton1)
                .addContainerGap(133, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void fnamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnamejTextFieldActionPerformed

    private void LnamejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnamejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnamejTextFieldActionPerformed

    private void manageUserAccountjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageUserAccountjButtonActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_manageUserAccountjButtonActionPerformed

    private void fnamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnamejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnamejTextField1ActionPerformed

    private void LnamejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LnamejTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LnamejTextField1ActionPerformed

    private void managepersonAccountjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managepersonAccountjButton1ActionPerformed
        // TODO add your handling code here:
        ManagePersonDirectJPanel awajp = new ManagePersonDirectJPanel(userProcessContainer, b);
        userProcessContainer.add("ManagePersonDirectJPanel",awajp);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_managepersonAccountjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LnamejTextField;
    private javax.swing.JTextField LnamejTextField1;
    private javax.swing.JTextField fnamejTextField;
    private javax.swing.JTextField fnamejTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton manageUserAccountjButton;
    private javax.swing.JButton managepersonAccountjButton1;
    private javax.swing.JTextField managerolejTextField;
    private javax.swing.JTextField managerolejTextField1;
    private javax.swing.JTextField unamejTextField;
    private javax.swing.JTextField unamejTextField1;
    // End of variables declaration//GEN-END:variables
}