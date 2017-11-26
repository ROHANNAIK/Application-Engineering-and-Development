/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.MonitorSales;

import Business.Business;
import Business.Market;
import Business.OrderItem;
import Business.OrderList;
import Business.RevenueCalculation;
import static Business.RevenueCalculation.business;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shwet
 */
public class SalesWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form SalesWorkAreaPanel
     */
    private JPanel userProcessContainer;
    private Business business;
    private RevenueCalculation revenue;
    public SalesWorkAreaPanel(JPanel userProcessContainer,Business business) {
        
        
       initComponents();
       this.business=business;
       this.userProcessContainer=userProcessContainer;
       
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totrevbtn = new javax.swing.JButton();
        txtTotalRevenue = new javax.swing.JTextField();
        revbymarkettxt = new javax.swing.JTextField();
        revbymarketbtn = new javax.swing.JButton();
        toptenbtn = new javax.swing.JButton();
        sortbtn = new javax.swing.JButton();
        abovetargetbtn = new javax.swing.JButton();
        belowtargetbtn = new javax.swing.JButton();
        marketCombo = new javax.swing.JComboBox();

        totrevbtn.setText("Total Revenue For Business:");
        totrevbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totrevbtnActionPerformed(evt);
            }
        });

        revbymarketbtn.setText("Product Sales Revenue By Market:");
        revbymarketbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revbymarketbtnActionPerformed(evt);
            }
        });

        toptenbtn.setText("Top 10 Sales person by Market:");
        toptenbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toptenbtnActionPerformed(evt);
            }
        });

        sortbtn.setText("Sort by Sales Person:");
        sortbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortbtnActionPerformed(evt);
            }
        });

        abovetargetbtn.setText("Sales person with above target sales:");
        abovetargetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abovetargetbtnActionPerformed(evt);
            }
        });

        belowtargetbtn.setText("Sales person with below target sales:");
        belowtargetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belowtargetbtnActionPerformed(evt);
            }
        });

        marketCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Education", "Health" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(marketCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totrevbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(revbymarketbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(belowtargetbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(abovetargetbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                                .addComponent(sortbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toptenbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(revbymarkettxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(272, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totrevbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(marketCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(revbymarketbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(revbymarkettxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(toptenbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sortbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(abovetargetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(belowtargetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void totrevbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totrevbtnActionPerformed
        // TODO add your handling code here:
        
        txtTotalRevenue.setText(String.valueOf(RevenueCalculation.totalRevenueForBusiness()));
    }//GEN-LAST:event_totrevbtnActionPerformed

    private void revbymarketbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_revbymarketbtnActionPerformed
        // TODO add your handling code here:
        
         
             String abc = marketCombo.getSelectedItem().toString();
          // Market market= (Market) marketCombo.getSelectedItem();
        int productSalesRevenueByMarket = 0;
        for (OrderList order : business.getMasterOrderCatalog().getOrderCatalog()) {
            for (OrderItem orderItem : order.getOrderItemList()) {
                Market mar = orderItem.getMarketOffer().getMarket();
                if (mar.getMarketName().equalsIgnoreCase(abc)) {
                    productSalesRevenueByMarket += orderItem.getQuantity() * orderItem.getMarketOffer().getProduct().getPrice();

                }
            }
        }

    
       
        revbymarkettxt.setText(String.valueOf(productSalesRevenueByMarket));
    }//GEN-LAST:event_revbymarketbtnActionPerformed

    private void toptenbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toptenbtnActionPerformed
        // TODO add your handling code here:
      Market market= (Market) marketCombo.getSelectedItem();
      RevenueCalculation.top10SalesPersonByMarket(market);
    DisplayJPanel ms = new DisplayJPanel(userProcessContainer, business);
    userProcessContainer.add("DisplayJPanel", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_toptenbtnActionPerformed

    private void sortbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortbtnActionPerformed
        // TODO add your handling code here:
       // Market market= (Market) marketCombo.getSelectedItem();
        
        DisplayJPanel ms = new DisplayJPanel(userProcessContainer, business);
    userProcessContainer.add("DisplayJPanel", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_sortbtnActionPerformed

    private void abovetargetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abovetargetbtnActionPerformed
        // TODO add your handling code here:
        DisplayJPanel ms = new DisplayJPanel(userProcessContainer, business);
    userProcessContainer.add("DisplayJPanel", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_abovetargetbtnActionPerformed

    private void belowtargetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belowtargetbtnActionPerformed
        // TODO add your handling code here:
        DisplayJPanel ms = new DisplayJPanel(userProcessContainer, business);
    userProcessContainer.add("DisplayJPanel", ms);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);
    }//GEN-LAST:event_belowtargetbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abovetargetbtn;
    private javax.swing.JButton belowtargetbtn;
    private javax.swing.JComboBox marketCombo;
    private javax.swing.JButton revbymarketbtn;
    private javax.swing.JTextField revbymarkettxt;
    private javax.swing.JButton sortbtn;
    private javax.swing.JButton toptenbtn;
    private javax.swing.JButton totrevbtn;
    private javax.swing.JTextField txtTotalRevenue;
    // End of variables declaration//GEN-END:variables
}
