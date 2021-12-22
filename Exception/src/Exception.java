

import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {

        int secret = (int) (Math.random() * 500);
        Scanner leer = new Scanner(System.in);
        int aux = 600;
        int cont = 0;
        
        
        do {
        aux = 900;
            cont++;
            System.out.println("ingrese un número");
        try{
        aux = leer.nextInt();
        
        }catch (Exception e){
           System.out.println("error: "+e);
           
        }
        
          
            
            
            if (aux > secret) {
                System.out.println("ingrese un número menor");
            } else {
                System.out.println("ingrese un número mayor");
            }

        } while (aux!=secret);
        
        System.out.println("Felicidades adivinó, el número secreto es: "+secret);
    
           
        
        
        
        
        
        
    
    }
    
    

}
