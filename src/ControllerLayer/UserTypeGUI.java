/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControllerLayer;

/**
 *
 * @author Zain
 */
public class UserTypeGUI extends javax.swing.JFrame {

    /**
     * Creates new form UserTypeGUI
     */
    public UserTypeGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        RiderButton = new javax.swing.JButton();
        CustomerButton = new javax.swing.JButton();
        ResturantButton = new javax.swing.JButton();
        AdminButton = new javax.swing.JButton();
        BackGround1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(null);

        RiderButton.setBackground(new java.awt.Color(23, 36, 42));
        RiderButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        RiderButton.setForeground(new java.awt.Color(255, 255, 255));
        RiderButton.setText("RIDER");
        RiderButton.setBorderPainted(false);
        RiderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RiderButtonActionPerformed(evt);
            }
        });
        jPanel1.add(RiderButton);
        RiderButton.setBounds(340, 440, 300, 23);

        CustomerButton.setBackground(new java.awt.Color(23, 36, 42));
        CustomerButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        CustomerButton.setForeground(new java.awt.Color(255, 255, 255));
        CustomerButton.setText("CUSTOMER");
        CustomerButton.setBorderPainted(false);
        CustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CustomerButton);
        CustomerButton.setBounds(340, 390, 300, 23);

        ResturantButton.setBackground(new java.awt.Color(23, 36, 42));
        ResturantButton.setFont(new java.awt.Font("Montserrat", 0, 11)); // NOI18N
        ResturantButton.setForeground(new java.awt.Color(255, 255, 255));
        ResturantButton.setText("RESTURANT MANAGER");
        ResturantButton.setBorderPainted(false);
        ResturantButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResturantButtonActionPerformed(evt);
            }
        });
        jPanel1.add(ResturantButton);
        ResturantButton.setBounds(340, 340, 300, 23);

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
        jPanel1.add(AdminButton);
        AdminButton.setBounds(340, 290, 300, 23);

        BackGround1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterfaceLayer/UserType.png"))); // NOI18N
        jPanel1.add(BackGround1);
        BackGround1.setBounds(0, 0, 1010, 570);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1028, 608));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdminButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminButtonActionPerformed
        new AdminLogInGUI().setVisible(true);
          this.dispose();
    }//GEN-LAST:event_AdminButtonActionPerformed

    private void ResturantButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResturantButtonActionPerformed
  this.dispose();

/*
new LogInGUI().setVisible(true);    }//GEN-LAST:event_ResturantButtonActionPerformed
*/
new RestaurantLogInGUI().setVisible(true);}
    
    private void CustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerButtonActionPerformed
          this.dispose();
        new LogInGUI().setVisible(true);
    }//GEN-LAST:event_CustomerButtonActionPerformed

    private void RiderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RiderButtonActionPerformed
    new RiderLogin().setVisible(true);
  this.dispose();
    }//GEN-LAST:event_RiderButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserTypeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserTypeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserTypeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserTypeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserTypeGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminButton;
    private javax.swing.JLabel BackGround1;
    private javax.swing.JButton CustomerButton;
    private javax.swing.JButton ResturantButton;
    private javax.swing.JButton RiderButton;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}