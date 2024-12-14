package zavaletagustavo.poofinal.productos;

import java.util.ArrayList;
import java.util.List;


public abstract class ProductoBase {

    private String nombre;
    private String empresa;
    private int stock;
    private double precio;
    private List<String> clasificaciones;

    public ProductoBase(String nombre, String empresa, int stock, double precio) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.stock = stock;
        this.precio = precio;
        this.clasificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<String> getClasificaciones() {
        return clasificaciones;
    }

    public void agregarClasificacion(String clasificacion) {
        clasificaciones.add(clasificacion);
    }
}
