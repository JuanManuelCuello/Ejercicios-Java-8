
package poo.principal.Extra2;

import poo.entidades.Puntos.Puntos;
import poo.servicios.Puntos.PuntosServicio;




public class Extra2 {

    
    public static void main(String[] args) {
   
       Puntos puntos = new Puntos();
       PuntosServicio puntosservicio = new PuntosServicio();
       
       Puntos punto1 = puntosservicio.crearPuntos();
       
       
       
        System.out.println("la distancia de los dos puntos es: "+puntosservicio.calcularPuntos(punto1)); 
        
        
        
        
        
    }
    
}
