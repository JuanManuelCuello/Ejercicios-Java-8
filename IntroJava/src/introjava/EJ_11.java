
package introjava;

import java.util.Scanner;


public class EJ_11 {

    
    public static void main(String[] args) {
   
        String aux;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase para saber la primer letra: ");
        
        String frase = leer.next();
                
       aux=  frase.substring(0,1);
       
        
       
       aux=aux.toUpperCase();
     
       
        if (aux.equals("A")){
            System.out.println("Correcto");
        }
        else { System.out.println("incorrecto");
        
        
        }
      
    }
    
}
