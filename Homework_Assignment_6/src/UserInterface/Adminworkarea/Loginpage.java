/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Adminworkarea;
import Business.Business;
import Business.Persons;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
/**
 *
 * @author shwet
 */
public class Loginpage extends javax.swing.JPanel {

    /**
     * Creates new form Loginpage
     */
    javax.swing.JPanel userProcessContainer;
    Business business;
    public Loginpage(javax.swing.JPanel userProcessContainer, Business business) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.business=business;        
    }
    public Persons isValidUser()
    {
        for(Persons p : business.getEmployeedirectory().getPersonList())
        {
           if(p.getUserName()!=null && !p.getUserName().isEmpty() && p.getUserName().equals(ltxt.getText()) &&
                p.getPassword()!=null && !p.getPassword().isEmpty() && p.getPassword().equals(new String(passtxt.getPassword())))
                return p;
        }
        return null;
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
        jLabel2 = new javax.swing.JLabel();
        ltxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passtxt = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN PAGE");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 45, 760, 71));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Name:");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 193, 54));
        add(ltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 316, 53));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 193, 54));
        add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, 316, 54));

        loginbtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        loginbtn.setText("LOGIN");
        loginbtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        loginbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 193, 70));
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        Persons result=isValidUser();
        if (result != null)
        {
            UserInterface.Adminworkarea.AdminWorkAreaJPanel panel = new UserInterface.Adminworkarea.AdminWorkAreaJPanel(userProcessContainer,business);
            userProcessContainer.add("AdminWorkAreaJPanel",panel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        

        else{
            JOptionPane.showMessageDialog(null, "Please enter Valid values");

        }
    }//GEN-LAST:event_loginbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton loginbtn;
    private javax.swing.JTextField ltxt;
    private javax.swing.JPasswordField passtxt;
    // End of variables declaration//GEN-END:variables
}