
package poo.principal.EJ2;


import java.util.Scanner;
import poo.entidades.circunferencia.Circunferencia;


public class EJ_2 {

    
    public static void main(String[] args) {
   
        Circunferencia circunferencia = new Circunferencia();
        Scanner leer = new Scanner(System.in);
        
        
        
      //  System.out.println("Ingrese el radio:");
        
        circunferencia.setRadio(leer.nextDouble());
        
        System.out.println("Area Circunferenica");
        System.out.println(circunferencia.areaCircunferencia());
        System.out.println("");
        
        System.out.println("Perimetro:");
        System.out.println(circunferencia.perimetroCircunferencia());
        
        
    }
    
}
