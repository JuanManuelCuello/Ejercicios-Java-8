
package introjava;

import java.util.Scanner;


public class EJ_5 {

    
    public static void main(String[] args) {
 
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese los grados centigrados para mostrar su equivalente en fahrenheit: ");
        
        float fh, grados = leer.nextFloat();
        
        fh = 32+(grados * 9/5);
        
        System.out.println("La conversion es: "+ fh);
    }
    
}
