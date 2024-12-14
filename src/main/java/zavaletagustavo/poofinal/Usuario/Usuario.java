package zavaletagustavo.poofinal.Usuario;

public abstract class Usuario {
    
    private String nombre;
    private String tipoUsuario;

    public Usuario(String nombre, String tipoUsuario) {
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public abstract void mostrarOpciones();
}
