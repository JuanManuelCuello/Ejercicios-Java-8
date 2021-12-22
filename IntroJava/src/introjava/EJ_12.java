
package introjava;

import java.util.Scanner;

public class EJ_12 {

    public static void main(String[] args) {

       Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un valor entre el 1 y el 4"); 
       
        int motor=leer.nextInt();
        
        switch (motor) {
            
            case 1: System.out.println("Es una bomba agua");
            break;
            case 2: System.out.println("Es una bomba de gasolina");
            break;
            case 3: System.out.println("Es una bomba de hormigon");
            break;
            case 4: System.out.println("Es una bomba de pasta alimenticia");       
            break;
            default: System.out.println("No existe un valor valido para el tipo de bomba");   
        
        
        
         }
            
    }
    
}
