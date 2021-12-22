
package introjava;

import java.util.Scanner;


public class EJ_4 {

    
    public static void main(String[] args) {
   
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
;
        System.out.println("Ingrese Frase: ");
        
        String mayus,minus, frase=leer.next();
        
        
        mayus = frase.toUpperCase();
        minus = frase.toLowerCase();
        
        System.out.println("La frase en mayuscula es: "+ mayus);
        System.out.println("La fease en minuscula es: "+ minus);      
    }
    
}
