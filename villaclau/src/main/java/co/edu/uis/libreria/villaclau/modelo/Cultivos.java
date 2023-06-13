/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uis.libreria.villaclau.modelo;

/**
 *
 * @author Nataly
 */
public class Cultivos {
    private int id_cultivo;
    private int producto_agricola;
    private String fecha_siembra;
    private String fecha_finrecolecta;
    private double precio_venta;
    private String problematicas;

    public Cultivos(int id_cultivo, int producto_agricola, String fecha_siembra, String fecha_finrecolecta, double precio_venta, String problematicas) {
        this.id_cultivo = id_cultivo;
        this.producto_agricola = producto_agricola;
        this.fecha_siembra = fecha_siembra;
        this.fecha_finrecolecta = fecha_finrecolecta;
        this.precio_venta = precio_venta;
        this.problematicas = problematicas;
    }

    public int getId_cultivo() {
        return id_cultivo;
    }

    public void setId_cultivo(int id_cultivo) {
        this.id_cultivo = id_cultivo;
    }

    public int getProducto_agricola() {
        return producto_agricola;
    }

    public void setProducto_agricola(int producto_agricola) {
        this.producto_agricola = producto_agricola;
    }

    public String getFecha_siembra() {
        return fecha_siembra;
    }

    public void setFecha_siembra(String fecha_siembra) {
        this.fecha_siembra = fecha_siembra;
    }

    public String getFecha_finrecolecta() {
        return fecha_finrecolecta;
    }

    public void setFecha_finrecolecta(String fecha_finrecolecta) {
        this.fecha_finrecolecta = fecha_finrecolecta;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public String getProblematicas() {
        return problematicas;
    }

    public void setProblematicas(String problematicas) {
        this.problematicas = problematicas;
    }
    
    
    
}
