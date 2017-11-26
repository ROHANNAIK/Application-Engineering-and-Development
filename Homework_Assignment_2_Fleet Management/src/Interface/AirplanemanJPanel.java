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
public class AirplanemanJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AirplanemanJPanel
     */
    private AirplaneDirectory ad;
    private Airplane ap;
    private String anumber;
    public AirplanemanJPanel(AirplaneDirectory ad) {
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
        airplanenamejTextField = new javax.swing.JTextField();
        searchairplanenamejButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        manufacnamejTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Aircrafts manufactured by:");

        searchairplanenamejButton.setText("Search");
        searchairplanenamejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchairplanenamejButtonActionPerformed(evt);
            }
        });

        manufacnamejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Model Number", "Manufacture Year", "Airport Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(manufacnamejTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(airplanenamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(searchairplanenamejButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(airplanenamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchairplanenamejButton))
                .addGap(118, 118, 118)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchairplanenamejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchairplanenamejButtonActionPerformed
        // TODO add your handling code here:
        int i = 0, k=0;
        System.out.println("search");
        try
        {
            System.out.println("in try");
            anumber = airplanenamejTextField.getText();
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
        if(anumber.equalsIgnoreCase(ap.getManufacName()))
        {
            k=1;
        data[0] = ap.getFlightNumber();
        data[1] = ap.getModelNumber();
        data[2] = ap.getManufacYear();
        data[3] = ap.getAirportName();
        DefaultTableModel dm = (DefaultTableModel)manufacnamejTable.getModel();
        dm.addRow(data);
        }
        }
        if(k==0)
        {
            JOptionPane.showMessageDialog(null, "Invalid entry. Plese enter correct Airplane Manufacturer Name");
        }
        
    }//GEN-LAST:event_searchairplanenamejButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField airplanenamejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manufacnamejTable;
    private javax.swing.JButton searchairplanenamejButton;
    // End of variables declaration//GEN-END:variables
}