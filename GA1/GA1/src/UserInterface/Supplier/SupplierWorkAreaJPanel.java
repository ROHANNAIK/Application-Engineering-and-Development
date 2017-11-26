package UserInterface.Supplier;

import Business.Business;
import UserInterface.Supplier.ManageProductCatalogJPanel;
import Business.Suppliers;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rohan
 */
public class SupplierWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Suppliers supplier;
    private Business business;
    public SupplierWorkAreaJPanel(JPanel upc, Suppliers s, Business business) {
        initComponents();
        this.userProcessContainer = upc;
        this.supplier = s;
        this.business = business;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        managePButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MY WORK AREA (PRODUCT MANAGER ROLE)");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 790, 90));

        managePButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        managePButton.setText("MANAGE PRODUCT CATALOG");
        managePButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        managePButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        managePButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managePButtonActionPerformed(evt);
            }
        });
        add(managePButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 340, 60));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("MARKET OFFER");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 340, 60));

        jButton2.setText("<< Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void managePButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managePButtonActionPerformed

        ManageProductCatalogJPanel mpcjp = new ManageProductCatalogJPanel(userProcessContainer, supplier, business);
        userProcessContainer.add("ManageProductCatalogJPanel", mpcjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managePButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        MarketOfferJPanel panel1 = new MarketOfferJPanel(userProcessContainer, business, supplier);
        userProcessContainer.add("MarketOfferJPanel", panel1);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                    userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton managePButton;
    // End of variables declaration//GEN-END:variables
}
