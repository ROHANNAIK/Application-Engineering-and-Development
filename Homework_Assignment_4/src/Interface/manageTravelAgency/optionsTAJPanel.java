/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.manageTravelAgency;

import Business.*;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Rohan
 */
public class optionsTAJPanel extends javax.swing.JPanel {
private JPanel UserProcessContainer;
private FlightSchedule flightSch;

    /**
     * Creates new form optionsTAJPanel
     */
 

    public optionsTAJPanel(JPanel UserProcessContainer, FlightSchedule flightSch) {
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

        browseFlightnumberjButton = new javax.swing.JButton();
        searchFlightnumberjButton = new javax.swing.JButton();

        browseFlightnumberjButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        browseFlightnumberjButton.setText("Browse all flights by flight Number");
        browseFlightnumberjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseFlightnumberjButtonActionPerformed(evt);
            }
        });

        searchFlightnumberjButton.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchFlightnumberjButton.setText("Search by flight Number");
        searchFlightnumberjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFlightnumberjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(browseFlightnumberjButton)
                .addContainerGap(393, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(113, 113, 113)
                    .addComponent(searchFlightnumberjButton)
                    .addContainerGap(502, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(browseFlightnumberjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(296, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(154, 154, 154)
                    .addComponent(searchFlightnumberjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(398, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchFlightnumberjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFlightnumberjButtonActionPerformed
        // TODO add your handling code here:
       SearchJPanel createJPanel = new SearchJPanel(UserProcessContainer, flightSch);
       UserProcessContainer.add("SearchJPanel", createJPanel);
       CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
       layout.next(UserProcessContainer);
    }//GEN-LAST:event_searchFlightnumberjButtonActionPerformed

    private void browseFlightnumberjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseFlightnumberjButtonActionPerformed
        // TODO add your handling code here:
       listTAJPanel viewJPanel = new listTAJPanel(UserProcessContainer, flightSch);
       UserProcessContainer.add("listTAJPanel", viewJPanel);
       CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
       layout.next(UserProcessContainer);
        
    }//GEN-LAST:event_browseFlightnumberjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseFlightnumberjButton;
    private javax.swing.JButton searchFlightnumberjButton;
    // End of variables declaration//GEN-END:variables
}
