
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.Supplier;

import Business.Business;
import Business.Product;
import Business.Suppliers;
import UserInterface.Supplier.ManageProductCatalogJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Rohan
 */
public class CreateNewProductJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Suppliers supplier;
    private Business business;
    public CreateNewProductJPanel(JPanel upc, Suppliers s, Business business){
        initComponents();
        this.userProcessContainer = upc;
        this.supplier = s;
        this.business = business;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        clrjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        availtxt = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE NEW PRODUCT");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 42, 780, 70));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setText("<< BACK");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 150, 60));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Product Name:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, 50));

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 250, 50));

        clrjButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        clrjButton.setText("CLEAR");
        clrjButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clrjButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clrjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrjButtonActionPerformed(evt);
            }
        });
        add(clrjButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, 150, 60));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Availability:");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 160, 50));

        availtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        availtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availtxtActionPerformed(evt);
            }
        });
        add(availtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 250, 50));

        btnCreate.setText("CREATE PRODUCT");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 430, -1, -1));

        jLabel2.setText("PRICE:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 250, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageProductCatalogJPanel manageProductCatalogJPanel = (ManageProductCatalogJPanel) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void clrjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrjButtonActionPerformed
        // TODO add your handling code here:
        txtName.setText("");
    }//GEN-LAST:event_clrjButtonActionPerformed

    private void availtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_availtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_availtxtActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        Product p = supplier.getProductCatalog().addProduct();
        p.setProdname(txtName.getText());
        p.setAvail(Integer.parseInt(availtxt.getText()));
        p.setPrice(Integer.parseInt(txtPrice.getText()));
        JOptionPane.showMessageDialog(null, "Product added!", "Info", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availtxt;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton clrjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
