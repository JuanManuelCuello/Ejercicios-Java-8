
package introjava;

import java.util.Scanner;


public class EJ_16 {

   
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 20 numeros para realizar la suma");
        System.out.println("");
        
        int num,contador,suma;
        contador=0;
        suma=0;
        boolean band=true;
        do  {
            System.out.println("Ingrese el numero "+ contador);
            
            num = leer.nextInt();
            
            if (num>0) {
            contador++;
            suma=num+suma;
            }
            if (num==0) {
                System.out.println("se capturó el numero cero");
                band=false;
            }
            if (contador==20) {
                band=false;
            }
        }
                
        while (band==true);
        
        System.out.println("La suma de los numeros ingresados es: "+ suma );
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
