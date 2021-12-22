
package poo.principal.EJ4;

import java.io.PrintStream;
import poo.entidades.rectangulo.Rectangulo;


public class Ej_4 {

    
        public static void main(String[] args) {
   
            Rectangulo rectangulo = new Rectangulo();
            
            rectangulo.crearRectangulo();
            
            System.out.println("La superficie es: "+ rectangulo.calcularSuperficie() );
           
            System.out.println("");
            
            System.out.println("El perimetro es: "+ rectangulo.calcularPerimetro() );
            
            System.out.println("");
            
            rectangulo.dibujar();
            
        }
    
}
