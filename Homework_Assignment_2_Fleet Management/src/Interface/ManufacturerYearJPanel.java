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
public class ManufacturerYearJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManufacturerYearJPanel
     */
     private AirplaneDirectory ad;
    private Airplane ap;
    private int anumber;
    public ManufacturerYearJPanel(AirplaneDirectory ad) {
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
        manyearjTextField = new javax.swing.JTextField();
        searchmanyearjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        manyearjTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Enter the aircraft manufacture year:");

        searchmanyearjButton.setText("Search");
        searchmanyearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchmanyearjButtonActionPerformed(evt);
            }
        });

        manyearjTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        manyearjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Model Number", "Airlines Name", "Manufacturer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        manyearjTable.setAlignmentX(2.0F);
        manyearjTable.setAlignmentY(2.0F);
        manyearjTable.setIntercellSpacing(new java.awt.Dimension(3, 3));
        jScrollPane2.setViewportView(manyearjTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manyearjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(searchmanyearjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(manyearjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchmanyearjButton))
                .addGap(149, 149, 149)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchmanyearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchmanyearjButtonActionPerformed
        // TODO add your handling code here:
        int i = 0, k=0;
        System.out.println("search");
        try
        {
            System.out.println("in try");
            anumber = Integer.parseInt(manyearjTextField.getText());
            System.out.println(anumber);
        }
        catch(Exception e)
        {
            System.out.println("Some Exception");
            JOptionPane.showMessageDialog(null, "Invalid Entry. Plese enter correct Manufacture year.");
            i = 1;
        }
        System.out.println(ad.getAirplaneDirectory().size());
              
        
        
        
        for (Airplane ap : ad.getAirplaneDirectory())
        {
            System.out.println("In for");
          Object data[] = new Object[4];
        
        //String x = ap.getFlightNumber();
        if(anumber == ap.getManufacYear())
        {
            k=1;
        data[0] = ap.getFlightNumber();
        data[1] = ap.getModelNumber();
        data[2] = ap.getAirlinesName();
        data[3] = ap.getManufacName();
        DefaultTableModel dm = (DefaultTableModel)manyearjTable.getModel();
        dm.addRow(data);
        }
        }
        if(k==0)
        {
            JOptionPane.showMessageDialog(null, "Invalid Entry. No such Manufacture year.");
        }
        
    }//GEN-LAST:event_searchmanyearjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable manyearjTable;
    private javax.swing.JTextField manyearjTextField;
    private javax.swing.JButton searchmanyearjButton;
    // End of variables declaration//GEN-END:variables
}
