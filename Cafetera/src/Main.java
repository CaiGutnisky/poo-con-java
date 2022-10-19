public class Main {
    public static void main(String[]args) {
        Cafetera a = new Cafetera(11, 11);
        a.agregarCafe(10);
        a.mostrarCafetera();

        Cafetera b= new Cafetera();
        b.llenarCafetera();
        b.servirTaza(200);
        b.mostrarCafetera();
    }
}
