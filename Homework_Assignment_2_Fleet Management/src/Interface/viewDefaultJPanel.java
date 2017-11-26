/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airplane;
import Business.AirplaneDirectory;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohan
 */
public class viewDefaultJPanel extends javax.swing.JPanel {

    /**
     * Creates new form viewDefaultJPanel
     */
    private AirplaneDirectory ad;
    private Airplane ap;
    public viewDefaultJPanel(AirplaneDirectory ad) 
    {
        initComponents();
        this.ad = ad;
        populateTable(); 
    }
 
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel)viewDefaultjTable.getModel() ;
        dtm.setRowCount(0); 
        
        for(Airplane ap : ad.getAirplaneDirectory())
        {
            Object data[] = new Object[4];
             data[0] = ap.getAirlinesName();
             data[1] = ap.getFlightNumber();
             data[2] = ap.getManufacName();
             data[3] = ap.getAirportName();
             dtm.addRow(data);
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
        viewDefaultjTable = new javax.swing.JTable();
        manNamejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        airportNamejTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        airnamejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        flightNumberjTextField = new javax.swing.JTextField();
        jLabel = new javax.swing.JLabel();
        updatejButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        clearjButton = new javax.swing.JButton();
        DatejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        viewDefaultjTable.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        viewDefaultjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airlines Name", "Flight Number", "Manufacturer Name", "Airport Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        viewDefaultjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDefaultjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewDefaultjTable);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setText("Airport Name:");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Airlines Name:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setText("Flight Number:");

        jLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel.setText("Manufacturer Name:");

        updatejButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        deletejButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        deletejButton.setText("Delete");
        deletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletejButtonActionPerformed(evt);
            }
        });

        clearjButton.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        clearjButton.setText("Clear");
        clearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearjButtonActionPerformed(evt);
            }
        });

        DatejTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Last Modified Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(DatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(updatejButton)
                        .addGap(103, 103, 103)
                        .addComponent(deletejButton)
                        .addGap(92, 92, 92)
                        .addComponent(clearjButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(235, 235, 235)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2)
                        .addComponent(jLabel)
                        .addComponent(jLabel4))
                    .addGap(133, 133, 133)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(airnamejTextField)
                        .addComponent(flightNumberjTextField)
                        .addComponent(manNamejTextField)
                        .addComponent(airportNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(235, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 425, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatejButton)
                    .addComponent(deletejButton)
                    .addComponent(clearjButton))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(249, 249, 249)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(airnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(flightNumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel)
                        .addComponent(manNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(44, 44, 44)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(airportNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(249, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewDefaultjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDefaultjTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = viewDefaultjTable.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel)viewDefaultjTable.getModel();
        airnamejTextField.setText(dtm.getValueAt(selectedRow, 0).toString());
        flightNumberjTextField.setText(dtm.getValueAt(selectedRow, 1).toString());
        manNamejTextField.setText(dtm.getValueAt(selectedRow, 2).toString());
        airportNamejTextField.setText(dtm.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_viewDefaultjTableMouseClicked

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        // TODO add your handling code here:
        int i = viewDefaultjTable.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel)viewDefaultjTable.getModel();
        if(i >= 0)
        {
        {
            dtm.setValueAt(airnamejTextField.getText(), i, 0);
            dtm.setValueAt(flightNumberjTextField.getText(), i, 1);
            dtm.setValueAt(manNamejTextField.getText(), i, 2);
            dtm.setValueAt(airportNamejTextField.getText(), i, 3);
            JOptionPane.showMessageDialog(null,"Data Updated Successfully");
            airnamejTextField.setText("");
            flightNumberjTextField.setText("");
            manNamejTextField.setText("");
            airportNamejTextField.setText("");
        }
        //DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //LocalDate localDate = LocalDate.now();
        //String edate = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDate);
        //SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
       Date d = new Date();
       DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       //System.out.println(df.format(d));
        Date date1;
        Time time1;
        //date1 = sdf.parse(edate);
        //time1 = (Time) s.parse(time);
        
        //JOptionPane.showMessageDialog(null, "Latest Update Date"+ date1);
        DatejTextField.setText(df.format(d));
        //TimejTextField.setText(time);
        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select the row to update from the table.");
        }
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void deletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = viewDefaultjTable.getSelectedRow();
        DefaultTableModel dtm = (DefaultTableModel)viewDefaultjTable.getModel();
        if (selectedRow >= 0)
        {
            int cfr = JOptionPane.showConfirmDialog(null, "Are you sure to delete the airplane details");
            if (cfr == 0)
            {
               //ad.deleteFlight(ap);
                dtm.removeRow(viewDefaultjTable.getSelectedRow());
                airnamejTextField.setText("");
                flightNumberjTextField.setText("");
                manNamejTextField.setText("");
                airportNamejTextField.setText("");
                
            }
            JOptionPane.showMessageDialog(null,"Airplane info has been deleted");
        }
        else 
            JOptionPane.showMessageDialog(null,"Please select a row from the table");
        
        
    }//GEN-LAST:event_deletejButtonActionPerformed

    private void clearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearjButtonActionPerformed
        // TODO add your handling code here:
        airnamejTextField.setText("");
        flightNumberjTextField.setText("");
        manNamejTextField.setText("");
        airportNamejTextField.setText("");
    }//GEN-LAST:event_clearjButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DatejTextField;
    private javax.swing.JTextField airnamejTextField;
    private javax.swing.JTextField airportNamejTextField;
    private javax.swing.JButton clearjButton;
    private javax.swing.JButton deletejButton;
    private javax.swing.JTextField flightNumberjTextField;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField manNamejTextField;
    private javax.swing.JButton updatejButton;
    private javax.swing.JTable viewDefaultjTable;
    // End of variables declaration//GEN-END:variables
}