/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Negocio;

/**
 *
 * @author Geirel
 */

import Excepciones.DatoInvalidoException;
import Excepciones.ProductoDuplicadoException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import Modelo.Producto;
import Repositorio.ProductoRepositorio;

public class ProductoNegocio {
    
    private ProductoRepositorio repositorio;
    
    public ProductoNegocio() {
    repositorio = new ProductoRepositorio();
    }
    
    public List<Producto> listar() {
    return repositorio.listar();
    }
    
    //Agregar
    public void agregar(Producto producto)
        throws DatoInvalidoException, ProductoDuplicadoException {
    if (producto.getCodigo() == null || producto.getCodigo().trim().isEmpty()) {
        throw new DatoInvalidoException("El código es obligatorio.");
    }
    if (repositorio.existeCodigo(producto.getCodigo())) {
        throw new ProductoDuplicadoException("El código ya existe.");
    }
    if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
        throw new DatoInvalidoException("El nombre es obligatorio.");
    }
    if (producto.getNombre().length() < 3) {
        throw new DatoInvalidoException("El nombre debe tener mínimo tres caracteres.");
    }
    if (producto.getCantidad() < 0) {
        throw new DatoInvalidoException("La cantidad debe ser mayor o igual que cero.");
    }
    if (producto.getPrecio() <= 0) {
        throw new DatoInvalidoException("El precio debe ser mayor que cero.");
    }
    if (producto.getCategoria() == null
            || producto.getCategoria().trim().isEmpty()) {
        throw new DatoInvalidoException("Debe seleccionar una categoría.");
    }
    repositorio.agregar(producto);
    }
    
    //Editar
    public void editar(Producto producto)
        throws DatoInvalidoException {
    if (producto.getCodigo() == null || producto.getCodigo().trim().isEmpty()) {
        throw new DatoInvalidoException("El código es obligatorio.");
    }
    if (producto.getNombre() == null || producto.getNombre().trim().isEmpty()) {
        throw new DatoInvalidoException("El nombre es obligatorio.");
    }
    if (producto.getNombre().length() < 3) {
        throw new DatoInvalidoException("El nombre debe tener mínimo tres caracteres.");
    }
    if (producto.getCantidad() < 0) {
        throw new DatoInvalidoException("La cantidad debe ser mayor o igual que cero.");
    }
    if (producto.getPrecio() <= 0) {
        throw new DatoInvalidoException("El precio debe ser mayor que cero.");
    }
    repositorio.editar(producto);
    }
    
    //Eliminar
    public void eliminar(String codigo) {
    repositorio.eliminar(codigo);
    }
    
    //Buscar por codigo
    public Producto buscarPorCodigo(String codigo) {
    return repositorio.buscarPorCodigo(codigo);
    }
    
    //Ordenar
    public void ordenarPorNombre() {
    Collections.sort(repositorio.listar(),
            Comparator.comparing(Producto::getNombre));
    }
    
    //Ordenar
    public void ordenarPorPrecio() {
    Collections.sort(repositorio.listar(),
            Comparator.comparingDouble(Producto::getPrecio));
    }
    
    //Ordenar por cantidad
    public void ordenarPorCantidad() {
    Collections.sort(repositorio.listar(),
            Comparator.comparingInt(Producto::getCantidad));
    }
    
    //Total de productos
    public int totalProductos() {
    return repositorio.listar().size();
    }
    
    //Productos disponibles
    public long productosDisponibles() {
    return repositorio.listar()
            .stream()
            .filter(Producto::isDisponible)
            .count();
    }
    
    //Productos no disponibles
    public long productosNoDisponibles() {
    return repositorio.listar()
            .stream()
            .filter(p -> !p.isDisponible())
            .count();
    }
    
    //Total de unidades
    public int totalUnidades() {
    int total = 0;
    for (Producto p : repositorio.listar()) {
        total += p.getCantidad();
    }
    return total;
    }
   
    //Valor del inventario
    public double valorInventario() {
    double total = 0;
    for (Producto p : repositorio.listar()) {
        total += p.getCantidad() * p.getPrecio();
    }
    return total;
    }
    
    public Producto productoMasCaro() {

    if (repositorio.listar().isEmpty()) {
        return null;
    }

    //Productos con mayor precio
    return Collections.max(
            repositorio.listar(),
            Comparator.comparingDouble(Producto::getPrecio));
    }
    
    //productos con menor precio
    public Producto productoMasBarato() {
    if (repositorio.listar().isEmpty()) {
        return null;
    }
    return Collections.min(
            repositorio.listar(),
            Comparator.comparingDouble(Producto::getPrecio));
    }
    
    public ProductoRepositorio getRepositorio() {
    return repositorio;
    }
    
    public int generarId() {
    return repositorio.generarId();
    }
}
