/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.uis.libreria.villaclau.vista;

import co.edu.uis.libreria.villaclau.controlador.Controlador_pantallas;

/**
 *
 * @author Nataly
 */
public class VMenu extends javax.swing.JFrame {

    /**
     * Creates new form VMenu
     */
    public VMenu() {
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
        txt_Menu = new javax.swing.JLabel();
        btn_Tabla_Cliente = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btb_Tabla_Cultivos = new javax.swing.JButton();
        btn_Empleados_has_cultivos = new javax.swing.JButton();
        btn_ventas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_Menu.setText("Menu");

        btn_Tabla_Cliente.setText("Tabla_Cliente");
        btn_Tabla_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Tabla_ClienteActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btb_Tabla_Cultivos.setText("Tabla_Cultivos");
        btb_Tabla_Cultivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_Tabla_CultivosActionPerformed(evt);
            }
        });

        btn_Empleados_has_cultivos.setText("Tabla_Empleado_has_cultivos");
        btn_Empleados_has_cultivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Empleados_has_cultivosActionPerformed(evt);
            }
        });

        btn_ventas.setText("Tabla_Ventas");
        btn_ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ventasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(btn_Tabla_Cliente)
                .addGap(57, 57, 57)
                .addComponent(btb_Tabla_Cultivos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btn_Empleados_has_cultivos)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(txt_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btn_ventas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(txt_Menu, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Tabla_Cliente)
                    .addComponent(btb_Tabla_Cultivos)
                    .addComponent(btn_Empleados_has_cultivos))
                .addGap(29, 29, 29)
                .addComponent(btn_ventas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(btn_salir)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Tabla_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Tabla_ClienteActionPerformed
        Controlador_pantallas.abrir_pantalla_Cliente();
        Controlador_pantallas.cerrar_pantalla_Menu();
        
    }//GEN-LAST:event_btn_Tabla_ClienteActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        Controlador_pantallas.cerrar_pantalla_Menu();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btb_Tabla_CultivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_Tabla_CultivosActionPerformed
        // TODO add your handling code here:
        Controlador_pantallas.abrir_pantalla_Cultivo();
        Controlador_pantallas.cerrar_pantalla_Menu();
    }//GEN-LAST:event_btb_Tabla_CultivosActionPerformed

    private void btn_Empleados_has_cultivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Empleados_has_cultivosActionPerformed
        // TODO add your handling code here:
        Controlador_pantallas.abrir_pantalla_Empleados_has_cultivos();
        Controlador_pantallas.cerrar_pantalla_Menu();
    }//GEN-LAST:event_btn_Empleados_has_cultivosActionPerformed

    private void btn_ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ventasActionPerformed
        // TODO add your handling code here:
        Controlador_pantallas.abrir_pantalla_ventas();
        Controlador_pantallas.cerrar_pantalla_Menu();
    }//GEN-LAST:event_btn_ventasActionPerformed

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
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btb_Tabla_Cultivos;
    private javax.swing.JButton btn_Empleados_has_cultivos;
    private javax.swing.JButton btn_Tabla_Cliente;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_ventas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_Menu;
    // End of variables declaration//GEN-END:variables
}