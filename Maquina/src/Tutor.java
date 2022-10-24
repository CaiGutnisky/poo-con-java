public class Tutor extends Usuario{

    //creame un atributo que sea de clase ALumno
    private Alumno alumno;

    public Tutor(int id, String nombre, String apellido, String correo, Alumno alumno) {
        super(id, nombre, apellido, correo);
        this.alumno = alumno;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public void mostrarCalificaciones() {
        System.out.println("Nombre del estudiante:" + alumno.nombre +" "+alumno.apellido);
        alumno.mostrarCalificacion();
    }
}
