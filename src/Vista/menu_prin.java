/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Dimension;

/**
 *
 * @author Familia
 */
public class menu_prin extends javax.swing.JFrame {

    /**
     * Creates new form menu_prin
     */
    public menu_prin() {
        initComponents();
        this.setTitle("Sistema de informacion hospitalaria");
        this.setLocation(400, 100);
        this.setSize(510,500);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labe_titu = new javax.swing.JLabel();
        boto_regi = new javax.swing.JButton();
        boto_inic = new javax.swing.JButton();
        labe_menu = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labe_titu.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        labe_titu.setForeground(new java.awt.Color(255, 255, 255));
        labe_titu.setText("Bienvenido, seleccione una opcion para continuar");
        getContentPane().add(labe_titu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 450, 70));

        boto_regi.setBackground(new java.awt.Color(0, 153, 153));
        boto_regi.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        boto_regi.setForeground(new java.awt.Color(255, 255, 255));
        boto_regi.setText("Registrar un nuevo usuario");
        boto_regi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto_regiActionPerformed(evt);
            }
        });
        getContentPane().add(boto_regi, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 300, 50));

        boto_inic.setBackground(new java.awt.Color(0, 153, 153));
        boto_inic.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        boto_inic.setForeground(new java.awt.Color(255, 255, 255));
        boto_inic.setText("Iniciar sesion como usuario");
        boto_inic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boto_inicActionPerformed(evt);
            }
        });
        getContentPane().add(boto_inic, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 300, 50));

        labe_menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img3.jpg"))); // NOI18N
        labe_menu.setMinimumSize(null);
        getContentPane().add(labe_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boto_regiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto_regiActionPerformed
            regi_usua regu = new regi_usua();
            regu.setVisible(true);
            regu.pack();
            this.dispose();  
    }//GEN-LAST:event_boto_regiActionPerformed

    private void boto_inicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boto_inicActionPerformed
            inic_usua regu = new inic_usua();
            regu.setVisible(true);
            regu.pack();
            this.dispose();  
    }//GEN-LAST:event_boto_inicActionPerformed

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
            java.util.logging.Logger.getLogger(menu_prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_prin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_prin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boto_inic;
    private javax.swing.JButton boto_regi;
    private javax.swing.JLabel labe_menu;
    private javax.swing.JLabel labe_titu;
    // End of variables declaration//GEN-END:variables
}
