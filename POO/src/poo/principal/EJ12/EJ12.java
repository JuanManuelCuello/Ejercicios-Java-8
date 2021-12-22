
package poo.principal.EJ12;

import poo.entidades.persona12.Persona12;
import poo.servicios.persona12.Persona12Servicio;


public class EJ12 {

    public static void main(String[] args) {
     
        Persona12Servicio persona12servicio = new Persona12Servicio();
        
        Persona12 persona12 = persona12servicio.crearPersona12();
        
        persona12servicio.calcularEdad(persona12);
        persona12servicio.menorQue(persona12);
        persona12servicio.mostrarPersona(persona12);
        
        
        
        
        
    }
    
}
