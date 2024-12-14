package zavaletagustavo.poofinal.Menus;

import zavaletagustavo.poofinal.productos.ProductoBase;
import java.util.Scanner;

public class MenuProducto {
    public void modificarStock(ProductoBase producto, String tipoUsuario) {
        Scanner scanner = new Scanner(System.in);
        if ("Empleado".equals(tipoUsuario) || "Jefe".equals(tipoUsuario)) {
            System.out.print("Ingrese el nuevo stock para el producto " + producto.getNombre() + ": ");
            int nuevoStock = scanner.nextInt();
            if (nuevoStock > 50 || nuevoStock < 0) {
                System.out.println("Stock inválido. No se realizó ningún cambio.");
            } else {
                producto.setStock(nuevoStock);
                System.out.println("Stock actualizado a " + nuevoStock);
            }
        }
    }
}
