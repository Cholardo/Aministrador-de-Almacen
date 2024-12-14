package zavaletagustavo.poofinal.Menus;

import zavaletagustavo.poofinal.productos.ProductoBase;
import zavaletagustavo.poofinal.Almacenes.Almacen;
import java.util.Scanner;
import java.util.List;

public class MenuAlmacenes {
    private List<Almacen> almacenes;

    public MenuAlmacenes(List<Almacen> almacenes) {
        this.almacenes = almacenes;
    }

    public void mostrarAlmacenes(String tipoUsuario) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Seleccione un almacén:");
            for (int i = 0; i < almacenes.size(); i++) {
                System.out.println((i + 1) + ". " + almacenes.get(i).getNombre());
            }

            // Solo Jefe puede ver las opciones de editar almacenes
            if ("Jefe".equals(tipoUsuario)) {
                System.out.println((almacenes.size() + 1) + ". Editar almacén");
            }

            System.out.println("0. Finalizar programa");
            int opcion = scanner.nextInt();
            if (opcion == 0) {
                System.exit(0);  // Salir del programa
            }

            if ("Jefe".equals(tipoUsuario) && opcion == almacenes.size() + 1) {
                editarAlmacen(scanner);  // Método para editar almacén
            } else if (opcion >= 1 && opcion <= almacenes.size()) {
                mostrarProductos(almacenes.get(opcion - 1), tipoUsuario);
            }
        }
    }

    private void editarAlmacen(Scanner scanner) {
        System.out.println("Selecciona una opción:");
        System.out.println("1. Agregar nuevo almacén");
        System.out.println("2. Eliminar almacén");
        System.out.println("0. Regresar");
        int opcion = scanner.nextInt();

        if (opcion == 0) {
            return;  // Volver al menú anterior
        }

        switch (opcion) {
            case 1:
                agregarAlmacen(scanner);
                break;
            case 2:
                eliminarAlmacen(scanner);
                break;
        }
    }

    private void agregarAlmacen(Scanner scanner) {
        System.out.print("Ingrese el nombre del nuevo almacén: ");
        String nombre = scanner.next();

        System.out.println("Seleccione una o dos clasificaciones:");
        System.out.println("1. Congelables");
        System.out.println("2. Perecibles");
        System.out.println("3. Enlatados");
        System.out.println("4. Otros");

        String clasificacion = "";
        int clasificacionOpcion = 0;
        while (clasificacionOpcion != 5) {
            System.out.print("Seleccione clasificación (0 para finalizar): ");
            clasificacionOpcion = scanner.nextInt();
            switch (clasificacionOpcion) {
                case 1: clasificacion = "Congelables"; break;
                case 2: clasificacion = "Perecibles"; break;
                case 3: clasificacion = "Enlatados"; break;
                case 4: clasificacion = "Otros"; break;
                default: break;
            }

            if (!clasificacion.isEmpty()) {
                // Si el usuario seleccionó una clasificación válida, se asigna
                System.out.println("Clasificación " + clasificacion + " asignada.");
            }
        }

        Almacen nuevoAlmacen = new Almacen(nombre, clasificacion);
        almacenes.add(nuevoAlmacen);
        System.out.println("Almacén agregado con éxito.");
    }

    private void eliminarAlmacen(Scanner scanner) {
        System.out.print("Seleccione el almacén a eliminar: ");
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= almacenes.size()) {
            Almacen almacen = almacenes.get(opcion - 1);
            if (almacen.getProductos().isEmpty()) {
                almacenes.remove(opcion - 1);
                System.out.println("Almacén eliminado.");
            } else {
                System.out.println("No se puede eliminar el almacén, ya contiene productos.");
            }
        }
    }

    private void mostrarProductos(Almacen almacen, String tipoUsuario) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Productos del almacén " + almacen.getNombre() + ":");
        List<ProductoBase> productos = almacen.getProductos();
        for (int i = 0; i < productos.size(); i++) {
            System.out.println((i + 1) + ". " + productos.get(i).getNombre());
        }
        if ("Jefe".equals(tipoUsuario)) {
            System.out.println((productos.size() + 1) + ". Agregar producto");
            System.out.println((productos.size() + 2) + ". Eliminar producto");
        }
        System.out.println("0. Volver al menú principal");
        int opcion = scanner.nextInt();
        if (opcion == 0) {
            return;  // Volver al menú principal
        }

        if ("Jefe".equals(tipoUsuario) && opcion == productos.size() + 1) {
            agregarProducto(almacen, scanner);
        } else if ("Jefe".equals(tipoUsuario) && opcion == productos.size() + 2) {
            eliminarProducto(almacen, scanner);
        } else if (opcion >= 1 && opcion <= productos.size()) {
            verDetallesProducto(productos.get(opcion - 1), tipoUsuario);
        }
    }

    private void agregarProducto(Almacen almacen, Scanner scanner) {
        // Agregar producto, de acuerdo con las clasificaciones
    }

    private void eliminarProducto(Almacen almacen, Scanner scanner) {
        // Eliminar producto del almacén
    }

    private void verDetallesProducto(ProductoBase producto, String tipoUsuario) {
        // Mostrar detalles del producto y permitir modificar stock
    }
}
