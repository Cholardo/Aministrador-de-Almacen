package zavaletagustavo.poofinal.Almacenes;

import java.util.ArrayList;
import zavaletagustavo.poofinal.productos.ProductoBase;
import java.util.List;

public class Almacen {

    private String nombre;
    private String clasificacion;
    private List<ProductoBase> productos;

    public Almacen(String nombre, String clasificacion) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.productos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    // Método para establecer la clasificación
    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    // Método para agregar productos al almacén
    public void agregarProducto(ProductoBase producto) {
        productos.add(producto);
    }

    // Obtener todos los productos del almacén
    public List<ProductoBase> getProductos() {
        return productos;
    }

    // Método para actualizar el stock de un producto
    public boolean actualizarStock(ProductoBase producto, int nuevoStock, String tipoUsuario) {
        if ("Empleado".equals(tipoUsuario) || "Jefe".equals(tipoUsuario)) {
            producto.setStock(nuevoStock);
            return true;
        }
        return false; // Si no es empleado o jefe, no tiene permisos
    }

    // Método para actualizar el precio de un producto
    public boolean actualizarPrecio(ProductoBase producto, double nuevoPrecio, String tipoUsuario) {
        if ("Jefe".equals(tipoUsuario)) {
            producto.setPrecio(nuevoPrecio);
            return true;
        }
        return false; // Solo el Jefe puede modificar precios
    }
}
