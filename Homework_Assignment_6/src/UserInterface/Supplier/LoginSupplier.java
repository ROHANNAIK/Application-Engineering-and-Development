

package UserInterface.Supplier;
import Business.Business;
import Business.Suppliers;
import Business.SupplierDirectory;
import UserInterface.Supplier.SupplierWorkAreaJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rohan
 */
public class LoginSupplier extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    //private SupplierDirectory supplierDirectory;
    private Business business;
    public LoginSupplier(JPanel upc, Business business) {
        initComponents();
        userProcessContainer = upc;
       // supplierDirectory = sd;
       this.business=business;
        
        supplierComboBox.removeAllItems();;
        for (Suppliers supplier : business.getSupplierDirectory().getSupplierdirectory()) {
            supplierComboBox.addItem(supplier);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        sNmaeTextField1 = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        supplierComboBox = new javax.swing.JComboBox();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supplier Name");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 230, 50));

        sNmaeTextField1.setEditable(false);
        sNmaeTextField1.setBorder(null);
        add(sNmaeTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 30));

        btnFind.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnFind.setText("PROCEED>>");
        btnFind.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFind.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        add(btnFind, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 230, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SUPPLIER LOGIN");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 750, 80));

        supplierComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierComboBoxActionPerformed(evt);
            }
        });
        add(supplierComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 240, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed

        Suppliers supplier = (Suppliers) supplierComboBox.getSelectedItem();
        SupplierWorkAreaJPanel swajp = new SupplierWorkAreaJPanel(userProcessContainer, supplier);
        userProcessContainer.add("SupplierWorkAreaJPanel", swajp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnFindActionPerformed

    private void supplierComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierComboBoxActionPerformed

    }//GEN-LAST:event_supplierComboBoxActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFind;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField sNmaeTextField1;
    private javax.swing.JComboBox supplierComboBox;
    // End of variables declaration//GEN-END:variables
    
}
