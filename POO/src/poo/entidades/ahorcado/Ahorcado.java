
package poo.entidades.ahorcado;


public class Ahorcado {
    
    private String [] buscar;
    private String [] oculto;

    public String[] getOculto() {
        return oculto;
    }

    public void setOculto(String[] oculto) {
        this.oculto = oculto;
    }

    public Ahorcado(String[] oculto) {
        this.oculto = oculto;
    }
    private int letrasEncontradas;
    private int juagadasMaximas;

    public Ahorcado(String[] buscar, int letrasEncontradas, int juagadasMaximas) {
        this.buscar = buscar;
        this.letrasEncontradas = letrasEncontradas;
        this.juagadasMaximas = juagadasMaximas;
    }

    public Ahorcado() {
    }

    public String[] getBuscar() {
        return buscar;
    }

    public void setBuscar(String[] buscar) {
        this.buscar = buscar;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJuagadasMaximas() {
        return juagadasMaximas;
    }

    public void setJuagadasMaximas(int juagadasMaximas) {
        this.juagadasMaximas = juagadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "buscar=" + buscar + ", letrasEncontradas=" + letrasEncontradas + ", juagadasMaximas=" + juagadasMaximas + '}';
    }
    
    
    
    
    
    
    
    
    
    
}
