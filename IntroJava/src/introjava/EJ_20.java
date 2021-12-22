package introjava;

import java.util.Scanner;

public class EJ_20 {

    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        boolean bandera = true;
        
        do {

            System.out.println("Ingrese 4 numeros entre 1 y 20");

            numero1 = leer.nextInt();

            numero2 = leer.nextInt();
            numero3 = leer.nextInt();
            numero4 = leer.nextInt();

            if (numero1 <= 20 && numero1 >= 1 && numero2 <= 20 && numero2 >= 1 && numero3 <= 20 && numero3 >= 1 && numero4 <= 20 && numero4 >= 1) {
                bandera = true;
            } else {
                bandera = false;
            }

        } while (bandera == false);
        
        System.out.println("");
        System.out.println("---ASTERISCOS---");
        System.out.println(" ");

        System.out.print(numero1 + " ");
        for (int i = 0; i < numero1; i++) {
            System.out.print("*");
        }

        System.out.println("");

        System.out.print(numero2 + " ");
        for (int i = 0; i < numero2; i++) {
            System.out.print("*");
        }

        System.out.println("");

        System.out.print(numero3 + " ");
        for (int i = 0; i < numero3; i++) {
            System.out.print("*");
        }

        System.out.println("");

        System.out.print(numero4 + " ");
        for (int i = 0; i < numero4; i++) {
            System.out.print("*");
        }

        System.out.println("");
        System.out.println("");
    }

}


/*public static int escribir(int n1) {

        System.out.print(n1 + " ");
        for (int i = 0; i < n1; i++) {
            System.out.print("*");
        }

        System.out.println("");

    return escribir;
    
}
} */