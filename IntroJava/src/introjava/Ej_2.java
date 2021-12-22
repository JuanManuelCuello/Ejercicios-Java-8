
package introjava;

import java.util.Scanner;


public class Ej_2 {

   
    public static void main(String[] args) {
  
 
        Scanner leer = new Scanner(System.in); 
        
        int num1, num2, suma;
        
        System.out.println("ingresa tus numeros para sumar:");
        
            
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        suma = num1 + num2;
        
       
        System.out.println("el resultado de la suma es "+ suma);
        
    }    
        
}
