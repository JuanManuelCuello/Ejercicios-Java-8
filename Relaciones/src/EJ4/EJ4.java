
package EJ4;

import EJ4.Entidades.Cine;
import EJ4.Entidades.Espectador;
import EJ4.Entidades.Pelicula;
import java.util.ArrayList;

public class EJ4 {

    public static void main(String[] args) {
    
         
         ArrayList <Espectador> espec = new ArrayList();
      //   ArrayList <Cine> sala = new ArrayList();

       
        Pelicula pelicula1 = new Pelicula("Duro de matar", "Matilda", "4h20m", 17);
        
        Cine cine = new Cine();
        
        //////////CREAR ARRAYLIST DE ESPECTADORES////////////////
        int random = (int) (Math.random() * 50 - 2);
        int edad = 7;
        int dinero = 2;
        
        for (int i = 0; i < random; i++) {
            edad = (int) (Math.random() * 100 - 2);
            dinero = (int) (Math.random() * 1000);
            Espectador espectador1 = new Espectador(i , edad, dinero );
            espec.add(espectador1);
        }
//        
//       for (Espectador e : espec) {          
//            System.out.println(e);
//       }
//        
        
          //  cine.llenarSala(espec);
            
            cine.mostrarSala();

    }
    
    
}
