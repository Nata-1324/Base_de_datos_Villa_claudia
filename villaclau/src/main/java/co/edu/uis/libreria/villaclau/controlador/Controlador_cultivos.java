/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uis.libreria.villaclau.controlador;

import co.edu.uis.libreria.villaclau.modelo.Cultivos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nataly
 */
public class Controlador_cultivos {
    public static void guardar_cultivo(Cultivos cul) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("INSERT INTO cultivos VALUES('" + cul.getId_cultivo()+ "','" + cul.getProducto_agricola()+ "','" + cul.getFecha_siembra()+ "','" + cul.getFecha_finrecolecta() + "','"+cul.getPrecio_venta()+"','"+cul.getProblematicas()+"')");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cultivos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en el Registro");
        }
    }

    public static void cargar_cultivo(JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cultivos");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("id_cultivo"), rs.getInt("producto_agricola"), rs.getString("fecha_siembra"), rs.getString("fecha_finrecolecta"), rs.getDouble("precio_venta"),rs.getString("Problematicas")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cultivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void actualizar_cultivo(Cultivos cul) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("UPDATE cultivos SET producto_agricola ='" + cul.getProducto_agricola()+ "',"
                    + "fecha_siembra='" +cul.getFecha_siembra()+ "',fecha_finrecolecta='" + cul.getFecha_finrecolecta()+ "',"
                    + "precio_venta = '"+cul.getPrecio_venta()+"', "
                            + "Problematicas = '"+cul.getProblematicas()+"' where id_cultivo = '"+cul.getId_cultivo()+"'");
            JOptionPane.showMessageDialog(null, "Actualización Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cultivos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en la actualización");
        }
    }

    public static void eliminar_cultivo(int id, JTable table, DefaultTableModel model) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("DELETE FROM cultivos where id_cultivo = '" + id + "'");
            JOptionPane.showMessageDialog(null, "Registro Elminado");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cultivos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro no Elminado");
        }
    }
    
    public static void cargar_cultivos_producto_agricola(int id, JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cultivos where producto_agricola = '"+id+"'");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("id_cultivo"), rs.getInt("producto_agricola"), rs.getString("fecha_siembra"), rs.getString("fecha_finrecolecta"), rs.getDouble("precio_venta"),rs.getString("Problematicas")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cultivos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "nosepudo");
        }
    }
    
}
