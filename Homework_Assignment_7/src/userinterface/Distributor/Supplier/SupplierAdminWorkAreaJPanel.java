/*
 * AdminWorkAreaJPanel.java
 *
 * Created on October 10, 2008, 8:50 AM
 */
package userinterface.Distributor.Supplier;

import Business.Clinic.Pharmacy;
import userinterface.Hospital.Clinic.*;
import Business.EcoSystem;
import userinterface.Hospital.*;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicOrganization;
import Business.Organization.Organization;
import Business.Organization.SupplierOrganization;
import Business.Supplier.Supplier;
import Business.Supplier.Vaccine;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.SupplierWorkRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class SupplierAdminWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount account;
    SupplierOrganization organization;
    Enterprise enterprise;
    EcoSystem business;
    Supplier s;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public SupplierAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, SupplierOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = organization;
        for (Supplier supplier : organization.getSupplierList().getSupplierList()) {
            if (account.getEmployee().getName().equals(supplier.getSupplierName())) {
                s = supplier;
                System.out.println("supplier name" + s.getSupplierName());
            }
        }
        System.out.println("busi" + business.getWorkQueue().getWorkRequestList().size());
        if (s.getWorkQueue() == null) {
            WorkQueue w = new WorkQueue();
            s.setWorkQueue(w);
        }
        populateCombo();
        populateWorkQueueTable();
        populateAvailable();
    }

    public void populateCombo() {
        for (Vaccine vaccine : business.getVaccineList().getVaccineList()) {
            comboVaccine.addItem(vaccine);
        }

    }

    public void populateWorkQueueTable() {
        DefaultTableModel model = (DefaultTableModel) requestTable.getModel();

        model.setRowCount(0);

        for (WorkRequest work : s.getWorkQueue().getWorkRequestList()) {
            if (work instanceof SupplierWorkRequest) {
                Object[] row = new Object[5];
                row[0] = work.getVaccine().getVaccineName();
                row[1] = ((SupplierWorkRequest) work).getQuantity();
                row[2] = work;
                row[3] = work.getReceiver();
                row[4] = work.getSender();
                model.addRow(row);
            }
        }
    }

    public void populateAvailable() {
        DefaultTableModel model = (DefaultTableModel) availableTable.getModel();

        model.setRowCount(0);

        for (Vaccine vaccine : s.getVaccineList().getVaccineList()) {

            Object[] row = new Object[2];
            row[0] = vaccine.getVaccineName();
            row[1] = vaccine.getQuantity();
            model.addRow(row);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        btnComplete = new javax.swing.JButton();
        reqBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        availableTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        requestTable = new javax.swing.JTable();
        comboVaccine = new javax.swing.JComboBox();
        txtquant = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        sellBtn = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Supplier Work Area -Adminstrative Role");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, 20));

        btnComplete.setText("Complete");
        btnComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteActionPerformed(evt);
            }
        });
        add(btnComplete, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 140, -1));

        reqBtn.setText("Assign To Me");
        reqBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqBtnActionPerformed(evt);
            }
        });
        add(reqBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 120, -1));

        availableTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(availableTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 500, 90));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Vaccines Requested");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 170, 30));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Vaccines Available");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, 30));

        requestTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaccine Name", "Quantity", "Status", "Receiver", "Sender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(requestTable);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 500, 90));

        add(comboVaccine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 120, -1));
        add(txtquant, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 100, -1));

        jLabel2.setText("Vaccine Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 90, 20));

        backJButton.setText("Refresh");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));

        sellBtn.setText("Add Vaccine");
        sellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellBtnActionPerformed(evt);
            }
        });
        add(sellBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 170, -1));

        btnDelete.setText("Delete request");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            SupplierWorkRequest p = (SupplierWorkRequest) requestTable.getValueAt(selectedRow, 2);

            if (p.getReceiver() != null) {
                if (p.getStatus().equals("Pending")) {
                    UserAccount a = p.getSender();
                    if (s.getVaccineList().getVaccineList().size() <= 0) {
                        JOptionPane.showMessageDialog(null, "No Stock available. Request from Supplier");
                        return;
                    }
                    for (Vaccine v : s.getVaccineList().getVaccineList()) {
                        if (p.getVaccine().getVaccineName().equals(v.getVaccineName())) {
                            if (v.getQuantity() - p.getQuantity() < 0) {
                                JOptionPane.showMessageDialog(null, "No enough Vaccines for supply. Wait for sometime");
                                return;
                            }
                            v.setQuantity(v.getQuantity() - p.getQuantity());
                        } else {
                            JOptionPane.showMessageDialog(null, "No Stock available. Request from Supplier.");
                        }
                    }
                    p.setStatus("Complete");
                    JOptionPane.showMessageDialog(null, "You have successfully completed the request");
                    populateWorkQueueTable();
                    populateAvailable();
                } else {
                    JOptionPane.showMessageDialog(null, "You cannot complete it two times.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please assign first");
            }

        }
    }//GEN-LAST:event_btnCompleteActionPerformed

    private void reqBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqBtnActionPerformed
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to assign the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            SupplierWorkRequest p = (SupplierWorkRequest) requestTable.getValueAt(selectedRow, 2);

            p.setStatus("Pending");
            p.setReceiver(account);

            populateWorkQueueTable();

        }
//        SupplierWorkRequest request= new SupplierWorkRequest();
//        request.setVaccine((Vaccine)comboVaccine.getSelectedItem());
//        request.setQuantity(Integer.parseInt(txtquant.getText()));
//        request.setStatus("Requested");
//        request.setSender(account);
//        //organization.getWorkQueue().getWorkRequestList().add(request);
//        s.getWorkQueue().getWorkRequestList().add(request);
//        populateWorkQueueTable();

    }//GEN-LAST:event_reqBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        new SupplierAdminWorkAreaJPanel(userProcessContainer, account, organization, enterprise, business);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void sellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellBtnActionPerformed
        // TODO add your handling code here:
        int quant = Integer.parseInt(txtquant.getText());
        Vaccine v = (Vaccine) comboVaccine.getSelectedItem();
        int temp = 0;
        for (Vaccine vaccine : s.getVaccineList().getVaccineList()) {
            if (v.getVaccineName().equals(vaccine.getVaccineName())) {
                temp = 1;
                vaccine.setQuantity(vaccine.getQuantity() + quant);
            }
        }

        if (temp == 0) {
            Vaccine vac = s.getVaccineList().addVaccine();
            vac.setQuantity(quant);
            vac.setDisease(v.getDisease());
            vac.setVaccineName(v.getVaccineName());
        }
        populateAvailable();
    }//GEN-LAST:event_sellBtnActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = requestTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select the row to delete the account", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {

            PharmacyWorkRequest p = (PharmacyWorkRequest) requestTable.getValueAt(selectedRow, 2);

            s.getWorkQueue().getWorkRequestList().remove(p);
            business.getWorkQueue().getWorkRequestList().remove(p);

            JOptionPane.showMessageDialog(null, "You have successfully deleted the account");
            populateWorkQueueTable();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable availableTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnComplete;
    private javax.swing.JButton btnDelete;
    private javax.swing.JComboBox comboVaccine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton reqBtn;
    private javax.swing.JTable requestTable;
    private javax.swing.JButton sellBtn;
    private javax.swing.JTextField txtquant;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables

}
