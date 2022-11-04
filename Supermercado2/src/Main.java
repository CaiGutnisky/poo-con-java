import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Caja> cajas = new ArrayList<Caja>();

        Scanner teclado = new Scanner(System.in);

        float totalCajas;
        int cantidadPlata, cantidadCajas, opcion;

        System.out.println("Digite la cantidad de cajas existentes:");
        cantidadCajas = teclado.nextInt();
        System.out.println("Digite la cantidad de plata que van a tener todas las cajas");
        cantidadPlata = teclado.nextInt();

        System.out.println("");
        System.out.println("");
        Caja caja = (Caja) new Caja(cantidadCajas, cantidadPlata);

        do {
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
            }
        } while (opcion != 3);
    }

    static  void menuCaja (List<Caja> cajas, Caja caja) {
        int opcion;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\n***MENU CAJAS***");
            System.out.println("1- Agregar Caja");
            System.out.println("2- Ver todas las cajas");
            System.out.println("3- Ir a una caja");
            System.out.println("4- Salir");
            System.out.println("Opcion --->");
            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println("Cantidad de Cajas que quiere agregar:");
                    int cantidadCajas = scanner.nextInt();

                    System.out.println("Que cantidad de plata tienen las cajas:");
                    int cantidadPlata = scanner.nextInt();

                    Caja cj = new Caja(cantidadCajas, cantidadPlata);

                    cajas.add(cj);

                    System.out.println("caja agregada correctamente");

                    break;

                case 2:

                    if (cajas.size() != 0) {

                        for (int i = 0; i < cajas.size(); i++) {
                            System.out.println("\nID ->" + i);
                            System.out.println("cantidad de plata en caja ->" + cajas.get(i).cantidadPlata);
                        }
                    } else {
                        System.out.println("No hay caja!! : (");
                    }
            }
        }while (opcion != 4);
    }
}
