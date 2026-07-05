/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositorio;

/**
 *
 * @author Geirel
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import Modelo.Producto;

public class ProductoRepositorio {
    
    public ProductoRepositorio() {
    productos = new ArrayList<>();
    codigos = new HashSet<>();
    categorias = new HashMap<>();
    historial = new Stack<>();
    contadorId = 1;
    }
    
    private List<Producto> productos;
    private Set<String> codigos;
    private Map<String, Integer> categorias;
    private Stack<String> historial;
    private int contadorId;
    
    public int generarId() {
    return contadorId++;
    }
    
    public List<Producto> listar() {
    return productos;
    }
    
    public boolean existeCodigo(String codigo) {
    return codigos.contains(codigo);
    }
    
    public void agregar(Producto producto) {
    productos.add(producto);
    codigos.add(producto.getCodigo());
    categorias.put(
            producto.getCategoria(),
            categorias.getOrDefault(producto.getCategoria(), 0) + 1);

    historial.push("Producto registrado: " + producto.getNombre());
    }
    
    public Producto buscarPorCodigo(String codigo) {

    for (Producto producto : productos) {

        if (producto.getCodigo().equalsIgnoreCase(codigo)) {
            return producto;
        }
    }
    return null;
    }
    
    public void editar(Producto productoActualizado) {

    for (int i = 0; i < productos.size(); i++) {

        if (productos.get(i).getCodigo().equals(productoActualizado.getCodigo())) {

            productos.set(i, productoActualizado);

            historial.push("Producto editado: " + productoActualizado.getNombre());

            break;
            }
        }
    }
    
    public void eliminar(String codigo) {
    Producto producto = buscarPorCodigo(codigo);
    if (producto != null) {
        productos.remove(producto);
        codigos.remove(producto.getCodigo());
        categorias.put(
                producto.getCategoria(),
                categorias.get(producto.getCategoria()) - 1);
        historial.push("Producto eliminado: " + producto.getNombre());
        }
    }
    
    public Stack<String> getHistorial() {
    return historial;
}

    public Map<String, Integer> getCategorias() {
        return categorias;
    }
}
