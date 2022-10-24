

public class Usuario {
    protected final int id;
    protected final String nombre;
    protected final String apellido;
    protected final String correo;

    //metodo constructor
    public Usuario(int id, String nombre, String apellido, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }

    public void mostrarDtos() {
        System.out.println("id:" +id);
        System.out.println("nombre:" +nombre);
        System.out.println("apellido:" +apellido);
        System.out.println("correo:" +correo);
    }
}
