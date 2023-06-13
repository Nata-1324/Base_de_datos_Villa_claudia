/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package co.edu.uis.libreria.villaclau;

import co.edu.uis.libreria.villaclau.controlador.Conexion;
import co.edu.uis.libreria.villaclau.controlador.Controlador_pantallas;

/**
 *
 * @author Nataly
 */
public class Villaclau {

    public static void main(String[] args) {
        Conexion.conectar();
        Controlador_pantallas.abrir_pantalla_menu();
    }
}
