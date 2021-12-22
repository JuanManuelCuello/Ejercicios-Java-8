package introjava;

import java.util.Scanner;

public class EJ_26 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese los elementos de la matriz");
        boolean band = true;

        int[][] matriz = new int[3][3];
        int[][] matrizt = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Número para posición i:" + i + " j:" + j);
                matriz[i][j] = leer.nextInt();
            }
        }

        System.out.println("Matriz Usuario");
        mostrarmatriz(matriz);
        System.out.println("-------");
        System.out.println("Matriz Transpuesta");

        int aux = 0;

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {

                matrizt[i][j] = matriz[i][j];
                aux = matrizt[i][j];

                if (matrizt[i][j] != 0) {
                    matrizt[i][j] = matrizt[i][j] * (-1);
                }

                System.out.print(" [" + matrizt[i][j] + "] ");
            }
            System.out.println(" ");

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] != matrizt[i][j]) {
                    band = false;
                    System.out.println("bandera= " + band);

                }

            }
        }
        if (band == false) {
            System.out.println("la matriz NO es transpuesta"
            );
        } else {
            System.out.println("la matriz es transpuesta"
            );
        }

    }

    public static void mostrarmatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                System.out.print(" [" + matriz[i][j] + "] ");
            }
            System.out.println(" ");
        }
    }
}
