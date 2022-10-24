import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        float calif;
        Scanner entrada = new Scanner (System.in);

        Maestro m1 = new Maestro(1, "Juan", "G", "v1@mail");
        Alumno a1= new Alumno(1,"pepe", "pepe", "dsadsa@mail.com");
        Alumno a2 = new Alumno(2,"sisi", "nono" , "dasdas@mail.com");
        Tutor t1= new Tutor(1,"reere","titi", "asdasdasd@mail.com", a1);

        System.out.println("\ndatos de los maestros");
        m1.mostrarDtos();

        System.out.println("\ndatos de los alumnos");
        a1.mostrarDtos();
        a2.mostrarDtos();

        System.out.println("\ndatos de los tutores");
        t1.mostrarDtos();


        System.out.println("indicame la calificacion de alumno " + a1.nombre + " " + a1.apellido);
        calif = entrada.nextFloat();
        a1.guardarCalificacion(calif);

        System.out.println("indicame la calificacion de alumno " + a2.nombre + " " + a2.apellido);
        calif = entrada.nextFloat();
        a1.guardarCalificacion(calif);

        System.out.println("\nTutor asignado:");
        t1.mostrarDtos();
        t1.mostrarCalificaciones();
        System.out.println("\n------------------");
    }
}
