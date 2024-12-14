
package zavaletagustavo.poofinal.Usuario;

public class Jefe extends Usuario {
    public Jefe(String nombre) {
        super(nombre, "Jefe");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones de Jefe:");
        System.out.println("1. Ver productos");
        System.out.println("2. Modificar stock");
        System.out.println("3. Gestionar almacenes");
    }
}