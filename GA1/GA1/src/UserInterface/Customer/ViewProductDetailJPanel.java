/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.MarketOffer;
import Business.MarketOfferCatalog;
import Business.Product;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohan
 */
public class ViewProductDetailJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateProductJPanel
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private JPanel userProcessContainer;
    private Product product;
    private MarketOfferCatalog marketOfferCatalog;

    public ViewProductDetailJPanel(JPanel upc, Product p, MarketOfferCatalog marketOfferCatalog) {
        initComponents();
        userProcessContainer = upc;
        product = p;
        marketOfferCatalog = marketOfferCatalog;
        nameField.setText(p.getProdname());
        idField.setText(String.valueOf(p.getProductId()));
        txtAvail.setText(String.valueOf(p.getAvail()));

        DefaultTableModel model = (DefaultTableModel) viewProductDetailsJTable.getModel();
        model.setRowCount(0);
        for (MarketOffer marketOffer : marketOfferCatalog.getMarketOfferList()) {
            if (marketOffer.getProduct().getProdname().equalsIgnoreCase(p.getProdname())) {
                Object row[] = new Object[5];
                row[0] = marketOffer.getMarket().getMarketName();
                row[1] = marketOffer.getFloorPrice();
                row[2] = marketOffer.getMarketOfferPrice();
                row[3] = marketOffer.getCeilingPrice();
                row[4] = marketOffer;
                model.addRow(row);
            }
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        backButton1 = new javax.swing.JButton();
        idField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAvail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewProductDetailsJTable = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW PRODUCT DETAIL");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 29, 630, 60));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Product Name:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 140, 40));

        nameField.setEditable(false);
        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nameField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 200, 40));

        backButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        backButton1.setText("<< BACK");
        backButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButton1ActionPerformed(evt);
            }
        });
        add(backButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 740, 140, 40));

        idField.setEditable(false);
        idField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 200, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Product ID:");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 140, 40));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Availability");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 140, 40));

        txtAvail.setEditable(false);
        add(txtAvail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 200, 40));

        viewProductDetailsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Market", "Floor Price", "Target Price", "Ceiling Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(viewProductDetailsJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, -1, 140));
    }// </editor-fold>//GEN-END:initComponents

    private void backButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton1;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField txtAvail;
    private javax.swing.JTable viewProductDetailsJTable;
    // End of variables declaration//GEN-END:variables

}
