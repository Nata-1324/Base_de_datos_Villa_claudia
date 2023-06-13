/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uis.libreria.villaclau.controlador;

import co.edu.uis.libreria.villaclau.modelo.Cliente;
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
public class Controlador_cliente {
    public static void guardar_cliente(Cliente cli) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("INSERT INTO clientes VALUES('" + cli.getId_cliente()+ "','" + cli.getNombre()+ "','" + cli.getDireccion()+ "','" + cli.getTelefono() + "')");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en el Registro");
        }
    }

    public static void cargar_clientes(JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM clientes");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("Id_cliente"), rs.getString("nombre"), rs.getString("direccion"), rs.getString("telefono")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void actualizar_cliente(Cliente cli) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("UPDATE clientes SET nombre ='" + cli.getNombre()+ "',direccion='" +cli.getDireccion()+ "',telefono='" + cli.getTelefono() + "' where Id_cliente = '"+cli.getId_cliente()+"'");
            JOptionPane.showMessageDialog(null, "Actualización Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en la actualización");
        }
    }

    public static void eliminar_cliente(int id, JTable table, DefaultTableModel model) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("DELETE FROM clientes where id_cliente = '" + id + "'");
            JOptionPane.showMessageDialog(null, "Registro Elminado");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cliente.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro no Elminado");
        }
    }
    
    public static void cargar_clientes_id(int id, JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM clientes where id_cliente = '"+id+"'");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("Id_cliente"), rs.getString("nombre"), rs.getString("direccion"), rs.getString("telefono")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
