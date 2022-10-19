//is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
// Abstract method: can only be used in an abstract class, and it does not have a body.
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;



    /* Constructores */

    Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    Persona() {
        this.createPerson();
    }



    /* Metodos Abstractos */

    public abstract void createPerson();
    public abstract void createAccount();
}
