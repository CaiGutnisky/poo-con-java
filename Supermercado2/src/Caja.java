import java.util.ArrayList;

public class Caja {

    private ArrayList <Caja> cajas;

    private float totalCajas;
    public int cantidadPlata;
    public int cantidadCajas;

    public Caja( int cantidadPlata, int cantidadCajas) {;
        this.cantidadPlata = cantidadPlata;
        this.cantidadCajas = cantidadCajas;
    }

    public int getCantidadPlata() {
        return cantidadPlata;
    }

    public int getCantidadCajas() {
        return cantidadCajas;
    }

    Caja() {
        this.cajas = new ArrayList<Caja>();
    }

    public void addCajas(Caja caja) {
        if(caja.getCantidadCajas() != 0) {
            caja.sacarCaja();
            this.cajas.add(caja);

            this.calcularCajas();

            System.out.println("caja agregada correctamente.");
        }
    }

    public float getTotalCajas() {
        return totalCajas;
    }



    public void sacarCaja() {
        this.cantidadCajas --;
    }

    private void calcularCajas() {

        this.setTotalCajas(0);

        for(int i = 0; i < this.cajas.size(); i++) {
            this.totalCajas += this.cajas.get(i).getTotalCajas();
        }

    }

    private void setTotalCajas(float totalPagar) { this.totalCajas = totalPagar; }
    public float getTotalCajas;
}
