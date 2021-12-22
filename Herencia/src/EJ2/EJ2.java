package EJ2;

import EJ2.Entidades.Electrodomesticos;
import EJ2.Entidades.Lavadora;
import EJ2.Entidades.Televisor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EJ2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        List <Electrodomesticos> lista = new ArrayList();
        
        Lavadora lavadora = new Lavadora();
        Televisor tele = new Televisor();
       
        int cont=0;
        String aux;
        
        do {
        System.out.println("===== Lavadora(L) ||| Televisor(T) ======");
        aux = input.next();
        aux = aux.toUpperCase();
            if (aux.equals("L")) {
                lavadora.crearLavadora();
                lavadora.precioFinal();
                lista.add(lavadora);
            }
        
           if (aux.equals("T")) {
               tele.crearTelevisor();
               tele.precioFinal();
               lista.add(tele);
            } 
            

        cont++;
            System.out.println(cont);
            
        }while(cont != 2);
     
        int precio = 0;
        
        for (Electrodomesticos a : lista) {
            
            System.out.println(a);
            precio += a.getPrecio();
        }
        
        System.out.println("Precio total: $"+precio);
        
        
        
    }

    
    
}

