/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.uis.libreria.villaclau.vista;

import co.edu.uis.libreria.villaclau.controlador.Controlador_cultivos;
import co.edu.uis.libreria.villaclau.controlador.Controlador_pantallas;
import co.edu.uis.libreria.villaclau.modelo.Cultivos;
import java.sql.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nataly
 */
public class VCultivos extends javax.swing.JFrame {

    /**
     * Creates new form VProductos
     */
    public VCultivos() {
        initComponents();
        cargar_tabla_cultivo();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Id_Cultivo = new javax.swing.JTextField();
        txt_Producto_Agricola = new javax.swing.JTextField();
        txt_Fecha_Siembra = new javax.swing.JTextField();
        txt_Fecha_Recolecta = new javax.swing.JTextField();
        txt_Precio_Venta = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Cultivos = new javax.swing.JTable();
        btn_Registrar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Actualizar = new javax.swing.JButton();
        btb_Listar = new javax.swing.JButton();
        btn_Volver_menu = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txt_problematicas = new javax.swing.JTextField();
        btn_filtrar = new javax.swing.JButton();
        txt_filtrar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cultivos");

        jLabel2.setText("Producto_Agricola");

        jLabel3.setText("Id_Cultivo");

        jLabel4.setText("Fecha_Siembra");

        jLabel5.setText("Fecha_Recolecta");

        jLabel6.setText("Precio_Venta");

        txt_Fecha_Siembra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Fecha_SiembraActionPerformed(evt);
            }
        });

        txt_Fecha_Recolecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Fecha_RecolectaActionPerformed(evt);
            }
        });

        tbl_Cultivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_Cultivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_CultivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Cultivos);

        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Actualizar.setText("Actualizar");
        btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ActualizarActionPerformed(evt);
            }
        });

        btb_Listar.setText("Listar");
        btb_Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_ListarActionPerformed(evt);
            }
        });

        btn_Volver_menu.setText("Volver a Menú");
        btn_Volver_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Volver_menuActionPerformed(evt);
            }
        });

        jLabel8.setText("Problematicas");

        btn_filtrar.setText("Filtrar_Id_Producto");
        btn_filtrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_filtrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_Fecha_Siembra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(30, 30, 30)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txt_Id_Cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txt_Producto_Agricola, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGap(95, 95, 95))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_Precio_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Fecha_Recolecta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Eliminar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_filtrar)
                                            .addGap(18, 18, 18)
                                            .addComponent(txt_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(btn_Actualizar)
                                            .addGap(18, 18, 18)
                                            .addComponent(btb_Listar)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(btn_Volver_menu))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_problematicas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txt_Id_Cultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_Producto_Agricola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Fecha_Siembra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Fecha_Recolecta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Precio_Venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_problematicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Registrar)
                            .addComponent(btn_Eliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Actualizar)
                            .addComponent(btb_Listar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Volver_menu)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_filtrar)
                            .addComponent(txt_filtrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    DefaultTableModel modelo_cultivos=new DefaultTableModel();
    private void cargar_tabla_cultivo(){
        modelo_cultivos.addColumn("id_cultivo");
        modelo_cultivos.addColumn("producto_agricola");
        modelo_cultivos.addColumn("fecha_siembra");
        modelo_cultivos.addColumn("fecha_finrecolecta");
        modelo_cultivos.addColumn("precio_venta");
        modelo_cultivos.addColumn("problematicas");
        tbl_Cultivos.setModel(modelo_cultivos);
    }
    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        // TODO add your handling code here:
        int id = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el Id a eliminar"));
        Controlador_cultivos.eliminar_cultivo(id, tbl_Cultivos, modelo_cultivos);
        Controlador_cultivos.cargar_cultivo(tbl_Cultivos, modelo_cultivos);
        
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_Volver_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Volver_menuActionPerformed
        Controlador_pantallas.abrir_pantalla_menu();
        Controlador_pantallas.cerrar_pantalla_Cultivo();
    }//GEN-LAST:event_btn_Volver_menuActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
    int id_cultivo=Integer.parseInt(txt_Id_Cultivo.getText());
    int producto_agricola=Integer.parseInt(txt_Producto_Agricola.getText());
    String fecha_siembra=txt_Fecha_Siembra.getText();
    String fecha_finrecolecta=txt_Fecha_Recolecta.getText();
    double precio_venta=Double.parseDouble(txt_Precio_Venta.getText());
    String problematicas=txt_problematicas.getText();
    
    Cultivos cul = new Cultivos(id_cultivo, producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas);
        Controlador_cultivos.guardar_cultivo(cul);
        Controlador_cultivos.cargar_cultivo(tbl_Cultivos, modelo_cultivos);
       limpiar_Espacios();
    
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void limpiar_Espacios(){
        String t = "";
        txt_Fecha_Recolecta.setText(t);
        txt_Fecha_Siembra.setText(t);
        txt_Id_Cultivo.setText(t);
        txt_Precio_Venta.setText(t);
        txt_Producto_Agricola.setText(t);
        txt_problematicas.setText(t);
    }
    
    private void txt_Fecha_SiembraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Fecha_SiembraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Fecha_SiembraActionPerformed

    private void txt_Fecha_RecolectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Fecha_RecolectaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Fecha_RecolectaActionPerformed

    private void btb_ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_ListarActionPerformed
        // TODO add your handling code here:
        Controlador_cultivos.cargar_cultivo(tbl_Cultivos, modelo_cultivos);
    }//GEN-LAST:event_btb_ListarActionPerformed

    private void btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ActualizarActionPerformed
        // TODO add your handling code here:
    int id_cultivo=Integer.parseInt(txt_Id_Cultivo.getText());
    int producto_agricola=Integer.parseInt(txt_Producto_Agricola.getText());
    String fecha_siembra=txt_Fecha_Siembra.getText();
    String fecha_finrecolecta=txt_Fecha_Recolecta.getText();
    double precio_venta=Double.parseDouble(txt_Precio_Venta.getText());
    String problematicas=txt_problematicas.getText();
    
    Cultivos cul = new Cultivos(id_cultivo, producto_agricola, fecha_siembra, fecha_finrecolecta, precio_venta, problematicas);
        Controlador_cultivos.actualizar_cultivo(cul);
        Controlador_cultivos.cargar_cultivo(tbl_Cultivos, modelo_cultivos);
       limpiar_Espacios();
       txt_Id_Cultivo.setEnabled(false);
       
        
    }//GEN-LAST:event_btn_ActualizarActionPerformed

    private void tbl_CultivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_CultivosMouseClicked
        // TODO add your handling code here:
        cargar_editar_cultivo();
    }//GEN-LAST:event_tbl_CultivosMouseClicked

    private void btn_filtrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_filtrarActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(txt_filtrar.getText());
        
        Controlador_cultivos.cargar_cultivos_producto_agricola(id, tbl_Cultivos, modelo_cultivos);
    }//GEN-LAST:event_btn_filtrarActionPerformed

    private void cargar_editar_cultivo(){
        int filaselect = tbl_Cultivos.getSelectedRow();
        txt_Id_Cultivo.setText((tbl_Cultivos.getValueAt(filaselect, 0)).toString());
        txt_Producto_Agricola.setText((tbl_Cultivos.getValueAt(filaselect, 1)).toString());
        txt_Fecha_Siembra.setText((tbl_Cultivos.getValueAt(filaselect, 2)).toString());
        txt_Fecha_Recolecta.setText((tbl_Cultivos.getValueAt(filaselect, 3)).toString());
        txt_Precio_Venta.setText((tbl_Cultivos.getValueAt(filaselect, 4)).toString());       
        txt_problematicas.setText((tbl_Cultivos.getValueAt(filaselect, 5)).toString());   
        txt_Id_Cultivo.setEnabled(true);
    }
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
            java.util.logging.Logger.getLogger(VCultivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VCultivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VCultivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VCultivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VCultivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btb_Listar;
    private javax.swing.JButton btn_Actualizar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JButton btn_Volver_menu;
    private javax.swing.JButton btn_filtrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Cultivos;
    private javax.swing.JTextField txt_Fecha_Recolecta;
    private javax.swing.JTextField txt_Fecha_Siembra;
    private javax.swing.JTextField txt_Id_Cultivo;
    private javax.swing.JTextField txt_Precio_Venta;
    private javax.swing.JTextField txt_Producto_Agricola;
    private javax.swing.JTextField txt_filtrar;
    private javax.swing.JTextField txt_problematicas;
    // End of variables declaration//GEN-END:variables
}
