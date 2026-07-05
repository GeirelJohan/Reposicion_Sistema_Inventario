/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Geirel
 */
public class Producto {
    
    //Variables
    private int id;
    private String codigo;
    private String nombre;
    private String categoria;
    private int cantidad;
    private double precio;
    private boolean disponible;
    private String descripcion;
    
    //Constructor
    public Producto(int id, String codigo, String nombre, String categoria, int cantidad, double precio, boolean disponible, String descripcion) {
        this.id = id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.precio = precio;
        this.disponible = disponible;
        this.descripcion = descripcion;
    }
    
    //Getters
    public int getId() {
        return id;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getCantidad() {
        return cantidad;
    }
    public double getPrecio() {
        return precio;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public String getDescripcion() {
        return descripcion;
    }
    
    //Setters
    public void setId(int id) {
        this.id = id;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
