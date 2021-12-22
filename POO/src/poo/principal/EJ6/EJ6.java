
package poo.principal.EJ6;

import java.util.Scanner;
import poo.entidades.cafetera.Cafetera;
import poo.servicios.Nesspresso.NespressoServicio;


public class EJ6 {

   
    public static void main(String[] args) {
   
        NespressoServicio nespressoservicio = new NespressoServicio();
        
        
        
        Scanner leer = new Scanner(System.in);
        
        

        System.out.println("-- [MENU NESPRESSO] --");
        System.out.println("");
                
        int selec = 1;

        Cafetera nespresso = nespressoservicio.crearCafetera();

        System.out.println(" 1  - Llenar cafetera ");
        System.out.println(" 2  - Servir Taza ");
        System.out.println(" 3  - Vaciar Cafetera");
        System.out.println(" 4  - Agregar Cafe");
        System.out.println(" 5  - Salir");

        do {
            System.out.println("");
            System.out.println("-- Seleccione una opción --");
            System.out.println("");
            selec = leer.nextInt();
            System.out.println("");

            switch (selec) {

                case 1:
                    nespressoservicio.llenarCafetera(nespresso);
                    System.out.println("");
                    break;
                case 2:
                    nespressoservicio.servirTaza(nespresso);
                    System.out.println("");
                    break;
                case 3:
                    nespressoservicio.vaciasCafetera(nespresso);
                    System.out.println("");
                    break;
                case 4:
                   nespressoservicio.agregarCafe(nespresso);
                    System.out.println("");
                    break;
                
                case 5:
                    System.out.println("Hasta luego");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");
                    break;

            }
        } while (selec != 5);

    }

}

        
        
    
    

