
package poo.principal.EJ3;

import java.util.Scanner;
import poo.entidades.operacion.Operacion;


public class EJ_3 {

        public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        Operacion operaciones = new Operacion();
            
            System.out.println("Ingrese los dos numeros");    
            
            operaciones.setNumero1(leer.nextInt());
            operaciones.setNumero2(leer.nextInt());
        
            System.out.println("Suma:"+ operaciones.sumar());    
            System.out.println("resta:"+ operaciones.restar());
            System.out.println("division:"+ operaciones.dividir());
            System.out.println("multiplicacion:"+ operaciones.multiplicar());
            
        if (operaciones.multiplicar()==0) {
            System.out.println("No se puede multiplicar por cero");
        }    
        
        if (operaciones.dividir()==0) {
            System.out.println("No se puede dividir por cero");
        }    
        
        
        
    }
  

        
        
        
}
