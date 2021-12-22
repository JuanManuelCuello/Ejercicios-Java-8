
package poo.entidades.Cadena;



public class Cadena {

    private String frase;
    private int longi;
    private String letra;

    public Cadena(String frase, int longi, String letra) {
        this.frase = frase;
        this.longi = longi;
        this.letra = letra;
    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongi() {
        return longi;
    }

    public void setLongi(int longi) {
        this.longi = longi;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longi=" + longi + ", letra=" + letra + '}';
    }
    
    




 
    
}
