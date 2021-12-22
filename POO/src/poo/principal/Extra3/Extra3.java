
package poo.principal.Extra3;

import poo.entidades.raices.Raices;
import poo.servicios.RacicesServicio.RaicesServicio;


public class Extra3 {

  
    public static void main(String[] args) {
 
        Raices raices = new Raices();
        RaicesServicio raicesservicio = new RaicesServicio();
        
        Raices R1 = raicesservicio.crearEcuacion();
        
        System.out.println("discriminante");
        System.out.println(raicesservicio.getDiscriminante(R1));
        System.out.println("---------------");
        System.out.println("tiene raices");
        System.out.println(raicesservicio.tieneRaices(R1));
        System.out.println("---------------");
        System.out.println("tiene raiz");
        System.out.println(raicesservicio.tieneRaiz(R1));
        System.out.println("---------------");
        System.out.println("obtener raiz");
        raicesservicio.obtenerRaiz(R1);
        System.out.println("--------------");
        System.out.println("obtener raices");
        raicesservicio.obtenerRaices(R1);
        System.out.println("--------------");
        System.out.println("calcular");
        raicesservicio.calcular(R1);
        
    }
    
}
