/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.Airplane;
import Business.AirplaneDirectory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohan
 */
  
public class AvailibilityofSeatsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AvailibilityofSeatsJPanel
     */
    private AirplaneDirectory ad;
    private Airplane ap;
    private int anumber;
    private int maxnumber;
    public AvailibilityofSeatsJPanel(AirplaneDirectory ad) {
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

        jLabel1 = new javax.swing.JLabel();
        seatavialminjTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        AvailseatsjTable = new javax.swing.JTable();
        searchseatavailjButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        maxseatavailjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Find the aircraft with minimum:");

        AvailseatsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Airlines Name", "Airport Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(AvailseatsjTable);

        searchseatavailjButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchseatavailjButton.setText("Search");
        searchseatavailjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchseatavailjButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("seats and maximum");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("seats.");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("(Flights with maximum availability of 50 seats are only open for bookings)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seatavialminjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(maxseatavailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(searchseatavailjButton)
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(seatavialminjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchseatavailjButton)
                    .addComponent(jLabel2)
                    .addComponent(maxseatavailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(324, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchseatavailjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchseatavailjButtonActionPerformed
        // TODO add your handling code here:
        int i = 0, k=0;
        System.out.println("search");
        try
        {
            System.out.println("in try");
            anumber = Integer.parseInt(seatavialminjTextField.getText());
            maxnumber = Integer.parseInt(maxseatavailjTextField.getText());
         
            System.out.println(anumber);
        }
        catch(Exception e)
        {
            System.out.println("Some Exception");
            JOptionPane.showMessageDialog(null, "Plese enter correct values");
            i = 1;
        }
        System.out.println(ad.getAirplaneDirectory().size());
              
        
         
        //dm.setRowCount(0);
        
        for (Airplane ap : ad.getAirplaneDirectory())
        {
            System.out.println("In for");
          Object data[] = new Object[4];
        
        //String x = ap.getFlightNumber();
        if(anumber >= 10 && maxnumber <= 50)
        {
            k=1;
        data[0] = ap.getFlightNumber();
        data[1] = ap.getModelNumber();
        //data[2] = ap.getManufacYear();
        data[2] = ap.getAirportName();
        DefaultTableModel dm = (DefaultTableModel)AvailseatsjTable.getModel();
        dm.addRow(data);
        }
        }
        if(k==0)
        {
            JOptionPane.showMessageDialog(null, "Invalid Entry. Plese enter correct values");
        }
        
        
    }//GEN-LAST:event_searchseatavailjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AvailseatsjTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maxseatavailjTextField;
    private javax.swing.JButton searchseatavailjButton;
    private javax.swing.JTextField seatavialminjTextField;
    // End of variables declaration//GEN-END:variables
}