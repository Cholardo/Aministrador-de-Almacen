package zavaletagustavo.poofinal.Usuario;


public class Empleado extends Usuario {
    public Empleado(String nombre) {
        super(nombre, "Empleado");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones de Empleado:");
        System.out.println("1. Ver productos");
        System.out.println("2. Modificar stock");
    }
}