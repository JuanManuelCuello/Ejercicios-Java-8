
package poo.servicios.persona12;

import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;
import poo.entidades.persona12.Persona12;




public class Persona12Servicio {
    
    Persona12 persona = new Persona12();
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public Persona12 crearPersona12(){
        System.out.println("Ingrese su nombre");
        persona.setNombre(leer.next());
        
        System.out.println("Ingrese día:");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes:");
        int mes = leer.nextInt();
        mes = mes - 1;
        System.out.println("Ingrese año:");
        int anio = leer.nextInt();
        anio = anio - 1900;

        Date fecha = new Date(anio,mes,dia);

        persona.setFecha(fecha);
        
        System.out.println(fecha);
        return persona;
    }
    
    public int calcularEdad(Persona12 persona){
        
        Date actual = new Date();
        Date fecha = persona.getFecha();
        
        int edad = actual.getYear()-(fecha.getYear());
        
        System.out.println(edad);
        
        
         return edad ;
    }
    
    public void menorQue(Persona12 persona){
        
        Date fecha2 = new Date(2003-1900,6-1,3);
        Date fecha = persona.getFecha();
         
        System.out.println("Es menor de edad?"); 
        System.out.println(fecha.after(fecha2));
        
        
    }
    
    public void mostrarPersona(Persona12 persona){
        
        System.out.println(persona.toString());
        
        
    }
    
}
