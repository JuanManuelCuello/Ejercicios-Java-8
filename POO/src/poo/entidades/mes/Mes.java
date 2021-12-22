
package poo.entidades.mes;

import java.util.Arrays;


public class Mes {

private String [] vector = {"enero", "febrero", "marzo", "abril","mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};

private String MesSecreto = vector[(int) (Math.random() * 11)];

    public Mes() {
    }

    public String[] getVector() {
        return vector;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public String getMesSecreto() {
        return MesSecreto;
    }

    public void setMesSecreto(String MesSecreto) {
        this.MesSecreto = MesSecreto;
    }

    @Override
    public String toString() {
        return "Mes{" + "vector=" + Arrays.toString(vector) + ", MesSecreto=" + MesSecreto + '}';
    }














    
}
