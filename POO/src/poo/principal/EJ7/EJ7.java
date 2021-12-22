package poo.principal.EJ7;

import poo.entidades.persona.Persona;
import poo.servicios.persona.PersonaServicio;

public class EJ7 {

    public static void main(String[] args) {

        PersonaServicio personaServicio = new PersonaServicio();

        Persona p0 = null;
        try{
        personaServicio.esMayorDeEdad(p0);
        }catch(Exception e){
            System.out.println("error: "+e);
        }
        
        
        
        System.out.println("Datos Persona 1");
        Persona p1 = personaServicio.crearPersona();
        System.out.println("Datos Persona 2");
        Persona p2 = personaServicio.crearPersona();
        System.out.println("Datos Persona 3");
        Persona p3 = personaServicio.crearPersona();
        System.out.println("Datos Persona 4");
        Persona p4 = personaServicio.crearPersona();
         
         
        Persona[] personas = {p1, p2, p3, p4};

        int bajo = 0;
        int ideal = 0;
        int sobre = 0;

        for (Persona persona : personas) {
            personaServicio.calcularIMC(persona);

        }

        for (Persona persona : personas) {
            if (persona.getImc() == -1) {
                bajo++;

            } else if (persona.getImc() == 1) {
                sobre++;

                if (persona.getImc() == 0) {
                    ideal++;

                }
            }
        }
        System.out.println("bajo " + bajo);
        System.out.println("sobre " + sobre);
        System.out.println("ideal " + ideal);
        
        for (Persona persona : personas) {
            System.out.println(persona.getImc());

        }

        double porcentaje = 0;
        if (bajo != 0) {
            porcentaje = (bajo * 100) / 4;
            System.out.println("Hay " + porcentaje + ("% con bajo peso"));

        }

        porcentaje = 0;
        if (ideal != 0) {
            porcentaje = (ideal * 100) / 4;

            System.out.println("Hay " + porcentaje + ("% con peso ideal "));
        }

        porcentaje = 0;
        if (sobre != 0) {
            porcentaje = (sobre * 100) / 4;
            System.out.println("Hay " + porcentaje + ("% con sobre peso"));
        }

        int mayor = 0;
        for (Persona persona : personas) {
            if (personaServicio.esMayorDeEdad(persona) == true) {
                mayor++;
            }
        }

        porcentaje = 0;
        if (mayor != 0) {
            porcentaje = (mayor * 100) / 4;
            System.out.println("Hay " + porcentaje + ("% mayores de edad"));
        }

    }

//        for (int i = 0; i < 3; i++) {
//            Persona persona = personas[i];
//        }
}
