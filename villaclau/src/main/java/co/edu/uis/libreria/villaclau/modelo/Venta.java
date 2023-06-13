/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uis.libreria.villaclau.modelo;

/**
 *
 * @author Nataly
 */
public class Venta {
    private int Id_venta;
    private String Fecha;
    private int Cliente;
    private int cultivo;
    private double precio;

    public Venta(int Id_venta, String Fecha, int Cliente, int cultivo, double precio) {
        this.Id_venta = Id_venta;
        this.Fecha = Fecha;
        this.Cliente = Cliente;
        this.cultivo = cultivo;
        this.precio = precio;
    }

    public int getId_venta() {
        return Id_venta;
    }

    public void setId_venta(int Id_venta) {
        this.Id_venta = Id_venta;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public int getCliente() {
        return Cliente;
    }

    public void setCliente(int Cliente) {
        this.Cliente = Cliente;
    }

    public int getCultivo() {
        return cultivo;
    }

    public void setCultivo(int cultivo) {
        this.cultivo = cultivo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
            
}
