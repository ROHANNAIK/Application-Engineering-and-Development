/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohan
 */
public class ManufacturerNameJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerNameJPanel
     */
     private AirplaneDirectory ad;
    private Airplane ap;
    private String anumber;
    public ManufacturerNameJPanel(AirplaneDirectory ad) {
        initComponents();
        this.ad = ad;
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
        ManfnamejTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        ManfnamejTextField = new javax.swing.JTextField();
        searchMannamejButton = new javax.swing.JButton();

        ManfnamejTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ManfnamejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Manufacturer Name", "Manufacture Year", "Airport Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ManfnamejTable.setAlignmentX(2.0F);
        ManfnamejTable.setAlignmentY(2.0F);
        ManfnamejTable.setIntercellSpacing(new java.awt.Dimension(3, 3));
        jScrollPane1.setViewportView(ManfnamejTable);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Enter Airliner Name:");

        searchMannamejButton.setText("Search");
        searchMannamejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMannamejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(45, 45, 45)
                        .addComponent(ManfnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117)
                        .addComponent(searchMannamejButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ManfnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchMannamejButton))
                .addGap(132, 132, 132)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(295, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchMannamejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMannamejButtonActionPerformed
        // TODO add your handling code here:
         int i = 0, k=0;
        System.out.println("search");
        try
        {
            System.out.println("in try");
            anumber = ManfnamejTextField.getText();
            System.out.println(anumber);
        }
        catch(Exception e)
        {
            System.out.println("Some Exception");
            JOptionPane.showMessageDialog(null, "Plese enter correct values");
            i = 1;
        }
        System.out.println(ad.getAirplaneDirectory().size());
              
        
        
        
        for (Airplane ap : ad.getAirplaneDirectory())
        {
            System.out.println("In for");
          Object data[] = new Object[4];
        
        //String x = ap.getFlightNumber();
        if(anumber.equalsIgnoreCase(ap.getAirlinesName()))
        {
            k=1;
        data[0] = ap.getFlightNumber();
        data[1] = ap.getManufacName();
        data[2] = ap.getManufacYear();
        data[3] = ap.getAirportName();
        DefaultTableModel dm = (DefaultTableModel)ManfnamejTable.getModel();
        //dm.setRowCount(0);
        dm.addRow(data);
        }
        }
        if(k==0)
        {
            JOptionPane.showMessageDialog(null, "Invalid Input. No such airlines operator. Plese enter correct values");
        }
    }//GEN-LAST:event_searchMannamejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ManfnamejTable;
    private javax.swing.JTextField ManfnamejTextField;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchMannamejButton;
    // End of variables declaration//GEN-END:variables
}
