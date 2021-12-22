package introjava;

import java.util.Scanner;

public class EJ_17 {

    public static void main(String[] args) {

        int correcto = 0;
        int incorrecto = 0;
        boolean bandera = false;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese cadenas de hasta 5 caracteres");

        do {

            String cadena = leer.next();

            int larg = cadena.length();
            String aux = cadena.substring(0, 1);
            String ulti = cadena.substring(larg - 1, larg);

            if (aux.equals("x") & larg <= 5 & larg >= 2 & "o".equals(ulti)) {
                correcto++;
            } else if (cadena.equals("&&&&&")) {
                bandera = true;
                System.out.println("--- FDE ---");
            } else {
                incorrecto++;
            }

        } while (bandera == false);

        System.out.println("incorrecto " + incorrecto);
        System.out.println("correcto " + correcto);
    }

}
