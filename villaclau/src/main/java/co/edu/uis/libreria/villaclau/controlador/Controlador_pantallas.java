/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uis.libreria.villaclau.controlador;

import co.edu.uis.libreria.villaclau.vista.VCliente;
import co.edu.uis.libreria.villaclau.vista.VCultivos;
import co.edu.uis.libreria.villaclau.vista.VEmpleado_has_cultivos;
import co.edu.uis.libreria.villaclau.vista.VMenu;
import co.edu.uis.libreria.villaclau.vista.VVentas;

/**
 *
 * @author Nataly
 */
public class Controlador_pantallas {
    private static VCliente pantalla_Cliente;
    private static VMenu pantalla_Menu;
    private static VCultivos pantalla_Cultivo;
    private static VEmpleado_has_cultivos pantalla_Empleados_has_cultivos;
    private static VVentas pantalla_ventas;
    
    public static void abrir_pantalla_ventas(){
        if(pantalla_ventas==null){
            pantalla_ventas = new VVentas();
        }
        pantalla_ventas.setVisible(true);
        pantalla_ventas.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_ventas(){
        pantalla_ventas.setVisible(false);
        pantalla_ventas = null;
    }
    
    
    public static void abrir_pantalla_Empleados_has_cultivos(){
        if(pantalla_Empleados_has_cultivos==null){
            pantalla_Empleados_has_cultivos = new VEmpleado_has_cultivos();
        }
        pantalla_Empleados_has_cultivos.setVisible(true);
        pantalla_Empleados_has_cultivos.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_Empleados_has_cultivos(){
        pantalla_Empleados_has_cultivos.setVisible(false);
        pantalla_Empleados_has_cultivos = null;
    }
    
    
    public static void abrir_pantalla_Cultivo(){
        if(pantalla_Cultivo==null){
            pantalla_Cultivo = new VCultivos();
        }
        pantalla_Cultivo.setVisible(true);
        pantalla_Cultivo.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_Cultivo(){
        pantalla_Cultivo.setVisible(false);
        pantalla_Cultivo = null;
    }
    
    public static void abrir_pantalla_Cliente(){
        if(pantalla_Cliente==null){
            pantalla_Cliente = new VCliente();
        }
        pantalla_Cliente.setVisible(true);
        pantalla_Cliente.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_Cliente(){
        pantalla_Cliente.setVisible(false);
        pantalla_Cliente = null;
    }
    
    public static void abrir_pantalla_menu(){
        if(pantalla_Menu==null){
            pantalla_Menu = new VMenu();
        }
        pantalla_Menu.setVisible(true);
        pantalla_Menu.setLocationRelativeTo(null);
    }
    public static void cerrar_pantalla_Menu(){
        pantalla_Menu.setVisible(false);
        pantalla_Menu = null;
    }
    
}
