
package EJ1;

import MascotaServicio.MascotaServicio;
import java.util.ArrayList;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;


public class EJ1 {

  
    public static void main(String[] args) {
 
        
        
        MascotaServicio servMas = new MascotaServicio();
        Scanner leer = new Scanner(System.in);
        String condi;
        
        
        do {
            servMas.crearMascota();
            
            System.out.println("Si desea salir presione E");
            condi = leer.next();
            condi=condi.toUpperCase();
            
           
        } while (!"E".equals(condi));
        
        servMas.mostrarMascota();
        
        
        System.out.println("Ingrese la raza que desea eliminar, o escriba NO");
        
        servMas.removerMascota(leer.next());
        
        servMas.mostrarMascota();
        
    }
    
}
