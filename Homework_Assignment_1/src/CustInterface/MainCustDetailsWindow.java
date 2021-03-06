/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustInterface;
import CustDetails.Customer;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;

/**
 *
 * @author Rohan
 */
public class MainCustDetailsWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainCustDetailsWindow
     */
    private Customer customer;
    //private JscrollPane scrollPane;
    public MainCustDetailsWindow() {
        initComponents();
        this.customer=new Customer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPane = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        enterpersonalinfojPanel = new javax.swing.JPanel();
        Enterpersonalinfobtn = new javax.swing.JButton();
        viewpersonalinfobtn = new javax.swing.JButton();
        viewpersonalinfojPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SplitPane.setDividerLocation(450);

        jLabel1.setText("jLabel1");
        SplitPane.setRightComponent(jLabel1);

        enterpersonalinfojPanel.setPreferredSize(new java.awt.Dimension(400, 808));

        Enterpersonalinfobtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Enterpersonalinfobtn.setText("Enter personal information");
        Enterpersonalinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterpersonalinfobtnActionPerformed(evt);
            }
        });

        viewpersonalinfobtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewpersonalinfobtn.setText("View Personal Information");
        viewpersonalinfobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpersonalinfobtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout enterpersonalinfojPanelLayout = new javax.swing.GroupLayout(enterpersonalinfojPanel);
        enterpersonalinfojPanel.setLayout(enterpersonalinfojPanelLayout);
        enterpersonalinfojPanelLayout.setHorizontalGroup(
            enterpersonalinfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, enterpersonalinfojPanelLayout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(enterpersonalinfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewpersonalinfobtn)
                    .addComponent(Enterpersonalinfobtn))
                .addGap(38, 38, 38))
        );
        enterpersonalinfojPanelLayout.setVerticalGroup(
            enterpersonalinfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(enterpersonalinfojPanelLayout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(Enterpersonalinfobtn)
                .addGap(266, 266, 266)
                .addComponent(viewpersonalinfobtn)
                .addContainerGap(529, Short.MAX_VALUE))
        );

        SplitPane.setLeftComponent(enterpersonalinfojPanel);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(51, 51, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Username:");

        jTextField1.setFont(new java.awt.Font("Times New Roman", 0, 21)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 0, 51));
        jTextField1.setText("Enter your username");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Password:");

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("LOGIN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jButton2)
                        .addGap(385, 385, 385)
                        .addComponent(jButton1)))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout viewpersonalinfojPanelLayout = new javax.swing.GroupLayout(viewpersonalinfojPanel);
        viewpersonalinfojPanel.setLayout(viewpersonalinfojPanelLayout);
        viewpersonalinfojPanelLayout.setHorizontalGroup(
            viewpersonalinfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpersonalinfojPanelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        viewpersonalinfojPanelLayout.setVerticalGroup(
            viewpersonalinfojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewpersonalinfojPanelLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(350, Short.MAX_VALUE))
        );

        SplitPane.setRightComponent(viewpersonalinfojPanel);

        getContentPane().add(SplitPane, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewpersonalinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpersonalinfobtnActionPerformed
        // TODO add your handling code here:
        ViewCust viewcust = new ViewCust(customer);

        SplitPane.setRightComponent(viewcust);
    }//GEN-LAST:event_viewpersonalinfobtnActionPerformed

    private void EnterpersonalinfobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterpersonalinfobtnActionPerformed
        // TO LET THE CUSTOMER ENTER HIS/HER PERSONAL INFORMATION

        CreateCust createcust = new CreateCust (customer);
        SplitPane.setRightComponent(createcust);
    }//GEN-LAST:event_EnterpersonalinfobtnActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String password = jPasswordField1.getText();
        String username = jTextField1.getText();
        if (password.contains("rohan") && (username.contains("naik.ro")))
        {
            JOptionPane.showMessageDialog(null,"Successful Login. Click on Enter Personal Information button to proceed");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Login Error. Please enter valid credentials!"); 
                    //JOptionPane.ERROR_MESSAGE;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainCustDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainCustDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainCustDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainCustDetailsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainCustDetailsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enterpersonalinfobtn;
    private javax.swing.JSplitPane SplitPane;
    private javax.swing.JPanel enterpersonalinfojPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton viewpersonalinfobtn;
    private javax.swing.JPanel viewpersonalinfojPanel;
    // End of variables declaration//GEN-END:variables
}
