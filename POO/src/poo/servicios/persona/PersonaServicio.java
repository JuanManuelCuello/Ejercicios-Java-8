package poo.servicios.persona;

import java.util.Scanner;
import poo.entidades.persona.Persona;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        Persona persona = new Persona();

        System.out.println("Ingrese nombre");
        persona.setNombre(leer.next());

        System.out.println("Ingrese edad");
        persona.setEdad(leer.nextDouble());

        System.out.println("Ingrese peso en kg");
        persona.setPeso(leer.nextDouble());

        System.out.println("Ingrese la altura en metros");
        persona.setAltura(leer.nextDouble());

        System.out.println("Ingrese el sexo");
        String sexo = "x";
        boolean sex = true;
        do {
            sexo = leer.next();
            sexo = sexo.toUpperCase();

            switch (sexo) {

                case "M":
                    persona.setSexo(sexo);
                    break;
                case "F":
                    persona.setSexo(sexo);
                    break;
                case "O":
                    persona.setSexo(sexo);
                    break;

                default:
                    System.out.println("ingrese M o F o O");
                    break;
            }

            if (sexo.equals("M") || sexo.equals("F") || sexo.equals("O")) {
                sex = false;
            }

        } while (sex == true);

        return persona;

    }

    public double calcularIMC(Persona persona) {
        double peso = persona.getPeso();
        double altura = persona.getAltura();

        double imc = peso / (altura * altura);
        int retornoIMC = -1;
        if (imc < 20) {
            //System.out.println("el peso esta por debajo");
            
        } else if (imc > 20 && imc <= 25) {
           // System.out.println("el peso es ideal");
            retornoIMC = 0;
        } else {
           // System.out.println("Esta en sobre peso");
            retornoIMC = 1;
        }

        persona.setImc(retornoIMC);
        return retornoIMC;
    }

    public boolean esMayorDeEdad(Persona persona) {
        boolean esMayorDeEdad = (persona.getEdad() > 18);
        persona.setMayor(esMayorDeEdad);
        
        return esMayorDeEdad;
    }

}
