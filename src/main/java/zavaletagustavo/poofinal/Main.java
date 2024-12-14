package zavaletagustavo.poofinal;

import zavaletagustavo.poofinal.Usuario.*;
import zavaletagustavo.poofinal.ProductoInitializer;
import zavaletagustavo.poofinal.Almacenes.Almacen;
import java.util.Scanner;
import zavaletagustavo.poofinal.Menus.SubMenuUsuario;
import zavaletagustavo.poofinal.productos.ProductoBase;

public class Main {

    public static void main(String[] args) {
        // Inicialización de productos por defecto
        ProductoBase[] productos = ProductoInitializer.inicializarProductos();

        // Crear almacenes 
        Almacen[] almacenes = new Almacen[3];
        
        almacenes[0] = new Almacen("Almacen 1", "Congelables");
        almacenes[0].agregarProducto(productos[0]);
        almacenes[0].agregarProducto(productos[1]);
        almacenes[0].agregarProducto(productos[2]);
        almacenes[0].agregarProducto(productos[15]);
        almacenes[0].agregarProducto(productos[12]);
        almacenes[0].agregarProducto(productos[22]);
        almacenes[0].agregarProducto(productos[6]);
        
        almacenes[1] = new Almacen("Almacen 2", "Perecibles");
        almacenes[1].agregarProducto(productos[10]);
        almacenes[1].agregarProducto(productos[18]);
        almacenes[1].agregarProducto(productos[5]);
        almacenes[1].agregarProducto(productos[17]);
        almacenes[1].agregarProducto(productos[23]);
        
        almacenes[2] = new Almacen("Almacen 3", "Enlatados");
        almacenes[2].agregarProducto(productos[0]);
        almacenes[2].agregarProducto(productos[1]);
        almacenes[2].agregarProducto(productos[21]);
        almacenes[2].agregarProducto(productos[14]);
        
        // Creación del objeto SubMenuUsuario
        SubMenuUsuario menuUsuario = new SubMenuUsuario();

        // Seleccionar tipo de usuario
        String usuario = menuUsuario.seleccionarUsuario();

        // Crear el usuario de acuerdo a su tipo
        Usuario usuarioActivo = null;
        switch (usuario) {
            case "Jefe":
                usuarioActivo = new Jefe("Juan");
                break;
            case "Empleado":
                usuarioActivo = new Empleado("Carlos");
                break;
            case "Visitante":
                usuarioActivo = new Visitante("Marta");
                break;
            default:
                System.out.println("Tipo de usuario no válido.");
                System.exit(0);
                break;
        }

        // Mostrar opciones para el usuario seleccionado
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        while (continuar) {
            // Mostrar opciones y gestionar elecciones
            usuarioActivo.mostrarOpciones();
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar productos (ya implementado previamente)
                    mostrarProductos(productos);
                    break;
                case 2:
                    // Modificar stock (implementado previamente)
                    modificarStock(almacenes, scanner);
                    break;
                case 3:
                    // Salir del sistema
                    continuar = false;
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private static void mostrarProductos(ProductoBase[] productos) {
        System.out.println("\nProductos disponibles:");
        for (ProductoBase producto : productos) {
            System.out.println(producto.getNombre() + " - Precio: " + producto.getPrecio() + " - Stock: " + producto.getStock());
        }
    }

    private static void modificarStock(Almacen[] almacenes, Scanner scanner) {
        System.out.println("\nSeleccione el almacén para modificar el stock:");
        for (int i = 0; i < almacenes.length; i++) {
            System.out.println((i + 1) + ". " + almacenes[i].getNombre());
        }
        int seleccionAlmacen = scanner.nextInt();

        if (seleccionAlmacen > 0 && seleccionAlmacen <= almacenes.length) {
            Almacen almacenSeleccionado = almacenes[seleccionAlmacen - 1];
            System.out.println("Productos en " + almacenSeleccionado.getNombre() + ":");
            for (ProductoBase producto : almacenSeleccionado.getProductos()) {
                System.out.println(producto.getNombre() + " - Stock: " + producto.getStock());
            }
            System.out.print("Seleccione el producto para modificar el stock: ");
            int seleccionProducto = scanner.nextInt();
            if (seleccionProducto > 0 && seleccionProducto <= almacenSeleccionado.getProductos().size()) {
                ProductoBase producto = almacenSeleccionado.getProductos().get(seleccionProducto - 1);
                System.out.print("Nuevo stock para " + producto.getNombre() + ": ");
                int nuevoStock = scanner.nextInt();
                producto.setStock(nuevoStock);
                System.out.println("Stock actualizado para " + producto.getNombre() + ": " + nuevoStock);
            }
        } else {
            System.out.println("Selección inválida.");
        }
    }
}
