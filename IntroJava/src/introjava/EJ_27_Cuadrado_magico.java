package introjava;

import java.util.Scanner;

public class EJ_27_Cuadrado_magico {

    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        System.out.println("ingrese numeros del 1 al 9 para crear la matriz mágica");

        llenarmatriz(matriz);

        mostrarmatriz(matriz);

        int diag1 = 0;
        boolean bandera = true;

        //DIAGONAL 1
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {

                    diag1 = diag1 + matriz[i][j];
                }
            }
        }
        //System.out.println("DIagonal: " +diag1 );
        //DIAGONAL 2
        int diag2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i + j == matriz.length - 1) {
                    diag2 = diag2 + matriz[i][j];

                }

            }

        }
        //System.out.println("DIagonal2: " +diag2 );

        if (diag1 != diag2) {
            bandera = false;
        }

        //COLUMNAS
        for (int i = 0; i < matriz.length; i++) {
            if (diag1 != sumarcolumna(i, matriz)) {
                bandera = false;
                //System.out.println("columna "+i+" :"+ sumarcolumna(i,matriz));
            }

        }

        ///FILAS       
        for (int i = 0; i < matriz.length; i++) {
            if (diag1 != sumarfila(i, matriz)) {
                bandera = false;
                //System.out.println("fila "+i+" :"+ sumarfila(i,matriz));
            }

        }
        System.out.println(" ");

        if (bandera == true) {
            System.out.println("es una matriz magica");
        } else {
            System.out.println("no es una matriz magica");
        }

        System.out.println(" ");

    }///main

    public static void llenarmatriz(int[][] matriz) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                do {

                    System.out.println("ingrese un numero para la posición i:" + i + " - j:" + j);
                    matriz[i][j] = leer.nextInt();

                    if (matriz[i][j] < 1 || matriz[i][j] > 10) {
                        System.out.println("");
                        System.out.println("******** ingrese un numero del 1 al 9***********");
                        System.out.println("");
                    }
                } while (matriz[i][j] < 1 || matriz[i][j] > 10);

            }
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

    public static int sumarfila(int n1, int[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == n1) {
                    fila = fila + matriz[i][j];
                }
            }
        }
        return fila;
    }

    public static int sumarcolumna(int n1, int[][] matriz) {
        int fila = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (j == n1) {
                    fila = fila + matriz[i][j];
                }
            }
        }
        return fila;
    }

}///class
