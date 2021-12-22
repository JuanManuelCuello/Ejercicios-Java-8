
package colecciones.entidades.Paises;


import java.util.Objects;


public class Paises implements Comparable <Paises> {

private String pais;

    public Paises () {
       // private TreeSeet<Paises> paises;
       
    }

    public Paises(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Paises{" + "pais=" + pais + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Paises t) {
        
        return this.pais.compareTo(t.getPais());
       
    }

//this.pais.compareTo(t.getPais());
    
}
