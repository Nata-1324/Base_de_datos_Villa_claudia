/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uis.libreria.villaclau.controlador;

import co.edu.uis.libreria.villaclau.modelo.Venta;
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
public class Controlador_ventas {
 
    public static void guardar_venta(Venta ven) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("INSERT INTO ventas VALUES('" + ven.getId_venta()+ "','" + ven.getFecha()+ "','" + ven.getCliente()+ "','" + ven.getCultivo() + "','"+ven.getPrecio()+"')");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_ventas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en el Registro");
        }
    }

    public static void cargar_ventas(JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM ventas");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("Id_venta"), rs.getString("Fecha"), rs.getInt("Cliente"), rs.getInt("cultivo"),rs.getDouble("Precio")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void actualizar_venta(Venta ven) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("UPDATE ventas SET Fecha ='" + ven.getFecha()+ "',Cliente='" +ven.getCliente()+ "',Cultivo='" + ven.getCultivo() +  "',Precio='" + ven.getPrecio()+"' where Id_venta = '"+ven.getId_venta()+"'");
            JOptionPane.showMessageDialog(null, "Actualización Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_ventas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en la actualización");
        }
    }

    public static void eliminar_venta(int id, JTable table, DefaultTableModel model) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("DELETE FROM ventas where id_venta = '" + id + "'");
            JOptionPane.showMessageDialog(null, "Registro Elminado");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_ventas.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro no Elminado");
        }
    }
    public static void cargar_ventas_precio(JTable tabla, DefaultTableModel modelo, double valor_1,double valor_2) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("call listar_ventas_mayores_a('"+valor_1+"','"+valor_2+"');");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("Id_venta"), rs.getString("Fecha"), rs.getInt("Cliente"), rs.getInt("cultivo"),rs.getDouble("Precio")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
