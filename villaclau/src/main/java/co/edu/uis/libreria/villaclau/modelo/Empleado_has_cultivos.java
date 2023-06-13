/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uis.libreria.villaclau.modelo;

/**
 *
 * @author Nataly
 */
public class Empleado_has_cultivos {
    private int id_empleado;
    private int id_cultivo;

    public Empleado_has_cultivos(int id_empleado, int id_cultivo) {
        this.id_empleado = id_empleado;
        this.id_cultivo = id_cultivo;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public int getId_cultivo() {
        return id_cultivo;
    }

    public void setId_cultivo(int id_cultivo) {
        this.id_cultivo = id_cultivo;
    }
    
    
}
