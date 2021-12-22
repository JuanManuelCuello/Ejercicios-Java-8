
package introjava;

import java.util.Scanner;


public class EJ_10 {

    public static void main(String[] args) {
        
        
       Scanner leer = new Scanner(System.in);
       
        System.out.println("ingrese una frase");
        
        String frase = leer.next();
        
         if (frase.length()==8)  {
            System.out.println("Correcto");
        
    }
        else {
            System.out.println("Incorrecto");
        }
     
        
         
    }
    
}
  
        
   
