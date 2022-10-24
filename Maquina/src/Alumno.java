public class Alumno  extends Usuario{

    private float calificacion;

    public Alumno(int id, String nombre, String apellido, String correo) {
        super(id, nombre, apellido, correo);
    }

    public float guardarCalificacion(float calificacion) {
        this.calificacion = calificacion;
        return calificacion;
    }

    public void mostrarCalificacion() {
        System.out.println("calificacion:" +calificacion);
    }


}
