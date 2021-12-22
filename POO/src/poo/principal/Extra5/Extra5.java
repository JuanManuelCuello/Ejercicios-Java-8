
package poo.principal.Extra5;

import java.util.Scanner;
import poo.entidades.mes.Mes;


public class Extra5 {

    public static void main(String[] args) {

        Mes mes = new Mes();
        Scanner leer = new Scanner(System.in);
        String usuario = "e";
        
        String secret= mes.getMesSecreto();
        
        System.out.println("Adivine el mes secreto");
        
        //System.out.println("Secreto es "+secret);
        
        do {
            
            usuario = leer.next();
            
            if (usuario.equals(secret)){
                System.out.println("Ha acertado");                
            }
            else { System.out.println("Mes incorrecto intente de nuevo");   }
            
            
            
        } while (!usuario.equals(secret)); 
            





    }
    
}
