import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Libro> libros = new ArrayList<Libro>();

        Scanner teclado = new Scanner(System.in);
        String nombre, apellido, dni;
        int numeroCuenta, opcion;
        double saldo, cantidadDinero;

        System.out.print("Digite el nombre del cliente : ");
        nombre = teclado.next();

        System.out.print("Digite el apellido del cliente : ");
        apellido = teclado.next();

        System.out.print("Digite el dni del cliente : ");
        dni = teclado.next();

        System.out.print("Digite el numero de cuenta : ");
        numeroCuenta = teclado.nextInt();

        System.out.print("Digite el saldo de la cuenta : ");
        saldo = teclado.nextDouble();
        System.out.println(""); System.out.println("");

        Cuenta cuenta = (Cuenta) new Cuenta(numeroCuenta, saldo);
        Cliente cliente = (Cliente) new Cliente(nombre, apellido, dni, cuenta);

        do{
            System.out.println("\n\tMENU");
            System.out.println("1 . Ingresar saldo a la cuenta");
            System.out.println("2 . Retirar saldo de la cuenta");
            System.out.println("3 . Consultar saldo de la cuenta");
            System.out.println("4 . Salir");
            System.out.print("Digite una opcion : ");
            opcion = teclado.nextInt();

            switch(opcion){
                case 1:
                    System.out.print("\nDigite el numero de cuenta : ");
                    numeroCuenta = teclado.nextInt();

                    if (numeroCuenta != cuenta.getNumeroCuenta()) {
                        System.out.println("\nCuenta no encontrada , verifique su número de cuenta");
                        System.out.println("");
                    } else{
                        System.out.print("Digite la cantidad de dinero a depositar : ");
                        cantidadDinero = teclado.nextDouble();

                        cliente.ingresarDinero(cantidadDinero);
                        System.out.println("\nDeposito con exito ");
                        System.out.print("Saldo disponible : " + cliente.consultarSaldo());
                        System.out.println("");
                    }

                    break;

                case 2:
                    System.out.print("\nDigite el numero de cuenta : ");
                    numeroCuenta = teclado.nextInt();

                    if (numeroCuenta != cuenta.getNumeroCuenta()) {
                        System.out.println("\nNo existe una cuenta con ese número");
                        System.out.println("");
                    }
                    else{
                        System.out.print("\nDigite la cantidad de dinero a retirar : ");
                        cantidadDinero = teclado.nextDouble();

                        if (cliente.consultarSaldo() < cantidadDinero){
                            System.out.print("Saldo insuficiente");
                            System.out.println("");
                        }else{
                            cliente.retirarDinero(cantidadDinero);
                            System.out.println("");
                            System.out.println("Retiro con exito");
                            System.out.println(
                                    "Saldo disponible de la cuenta : " + cliente.consultarSaldo());
                            System.out.println("");
                        }
                    }

                    break;

                case 3:
                    System.out.print("\nDigite el numero de cuenta : ");
                    numeroCuenta = teclado.nextInt();

                    if (numeroCuenta != cuenta.getNumeroCuenta()){
                        System.out.println("\nNo existe una cuenta con ese número");
                        System.out.println("");
                    } else {
                        System.out.println("Saldo disponible : " + cliente.consultarSaldo());
                        System.out.println("");
                    }
                    break;

                case 4:
                    System.out.println("\nGracias por elegirnos");
                    opcion = 4;
                    break;

                default:
                    System.out.println("\nOpcion no disponible , vuelva a digitar");
                    break;
            }
        }while(opcion != 4);

        menuTienda(libros);

    }




    static void menuTienda(List<Libro> libros) {

        Tienda tienda = new Tienda();

        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1) Agregar un Libro.");
            System.out.println("2) Ir a la Biblioteca.");
            System.out.println("3) Ver mi carrito.");
            System.out.println("4) Salir.");
            System.out.println("4) Ir al banco.");
            System.out.print("Opcion -> ");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    /* Agregar Libro */

                    System.out.println("-Nombre del Libro: ");
                    String nombreLibro = scanner.next();

                    System.out.println("-Autor del Libro: ");
                    String autorLibro = scanner.next();

                    System.out.println("-Genero del Libro: ");
                    String generoLibro = scanner.next();

                    System.out.println("-Precio: ");
                    int precioLibro = scanner.nextInt();

                    System.out.println("-codigo: ");
                    int codigoLibro = scanner.nextInt();

                    System.out.println("Stock: ");
                    int cantidadLibro = scanner.nextInt();

                    Libro lb = new Libro(nombreLibro, autorLibro, generoLibro, precioLibro, cantidadLibro, codigoLibro);

                    // Agrega el articulo a los articulos globales.
                    libros.add(lb);

                    System.out.println("Articulo agregado correctamente.");

                    //menuTienda(libros);

                    break;

                case 2:

                    /* Mostrar biblioteca */

                    if (libros.size() != 0) {
                        for (int i = 0; i < libros.size(); i++) {

                            System.out.println("\nID -> " + i);
                            System.out.println("Libro -> " + libros.get(i).getTituloLibro());
                            System.out.println("Autor -> " + libros.get(i).getAutorLibro() + "\n");
                            System.out.println("Genero -> " + libros.get(i).getGeneroLibro() + "\n");
                            System.out.println("Precio -> $" + libros.get(i).getPrecioLibro());
                            System.out.println("Stock -> " + libros.get(i).getCantidadLibro());

                        }

                    } else {
                        System.out.println("No hay libros en la biblioteca! :(");
                    }

                    /* Agregar libro al carrito */
                    int tiendaOpcion;
                    int idLibroComprar;

                    do {
                        System.out.println("\n=== MENU ===");
                        System.out.println("1) Comprar");
                        System.out.println("2) Volver");
                        System.out.print("Opcion -> ");
                        tiendaOpcion = scanner.nextInt();

                    } while (tiendaOpcion != 1 && tiendaOpcion != 2);

                    if (tiendaOpcion == 1) {

                        System.out.println("Ingresa el ID del articulo: ");
                        idLibroComprar = scanner.nextInt();

                        try {
                            tienda.addLibro(libros.get(idLibroComprar));
                        } catch (Exception e) {
                            System.out.println("No existe ningun articulo con ese ID.");
                        }
                    }

                    //menuTienda(libros);
                    break;

                case 3:

                    /* Mostrar Carrito */
                    tienda.mostrarCarrito();

                    //menuTienda(libros);

                    break;

            }
        } while (opcion != 4);
    }
}
