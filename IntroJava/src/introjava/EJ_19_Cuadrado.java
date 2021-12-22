package introjava;

import java.util.Scanner;

public class EJ_19_Cuadrado {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese un número: ");

        int num = leer.nextInt();
            
        //arriba
        for (int i = 0; i < num; i++) {

            System.out.print("*");
        }
        System.out.println();

        //centro
        for (int i = 0; i<num - 2; i++) {
            System.out.print("*");
            for (int j = 0 ; j<num-2; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
            
        //inferior
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
         System.out.println("");
    }
}           