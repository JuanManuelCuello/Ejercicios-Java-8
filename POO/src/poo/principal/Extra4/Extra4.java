
package poo.principal.Extra4;

import poo.entidades.NIF.NIF;
import poo.servicios.NIF.NIFServicio;


public class Extra4 {

   
    public static void main(String[] args) {
   
    NIF nif = new NIF();
    NIFServicio nifservicio = new NIFServicio();
    
    
    NIF n1 = nifservicio.crearNif();
    
    nifservicio.mostrar(n1);
    
    
    
    }
    
}
