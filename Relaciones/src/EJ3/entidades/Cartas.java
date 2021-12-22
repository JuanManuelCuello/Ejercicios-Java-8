package EJ3.entidades;

public class Cartas {

    private String palo;
    private int numero;

    public Cartas(String palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    public Cartas() {
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cartas{" + "palo=" + palo + ", numero=" + numero + '}';
    }

}
