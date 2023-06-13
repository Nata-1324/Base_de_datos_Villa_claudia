/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uis.libreria.villaclau.controlador;

import co.edu.uis.libreria.villaclau.modelo.Empleado_has_cultivos;
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
public class Controlador_empleado_has_cultivos {
    public static void guardar_Empleado_has_cultivos(Empleado_has_cultivos emphc) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("INSERT INTO Empleados_has_cultivos VALUES('" + emphc.getId_empleado()+ "',"
                    + "'" + emphc.getId_cultivo()+ "')");
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_empleado_has_cultivos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en el Registro");
        }
    }

    public static void cargar_Empleado_has_cultivos(JTable tabla, DefaultTableModel modelo) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM Empleados_has_cultivos");
            modelo.setRowCount(0);
            while (rs.next()) {
                Object[] fila = {rs.getInt("id_empleado"), rs.getInt("id_cultivo")};
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_empleado_has_cultivos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void actualizar_Empleado_has_cultivos(Empleado_has_cultivos emphc) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("UPDATE Empleados_has_cultivos SET id_empleado ='" + emphc.getId_empleado()+ "', where id_cultivo = '"+emphc.getId_cultivo()+"'");
            JOptionPane.showMessageDialog(null, "Actualización Exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_empleado_has_cultivos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Fallo en la actualización");
        }
    }

    public static void eliminar_Empleado_has_cultivos(int id, int id_emp, JTable table, DefaultTableModel model) {
        try {
            Statement st = Conexion.getConexion().createStatement();
            st.execute("DELETE FROM Empleados_has_cultivos where id_cultivo = '" + id + "' and id_empleado= '"+id_emp+"'");
            JOptionPane.showMessageDialog(null, "Registro Elminado");
        } catch (SQLException ex) {
            Logger.getLogger(Controlador_empleado_has_cultivos.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Registro no Elminado");
        }
    }
    
}
