/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author Geirel
 */
import Excepciones.ArchivoException;
import java.io.File;
import java.io.PrintWriter;
import java.util.List;
import Modelo.Producto;

public class ArchivoUtil {
     public static void exportarCSV(List<Producto> productos, File archivo)
            throws ArchivoException {

        try (PrintWriter pw = new PrintWriter(archivo)) {

            pw.println("ID,Codigo,Nombre,Categoria,Cantidad,Precio,Disponible");

            for (Producto p : productos) {

                pw.println(
                        p.getId() + "," +
                        p.getCodigo() + "," +
                        p.getNombre() + "," +
                        p.getCategoria() + "," +
                        p.getCantidad() + "," +
                        p.getPrecio() + "," +
                        p.isDisponible()
                );
            }

        } catch (Exception e) {
            throw new ArchivoException("Error al exportar el inventario.", e);
        }
    }

}