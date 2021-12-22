package relaciones;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones.entidades.Perro;
import relaciones.entidades.Persona;

public class EJ1 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        Perro perro1 = new Perro("Chiquito", "Grande", "Ovejero", "5");
        Perro perro2 = new Perro("Filomena", "chico", "caniche", "1");
        Perro perro3 = new Perro("Natasha", "mediana", "salchicha", "3");

        ArrayList<Perro> listaPerro = new ArrayList();
        ArrayList<Persona> listaPersona = new ArrayList();

        listaPerro.add(perro1);
        listaPerro.add(perro2);
        listaPerro.add(perro3);

        Persona persona1 = new Persona();
        persona1.setNombre("juan");
        persona1.setApellido("Cuello");
        persona1.setDoc("3333");
        persona1.setEdad("31");

        Persona persona2 = new Persona();
        persona2.setNombre("pedro");
        persona2.setApellido("rodriguez");
        persona2.setDoc("4444");
        persona2.setEdad("23");

        listaPersona.add(persona2);
        //Persona persona2 = new Persona("Manuel","Manolo","26","3746456");
        listaPersona.add(persona1);
        //listaPersona.add(persona2);

        System.out.println("Ingrese su DNI");
        String dni = leer.next();

        System.out.println("Que perro desea adoptar?, ingrese el nombre");
        for (Perro a : listaPerro) {
            System.out.println(a.getNombre());
        }

        String nomb = leer.next();
//                for (Perro a : listaPerro) {
//                    if (a.getNombre().equals(nomb)) {
//                        b.setPerro(a);
//                    }
//                }

        for (Persona b : listaPersona) {
            if (b.getDoc().equals(dni)) {
                b.adoptar(listaPerro, nomb);
            }
        }

//        for (Persona persona : listaPersona) {
//            System.out.println(persona);
//        }
//        listaPersona.forEach(( Persona persona) -> System.out.println(persona));
        ///**** PREGUNTAR ****
        listaPersona.forEach(System.out::println);

    }

}
