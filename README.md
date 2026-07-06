# Sistema de Control de Inventario

Proyecto de Programación IV

## Estudiante

Geirel Johan Bermúdez Vargas

## Descripción

Sistema de Control de Inventario desarrollado en Java utilizando Java Swing en NetBeans, siguiendo una arquitectura por capas. El sistema permite administrar productos mediante operaciones de registro, edición, eliminación, búsqueda y consulta de estadísticas, además de exportar el inventario a un archivo CSV

#Tecnologías utilizadas

Java
Java Swing
NetBeans IDE
Colecciones de Java (ArrayList, HashSet, HashMap, Stack)

#Estructura del proyecto

Modelo: Contiene la clase Producto.
Repositorio: Gestiona el almacenamiento de los productos.
Negocio: Contiene las reglas de negocio y validaciones.
Presentación: Interfaz gráfica desarrollada con Java Swing.
Util: Funciones auxiliares como la exportación de archivos.
Excepciones: Excepciones personalizadas para el manejo de errores.

#Funcionalidades

Registrar productos.
Editar productos.
Eliminar productos.
Buscar productos por código o nombre.
Ordenar productos por nombre, precio y cantidad.
Mostrar estadísticas del inventario.
Exportar el inventario a un archivo CSV.
Validación de datos de entrada.
Manejo de excepciones personalizadas.

#Validaciones implementadas

Código obligatorio.
Código único (sin duplicados).
Nombre obligatorio con un mínimo de 3 caracteres.
Cantidad mayor o igual a cero.
Precio mayor que cero.
Categoría obligatoria.

#Estadísticas disponibles

Total de productos.
Productos disponibles.
Productos no disponibles.
Total de unidades en inventario.
Valor total del inventario.
Producto de mayor precio.
Producto de menor precio.

#Exportación

El sistema permite exportar el inventario a un archivo en formato CSV mediante un JFileChooser, facilitando su apertura en Microsoft Excel o cualquier editor de texto compatible.

#Ejecución

Abrir el proyecto en NetBeans.
Ejecutar la clase principal.
Registrar productos.
Utilizar las diferentes opciones del sistema.
Exportar el inventario cuando sea necesario.

#Observaciones

Este proyecto fue desarrollado con fines académicos para demostrar el uso de programación orientada a objetos, arquitectura por capas, colecciones de Java, manejo de archivos, validaciones y desarrollo de interfaces gráficas utilizando Java Swing.
