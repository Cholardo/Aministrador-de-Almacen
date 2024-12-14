
package zavaletagustavo.poofinal.Usuario;

public class Visitante extends Usuario {
    public Visitante(String nombre) {
        super(nombre, "Visitante");
    }

    @Override
    public void mostrarOpciones() {
        System.out.println("Opciones de Visitante:");
        System.out.println("1. Ver productos");
    }
}
