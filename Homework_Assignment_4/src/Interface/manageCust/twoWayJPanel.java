/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.manageCust;

import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightSchedule;
import Business.SeatDirectory;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Rohan
 */
public class twoWayJPanel extends javax.swing.JPanel {
private JPanel UserProcessContainer;
private FlightSchedule flightSch;
private SeatDirectory sd;
private CustomerDirectory cd;
private String anumber, anumber1, anumber2, anumber3, anumber4, anumber5, anumber6, anumber7;
    /**
     * Creates new form twoWayJPanel
     */

    public twoWayJPanel(JPanel UserProcessContainer, FlightSchedule flightSch) {
        initComponents();

        this.flightSch = flightSch;

        this.UserProcessContainer = UserProcessContainer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lastNamejTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sourcejTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        destinationjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        firstNamejTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lastNamejTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        sourcejTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        destinationjTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        firstNamejTextField1 = new javax.swing.JTextField();
        searchjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        booktwojTable = new javax.swing.JTable();
        book2jButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jLabel2.setText("Last Name:");

        jLabel4.setText("Source:");

        jLabel5.setText("Destination:");

        destinationjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationjTextFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("First Name:");

        jLabel6.setText("Last Name:");

        jLabel7.setText("Source:");

        jLabel8.setText("Destination:");

        destinationjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationjTextField1ActionPerformed(evt);
            }
        });

        jLabel9.setText("First Name:");

        searchjButton.setText("Search");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });

        booktwojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airliner Name", "Source", "Destination", "Price (In Dollars)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(booktwojTable);

        book2jButton.setText("Book");
        book2jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book2jButtonActionPerformed(evt);
            }
        });

        backjButton.setText("Back");
        backjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Two way ticket options");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(destinationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(71, 71, 71)
                                            .addComponent(jLabel9)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(firstNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(sourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(lastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(73, 73, 73)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel6)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(lastNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(sourcejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(jLabel8)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(destinationjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE)))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(380, 380, 380)
                                .addComponent(searchjButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backjButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(book2jButton)))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(firstNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(firstNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(lastNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourcejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(sourcejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(destinationjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(destinationjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book2jButton)
                    .addComponent(backjButton))
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void destinationjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationjTextFieldActionPerformed

    private void destinationjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationjTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationjTextField1ActionPerformed

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        // TODO add your handling code here:
        int  k=0;
        System.out.println("search");
        try
        {
            System.out.println("in try");
            anumber = sourcejTextField.getText();
            anumber1 = destinationjTextField.getText();
            anumber2 = firstNamejTextField.getText();
            anumber3 = lastNamejTextField.getText();
            anumber4 = sourcejTextField1.getText();
            anumber5 = destinationjTextField1.getText();
            anumber6 = firstNamejTextField1.getText();
            anumber7 = lastNamejTextField1.getText();
            
            System.out.println(anumber);
        }
        catch(Exception e)
        {
            System.out.println("Some Exception");
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, "Plese enter correct values");
            //i = 1;
        }
        //System.out.println(ad.getAirplaneDirectory().size());
              
        
        
        
        for (Flight f : flightSch.getFlightCollection())
        {
            System.out.println("In for");
          Object data[] = new Object[5];
        
        //String x = ap.getFlightNumber();
        if(anumber.equalsIgnoreCase(f.getArrival())&& anumber1.equalsIgnoreCase(f.getDepart())&&anumber4.equalsIgnoreCase(f.getArrival())&&anumber5.equalsIgnoreCase(f.getDepart()))
        {
            k=1;
        data[0] = f;
        data[1] = f.getArrival();
        data[2] = f.getDepart();
        data[3] = f.getPrice();
       // data[3] = ap.getAirportName();
        DefaultTableModel dm = (DefaultTableModel)booktwojTable.getModel();
        //dm.setRowCount(0);
        dm.addRow(data);
        }
        }
        if(k==0)
        {
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, "Invalid Input. No such flight available. Plese enter correct source and destination");
        }                                                 

     
                                                             
        
    }//GEN-LAST:event_searchjButtonActionPerformed

    private void backjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButtonActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_backjButtonActionPerformed

    private void book2jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book2jButtonActionPerformed
        // TODO add your handling code here:
        int selectedrow = booktwojTable.getSelectedRow();
        if (selectedrow >= 0)
        {
            Flight f = (Flight) booktwojTable.getValueAt(selectedrow,0);
            int cfr = JOptionPane.showConfirmDialog(null, "Are you sure to book");
            if (cfr == 0)
            {
            Random r = new Random();
            char c = (char)(r.nextInt(5) + 'a');
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null, anumber2 +" " + anumber3+  " and "  + anumber6+" " + anumber7+ "your tickets are booked. Your seat numbers are:  " + ThreadLocalRandom.current().nextInt(1, 100+1)+c + " And " + ThreadLocalRandom.current().nextInt(1, 100+1)+c);
            }
            UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 24));
            JOptionPane.showMessageDialog(null,"We wish you a happy journey..!!");
            
        }
    }//GEN-LAST:event_book2jButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JButton book2jButton;
    private javax.swing.JTable booktwojTable;
    private javax.swing.JTextField destinationjTextField;
    private javax.swing.JTextField destinationjTextField1;
    private javax.swing.JTextField firstNamejTextField;
    private javax.swing.JTextField firstNamejTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNamejTextField;
    private javax.swing.JTextField lastNamejTextField1;
    private javax.swing.JButton searchjButton;
    private javax.swing.JTextField sourcejTextField;
    private javax.swing.JTextField sourcejTextField1;
    // End of variables declaration//GEN-END:variables
}
