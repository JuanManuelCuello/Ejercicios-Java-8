
package introjava;

import java.util.Scanner;

public class EJ_7 {

   
    public static void main(String[] args) {
   
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese los numeros para saber cual es el mayor: ");
        int num=leer.nextInt();
        int num1=leer.nextInt();
        
        if (num>num1) {
            System.out.println("El numero mayor es: "+num);
        }
            else {
                    System.out.println("El numero mayor es: "+ num1);
                    }
         
        
        
    }
    
}
