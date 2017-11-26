
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Adminworkarea;
import Business.Product;
import Business.Suppliers;
import Business.SupplierDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohan
 */
public class ViewSupplier extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Suppliers supplier;
    
    public ViewSupplier(JPanel upc, Suppliers s) {
        initComponents();
        userProcessContainer = upc;
        supplier = s;
        supplierName.setText(s.getSupplierName());
        refreshTable();
    }

    public void refreshTable(){
        int rowCount = productCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel) productCatalog.getModel();
        for(int i=rowCount - 1;i>=0;i--){
            model.removeRow(i);
        }
        for(Product p: supplier.getProductCatalog().getProductCatalog()){
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getProductId();
            row[2] = 0;
            model.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        supplierName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productCatalog = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        supplierName.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        supplierName.setForeground(new java.awt.Color(0, 102, 102));
        supplierName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        supplierName.setText("VIEW SUPPLIER");
        supplierName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        supplierName.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        add(supplierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 24, 809, 90));

        productCatalog.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        productCatalog.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        productCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "productName", "modelNumber", "price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(productCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 170, 760, 260));

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setText("<< BACK");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 492, 200, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
      userProcessContainer.remove(this);
      CardLayout layout = (CardLayout) userProcessContainer.getLayout();
      layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productCatalog;
    private javax.swing.JLabel supplierName;
    // End of variables declaration//GEN-END:variables
}
