package poo.servicios.Ahorcado;

import java.util.Arrays;
import java.util.Scanner;
import poo.entidades.ahorcado.Ahorcado;

public class AhorcadoServicio {

    private Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego() {
        Ahorcado ahorcado = new Ahorcado();
        System.out.println("Ingrese la palabra secreta ");

        String secreta = leer.next();

        
        
        
        
        ahorcado.setBuscar(new String[secreta.length()]);

        for (int i = 0; i < secreta.length(); i++) {

            ahorcado.getBuscar()[i] = secreta.substring(i, i + 1);

        }
        System.out.println(Arrays.toString(ahorcado.getBuscar()));
        System.out.println("Ingrese la cantidad de jugadas maximas");
        ahorcado.setJuagadasMaximas(leer.nextInt());

        ahorcado.setLetrasEncontradas(0);

        String[] oculto = new String[ahorcado.getBuscar().length];

        for (int i = 0; i < oculto.length; i++) {
            oculto[i] = "[*]";

        }
        
        ahorcado.setOculto(oculto);
        
        
        
        return ahorcado;

    }

    public int longitud(Ahorcado ahorcado) {

        int largo = ahorcado.getBuscar().length;

        System.out.println("La palabra tiene -" + largo + "- letras");

        return largo;
    }

    public boolean buscar(Ahorcado ahorcado) {
        System.out.println("Ingrese una letra a buscar");
        String letra = leer.next();

        

        for (int i = 0; i < ahorcado.getBuscar().length; i++) {

            if (ahorcado.getBuscar()[i].equals(letra)) {
                ahorcado.getOculto()[i] = letra;
                //System.out.println("");

                for (int j = 0; j < ahorcado.getOculto().length; j++) {
                    System.out.print(ahorcado.getOculto()[j] + " ");
                }
                System.out.println("");

                return true;
            }
        }

        for (int j = 0; j < ahorcado.getOculto().length; j++) {
            System.out.print(ahorcado.getOculto()[j]);
        }
        System.out.println("");

        return false;

    }

    public boolean encontradas(Ahorcado ahorcado) {

        if (buscar(ahorcado)) {
            ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
            ahorcado.setJuagadasMaximas(ahorcado.getJuagadasMaximas() - 1);
            System.out.println("TRUE Letras encontradas [" + ahorcado.getLetrasEncontradas() + "], Faltantes [" + (longitud(ahorcado) - ahorcado.getLetrasEncontradas()) + "]");
            return true;
        } else {
            ahorcado.setJuagadasMaximas(ahorcado.getJuagadasMaximas() - 1);
            System.out.println("FALSE Letras encontradas [" + ahorcado.getLetrasEncontradas() + "], Faltantes [" + (longitud(ahorcado) - ahorcado.getLetrasEncontradas()) + "]");

            return false;
        }
    }

    public int intentos(Ahorcado ahorcado) {

        int inten = ahorcado.getJuagadasMaximas() - 1;

        System.out.println("Numero de oportunidades restantes: [" + inten + "]");

        return inten;
    }

}
