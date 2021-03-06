/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.manageCust;

import Business.CustomerDirectory;
import Business.FlightSchedule;
import Business.SeatDirectory;
import Business.Seats;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rohan
 */
public class bookTicketJPanel extends javax.swing.JPanel {
private JPanel UserProcessContainer;
private FlightSchedule flightSch;
private SeatDirectory st;
private CustomerDirectory cd;
    /**
     * Creates new form bookTicketJPanel
     */



   public bookTicketJPanel(JPanel UserProcessContainer, FlightSchedule flightSch) {
                initComponents();
                this.cd = cd;
                this.flightSch = flightSch;
         this.st = st ;
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

        jLabel1 = new javax.swing.JLabel();
        singleTicketjButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Select the number of tickets to book");

        singleTicketjButton.setText("Single Ticket");
        singleTicketjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                singleTicketjButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Multiple Tickets");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(singleTicketjButton)
                        .addGap(173, 173, 173)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(singleTicketjButton)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 304, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void singleTicketjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_singleTicketjButtonActionPerformed
        // TODO add your handling code here:
       singleTicketJPanel createJPanel = new singleTicketJPanel(UserProcessContainer, flightSch);
       UserProcessContainer.add("singleTicketJPanel", createJPanel);
       CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
       layout.next(UserProcessContainer);
        
    }//GEN-LAST:event_singleTicketjButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       twoWayJPanel createJPanel = new twoWayJPanel(UserProcessContainer, flightSch);
       UserProcessContainer.add("twoWayJPanel", createJPanel);
       CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
       layout.next(UserProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton singleTicketjButton;
    // End of variables declaration//GEN-END:variables
}
