/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerLayer;

import BusinessLayer.admin;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author Zain
 */
public class AdminLogInGUI extends javax.swing.JFrame {

    /**
     * Creates new form LogInGUI
     */
    public AdminLogInGUI() {
        initComponents();
        
    }
    private static String check;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AdminButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        back = new javax.swing.JButton();
        PasswordEntry = new javax.swing.JTextField();
        EmailEntry = new javax.swing.JTextField();
        LoginButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BackGround2 = new javax.swing.JLabel();

        AdminButton.setBackground(new java.awt.Color(23, 36, 42));
        AdminButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        AdminButton.setForeground(new java.awt.Color(255, 255, 255));
        AdminButton.setText("ADMIN");
        AdminButton.setBorderPainted(false);
        AdminButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminButtonActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setLayout(null);

        back.setBackground(new java.awt.Color(0, 255, 255));
        back.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        back.setText("BACK");
        back.setBorderPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel2.add(back);
        back.setBounds(880, 520, 120, 40);

        PasswordEntry.setBorder(null);
        PasswordEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordEntryActionPerformed(evt);
            }
        });
        jPanel2.add(PasswordEntry);
        PasswordEntry.setBounds(340, 330, 310, 16);

        EmailEntry.setBorder(null);
        EmailEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailEntryActionPerformed(evt);
            }
        });
        jPanel2.add(EmailEntry);
        EmailEntry.setBounds(340, 260, 310, 16);

        LoginButton1.setBackground(new java.awt.Color(23, 36, 42));
        LoginButton1.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        LoginButton1.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton1.setText("LOG IN");
        LoginButton1.setBorderPainted(false);
        LoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(LoginButton1);
        LoginButton1.setBounds(350, 380, 300, 30);

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel1.setText("ADMIN LOG IN");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(440, 190, 120, 30);

        jPanel1.setBackground(new java.awt.Color(216, 239, 239));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1);
        jPanel1.setBounds(320, 420, 350, 70);

        BackGround2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterfaceLayer/Login.png"))); // NOI18N
        BackGround2.setOpaque(true);
        jPanel2.add(BackGround2);
        BackGround2.setBounds(0, 0, 1020, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1028, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        new AdminLogInGUI().setVisible(true);
    }//GEN-LAST:event_AdminButtonActionPerformed

    boolean flag=true;
    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
    
          if(EmailEntry.getText().isEmpty()||PasswordEntry.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(null,"PLEASE ENTER ALL FILEDS");
           flag=false;
       }
       if(flag)
           
       //////////////////////////////////////////////////
       /////////Connecting to Business Layer/////////////
       //////////////////////////////////////////////////
           
       {   admin obj=new admin();
       if(obj.validation(EmailEntry.getText(), PasswordEntry.getText()))
           {
               new AdminHomepaageGUI().setVisible(true);
               this.dispose();
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Incorrect email or password");
           }
       }
       
   
    }//GEN-LAST:event_LoginButton1ActionPerformed

    private void EmailEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailEntryActionPerformed
        
    }//GEN-LAST:event_EmailEntryActionPerformed

    private void PasswordEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordEntryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordEntryActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
      new UserTypeGUI().setVisible(true);        
      this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminLogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogInGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogInGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JLabel BackGround2;
    private javax.swing.JTextField EmailEntry;
    private javax.swing.JButton LoginButton1;
    private javax.swing.JTextField PasswordEntry;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
