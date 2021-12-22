package relaciones.entidades;

public class Revolver {

    private double pActual, pAgua;

    public Revolver(double pActual, double pAgua) {
        this.pActual = pActual;
        this.pAgua = pAgua;
    }

    public Revolver() {
    }

    public double getpActual() {
        return pActual;
    }

    public void setpActual(double pActual) {
        this.pActual = pActual;
    }

    public double getpAgua() {
        return pAgua;
    }

    public void setpAgua(double pAgua) {
        this.pAgua = pAgua;
    }

    @Override
    public String toString() {
        return "Revolver{" + "pActual=" + pActual + ", pAgua=" + pAgua + '}';
    }

    /////////////////////////////   METODOS    ////////////////////////////////
    public void llenarRevolver() {

        pActual = (int) (Math.random() * 6 + 1);

        this.setpActual(pActual);

        pAgua = (int) (Math.random() * 6 + 1);

        this.setpAgua(pAgua);
        System.out.println("Actual:"+pActual+" ,Agua: "+pAgua);
    }

    public boolean mojar() {

          
        
        return (pActual == pAgua);

    }

    public void sigChorro() {

        double actual = this.getpActual() + 1;
        this.setpActual(actual);
        
        if (actual == 7) {
            this.setpActual(1);
        }

    }

}
