
package poo.entidades.cafetera;



public class Cafetera {

    private int maxima;
    private int actual;

    public Cafetera(int maxima, int actual) {
        this.maxima = maxima;
        this.actual = actual;
    }

    public Cafetera() {
    }

    public int getMaxima() {
        return maxima;
    }

    public void setMaxima(int maxima) {
        this.maxima = maxima;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }

    @Override
    public String toString() {
        return "Cafetera{" + "maxima=" + maxima + ", actual=" + actual + '}';
    }
    
    











    
}
