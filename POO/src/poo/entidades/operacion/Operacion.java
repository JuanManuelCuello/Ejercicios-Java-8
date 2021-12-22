package poo.entidades.operacion;

public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int sumar() {
        int suma = numero1 + numero2;
        return suma;

    }

    public int restar() {
        int restar = numero1 - numero2;
        return restar;
    }

    public int multiplicar() {

        if ((numero1 == 0 || numero2 == 0)) {
            return 0;
        } else {
            int multiplicar = numero1 * numero2;
            return multiplicar;
        }

    }

    public int dividir() {

        if ((numero1 == 0 || numero2 == 0)) {
            return 0;
        } else {
            int dividir = numero1 / numero2;
            return dividir;
        }

    }
    
    
}
