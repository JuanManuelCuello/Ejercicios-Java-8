
package introjava;

import java.util.Scanner;


public class EJ_13 {

   
    public static void main(String[] args) {
        
        int nota;
        
        
        Scanner leer = new Scanner(System.in);
        
        
        
        do {
        System.out.println("Ingrese una nota entre 0 y 10: ");
        
        nota = leer.nextInt(); 
        
          
        } while (nota<0 | nota>10); 
               
        
        System.out.println("La nota es correcta");
                
        
    
    }
}
