package colecciones.servicios.Paises;

import colecciones.entidades.Paises.Paises;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class ServicioPaises {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private TreeSet<Paises> paises;

    public ServicioPaises(){
        paises=new TreeSet();
        
    }
    
    public Paises crearPais() {
        System.out.println("Ingrese un pais");

        Paises pais = new Paises();
        pais.setPais(leer.next());

        return pais;
    }

    public void agregarPais(Paises a) {
        paises.add(a);

    }

    public void mostrarPaises(){
        for (Paises a : paises) {
            System.out.println(a);
        }
    }
        
    public boolean eliminarPais (String pais){
        
        boolean result = false;
        
        Iterator it = paises.iterator();
        while (it.hasNext()) {
            Paises aux = (Paises) it.next();
            if (aux.getPais().equals(pais)) {
                it.remove();
                
                result = true;
            }
        }
        return result;
    }
    
    
}
