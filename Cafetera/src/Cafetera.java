public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;



    /**
     *se aplican los Getters y Setters
     *
     */

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    //se empiezan a declarar los constructores

    //se establece la capacidad maxima en 1000 y se inicializa la cantidad actual
    public Cafetera (){
        capacidadMaxima = 1000;
        cantidadActual = 0;
    }

    //llena la cafetera a la capacidad maxima
    public Cafetera (int capacidadMaxima) {
        cantidadActual = capacidadMaxima;
        this.capacidadMaxima = capacidadMaxima;
    }


    //contiene la capacidad maxima y la actual, si la actual es superior, la ajusta al maximo
    public Cafetera (int capacidadMaxima, int cantidadActual)
    {
        this.capacidadMaxima = capacidadMaxima;

        this.cantidadActual = (cantidadActual > capacidadMaxima) ? capacidadMaxima :
                cantidadActual;
        /*usamos el operador condicional para que si la cantidad actual supera a la maxima
         *la cantidad maxima, sea la actual (adopta el valor)
         */
    }







    //empezamos a declarar los metodos
    public double llenarCafetera(){
        cantidadActual=capacidadMaxima;
        //la cantidad actual, es llenada a su capacidadMaxima
        return cantidadActual;
    }

    public void servirTaza(int taza){




        if (taza > cantidadActual){

            vaciarCafetera();
        }else
            cantidadActual -= taza;
        //la cantidad actual menos la taza servida, sera el resultado de cantidadActual


    }

    public double vaciarCafetera(){
        cantidadActual=0;
        return cantidadActual;

    }

    public double agregarCafe(int relleno){

        if (relleno + cantidadActual> capacidadMaxima)
            cantidadActual=capacidadMaxima;
        else cantidadActual = cantidadActual + relleno;
        // se le añade a cantidadActual, la cantidad introducida
        return cantidadActual;

    }
    public void mostrarCafetera(){
        System.out.println(cantidadActual+ " " + capacidadMaxima);
    }
}