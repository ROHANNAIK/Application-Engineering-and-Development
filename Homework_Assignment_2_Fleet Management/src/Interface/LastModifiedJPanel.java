/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;
import Business.*;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Rohan
 */
public class LastModifiedJPanel extends javax.swing.JPanel {

    /** Creates new form LastModifiedJPanel */
    private AirplaneDirectory ad;
    private Airplane ap;
    //private date anumber;
    public LastModifiedJPanel(AirplaneDirectory ad) {
        initComponents();
        this.ad = ad;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LastModifiedjTextField = new javax.swing.JTextField();
        searchlastmodifiedjButton1 = new javax.swing.JButton();

        LastModifiedjTextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LastModifiedjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastModifiedjTextFieldActionPerformed(evt);
            }
        });

        searchlastmodifiedjButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        searchlastmodifiedjButton1.setText("Click to view the catalog last update date:");
        searchlastmodifiedjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchlastmodifiedjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(searchlastmodifiedjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(LastModifiedjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(searchlastmodifiedjButton1)
                .addGap(32, 32, 32)
                .addComponent(LastModifiedjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchlastmodifiedjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchlastmodifiedjButton1ActionPerformed
        // TODO add your handling code here:
          File file = new File("src\\Interface\\Airlines Management.csv");

	//System.out.println("Before Format : " + file.lastModified());

	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        //Date date = new Date();
	//System.out.println(sdf.format(file.lastModified()));
       // Date date = df.parse(sdf.format(file.lastModified()));
        LastModifiedjTextField.setText(sdf.format(file.lastModified()));

    }//GEN-LAST:event_searchlastmodifiedjButton1ActionPerformed

    private void LastModifiedjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastModifiedjTextFieldActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_LastModifiedjTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField LastModifiedjTextField;
    private javax.swing.JButton searchlastmodifiedjButton1;
    // End of variables declaration//GEN-END:variables

}
