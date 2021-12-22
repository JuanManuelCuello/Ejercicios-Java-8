package colecciones.principal.EJ5conjuntos;

import colecciones.entidades.Paises.Paises;
import colecciones.servicios.Paises.ServicioPaises;
import java.util.Scanner;

public class EJ5 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioPaises serv = new ServicioPaises();
        String seguir;
        
        do {
            Paises a = serv.crearPais();
            serv.agregarPais(a);
            System.out.println("Desea agregar otro país? s/n");
            seguir = leer.next();
        } while ("s".equals(seguir));

        serv.mostrarPaises();
        
        System.out.println("Ingrese un pais para eliminar");
        
        
        serv.eliminarPais(leer.next());
        
        serv.mostrarPaises();
        
        
        
        
        
    }

     
    
    
    
    
}
