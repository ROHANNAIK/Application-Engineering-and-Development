/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Account;
import Business.AccountDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohan
 */
public class ManageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageJPanel
     */
    private JPanel UserProcessContainer;
    private AccountDirectory accountDirectory;

    ManageJPanel(JPanel UserProcessContainer, AccountDirectory accountDirectory) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.accountDirectory = accountDirectory;
        
        addComponentListener(new ComponentAdapter()
                {
                    @Override
                    public void componentShown(ComponentEvent evt){
                    populateTable();
                }
                });
    }
     
    private void populateTable() {
        DefaultTableModel dm = (DefaultTableModel)accdetailsjTable.getModel();
        dm.setRowCount(0);
        for (Account account : accountDirectory.getAccountList()){
            Object [] row  = new Object [4];
            row[0]=account;
            row[1]=account.getRoutingNumber();
            row[2]=account.getAccountNumber();
            row[3]=account.getBalance();
            
            dm.addRow(row);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        accdetailsjTable = new javax.swing.JTable();
        viewDetailsjButton = new javax.swing.JButton();
        deleteDetailsjButton = new javax.swing.JButton();
        searchAccNumjButton = new javax.swing.JButton();
        accnumjTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();

        accdetailsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bank Name", "Routing Number", "Account Number", "Balance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(accdetailsjTable);
        if (accdetailsjTable.getColumnModel().getColumnCount() > 0) {
            accdetailsjTable.getColumnModel().getColumn(0).setResizable(false);
            accdetailsjTable.getColumnModel().getColumn(1).setResizable(false);
            accdetailsjTable.getColumnModel().getColumn(2).setResizable(false);
            accdetailsjTable.getColumnModel().getColumn(3).setResizable(false);
        }

        viewDetailsjButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        viewDetailsjButton.setText("View Details");
        viewDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsjButtonActionPerformed(evt);
            }
        });

        deleteDetailsjButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        deleteDetailsjButton.setText("Delete Account");
        deleteDetailsjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDetailsjButtonActionPerformed(evt);
            }
        });

        searchAccNumjButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        searchAccNumjButton.setText("Search by Account Number");
        searchAccNumjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchAccNumjButtonActionPerformed(evt);
            }
        });

        backjButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        backjButton.setText("<< Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(282, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteDetailsjButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(viewDetailsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(searchAccNumjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(47, 47, 47)
                            .addComponent(accnumjTextField))))
                .addGap(232, 232, 232))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backjButton)
                .addGap(65, 65, 65)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchAccNumjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accnumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewDetailsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteDetailsjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(369, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void deleteDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDetailsjButtonActionPerformed
        // TODO add your handling code here:
         int selectedrow = accdetailsjTable.getSelectedRow();
        if (selectedrow >= 0)
        {
            Account account = (Account)accdetailsjTable.getValueAt(selectedrow,0);
            int cfr = JOptionPane.showConfirmDialog(null, "Are you sure to delete the account details");
            if (cfr == 0)
            {
            accountDirectory.deleteAccount(account);
            }
            JOptionPane.showMessageDialog(null,"Account has been deleted");
            populateTable();
        }
        else 
            JOptionPane.showMessageDialog(null,"Please select a row from the table");
    }//GEN-LAST:event_deleteDetailsjButtonActionPerformed

    private void viewDetailsjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsjButtonActionPerformed
        // TODO add your handling code here:
        
        int selectedrow = accdetailsjTable.getSelectedRow();
        if (selectedrow >= 0)
        {
            Account account = (Account)accdetailsjTable.getValueAt(selectedrow,0);
            ViewAccountsJPanel panel = new ViewAccountsJPanel(UserProcessContainer, account);
            UserProcessContainer.add("ViewAccountsJPanel", panel);
            CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
            layout.next(UserProcessContainer);
        }
        else 
            JOptionPane.showMessageDialog(null,"Please select a row from the table", "Warning", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_viewDetailsjButtonActionPerformed

    private void searchAccNumjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchAccNumjButtonActionPerformed
        // TODO add your handling code here:
         try {
        Account result = accountDirectory.searchAccount(Integer.parseInt(accnumjTextField.getText()));
       
            if(result == null){
            JOptionPane.showMessageDialog(null, "Account Number you entered does not exist", "Information",JOptionPane.INFORMATION_MESSAGE);
        }
            else{
            ViewAccountsJPanel panel = new ViewAccountsJPanel(UserProcessContainer, result);
            UserProcessContainer.add("ViewAccountsJPanel", panel);
            CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
            layout.next(UserProcessContainer); 
                    }
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Account Number you entered does not exist", "Warning",JOptionPane.WARNING_MESSAGE);
        }
 
            
        
        
    }//GEN-LAST:event_searchAccNumjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accdetailsjTable;
    private javax.swing.JTextField accnumjTextField;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton deleteDetailsjButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchAccNumjButton;
    private javax.swing.JButton viewDetailsjButton;
    // End of variables declaration//GEN-END:variables
}
