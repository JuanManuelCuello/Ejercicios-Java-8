package poo.servicios.Cadena;

import java.util.Scanner;
import poo.entidades.Cadena.Cadena;

public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena cadena = new Cadena();

    public Cadena crearCadena() {

        System.out.println("Ingrese una frase o palabras separadas con espacios en blanco");
        String caden1 = leer.next();
        cadena.setFrase(caden1);

        cadena.setLongi(caden1.length());

        return cadena;

    }

    public void MostrarVocales(Cadena cadena) {
        String frase = cadena.getFrase();
        int cont = 0;

        for (int i = 0; i < cadena.getLongi(); i++) {
            if (frase.substring(i, i + 1).equals("a") || frase.substring(i, i + 1).equals("o") || frase.substring(i, i + 1).equals("e") || frase.substring(i, i + 1).equals("i") || frase.substring(i, i + 1).equals("u")) {
                cont++;

            }

        }
        System.out.println("Hay " + cont + " vocales");
        System.out.println("");

    }

    public String invertirFrase(Cadena cadena) {

        String frase = cadena.getFrase();

        for (int i = frase.length() - 1; i >= 0; i--) {

            System.out.print(frase.substring(i, i + 1));

        }
        System.out.println("");
        return null;
    }

    public double vecesRepetido(Cadena cadena) {
        System.out.println("");

        System.out.println("ingrese un catacter a buscar");
        String frase = cadena.getFrase();
        String letra = leer.next();
        int cont = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                cont++;

            }

        }
        System.out.println("El caracter " + letra + " se repite " + cont + " veces.");
        System.out.println("");

        return cont;

    }

    public void compararFrase(Cadena cadena) {
        System.out.println("ingrese un nueva frase");
        String frase = cadena.getFrase();
        String letra = leer.next();

        System.out.println("La frase de la clase tiene " + frase.length() + " caracteres y la frase ingresada por el usuario " + letra.length() + " caracteres");
        System.out.println("La diferencia de caracteres entre la frase clase y usuario es de " + (frase.length() - letra.length()));
        System.out.println("");

    }

    public void unirFrase(Cadena cadena) {
        System.out.println("Ingrese una frase para unir con la cadena de la clase");
        String frase = leer.next();

        System.out.println(cadena.getFrase() + " " + frase);
        System.out.println("");

    }

    public void reemplazar(Cadena cadena) {
        System.out.println("Ingrese un caracter para reemplazar por las letras *A*");
        String letra = "werer";

        do {
            letra = leer.next();
        } while (letra.length() != 1);

        String caden = cadena.getFrase();

        String cadennew = caden.replace("a", letra);

        System.out.println(cadennew);
        System.out.println("");

    }

    public boolean contiene(Cadena cadena) {
        System.out.println("ingrese un catacter a buscar");
        System.out.println("false no se encuentra, true si está");
        String frase = cadena.getFrase();
        String letra = leer.next();
        boolean encuentra = false;

        for (int i = 0; i < frase.length(); i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                encuentra = true;

            }
        }
        return encuentra;
    }

}
