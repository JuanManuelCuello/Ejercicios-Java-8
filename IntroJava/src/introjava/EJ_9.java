
import java.util.Scanner;


public class EJ_9 {

    
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase");
        
        String frase = leer.next();
        
        if (frase.equals("eureka"))  {
            System.out.println("Correcto");
        
    }
        else {
            System.out.println("Incorrecto");
        }
     
        
    }
    
}
