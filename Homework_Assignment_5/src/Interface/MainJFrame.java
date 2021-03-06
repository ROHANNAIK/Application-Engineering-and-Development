/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.*;
import Business.UserAccDirectory;
import Interface.Login.LoginJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rohan
 */
public class MainJFrame extends javax.swing.JFrame {

    private UserAccDirectory userAccDirect;
    private PersonDirectory personDirect; 
    private Business b;
    //private JPanel userProcessContainer;
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        this.b = ConfigureABusiness.Initialize("user");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        UserProcessContainer = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        mainFrameLoginjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(180);

        UserProcessContainer.setLayout(new java.awt.CardLayout());

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/employee-Management-System.jpg"))); // NOI18N
        UserProcessContainer.add(jLabel1, "card2");

        jSplitPane1.setRightComponent(UserProcessContainer);

        mainFrameLoginjButton.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        mainFrameLoginjButton.setText("Login");
        mainFrameLoginjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainFrameLoginjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFrameLoginjButton)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(247, 247, 247)
                .addComponent(mainFrameLoginjButton)
                .addContainerGap(316, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainFrameLoginjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainFrameLoginjButtonActionPerformed
        // TODO add your handling code here:
        LoginJPanel awajp = new LoginJPanel(UserProcessContainer, b);
        UserProcessContainer.add("LoginJPanel",awajp);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.next(UserProcessContainer);
        
    }//GEN-LAST:event_mainFrameLoginjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserProcessContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton mainFrameLoginjButton;
    // End of variables declaration//GEN-END:variables
}
