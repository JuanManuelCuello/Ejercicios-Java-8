package introjava;

import java.util.Arrays;

public class EJ_25_Matriz_ordenada_por_columnas {

    public static void main(String[] args) {

        int[][] matriz = new int[4][4];

        llenarmatriz(matriz);

        mostrarmatriz(matriz);

        int[] colum0 = new int[4];
        int[] colum1 = new int[4];
        int[] colum2 = new int[4];
        int[] colum3 = new int[4];

        int aux;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (j == 0) {
                    colum0[i] = matriz[i][j];
                   
                }
                if (j == 1) {
                    colum1[i] = matriz[i][j];
                }
                if (j == 2) {
                    colum2[i] = matriz[i][j];
                }
                if (j == 3) {
                    colum3[i] = matriz[i][j];
                }

            }
        }
        
        Arrays.sort(colum0);
        Arrays.sort(colum1);
        Arrays.sort(colum2);
        Arrays.sort(colum3);
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (j == 0) {
                    matriz[i][j] = colum0[i];
                }
                if (j == 1) {
                    matriz[i][j] = colum1[i];
                }
                if (j == 2) {
                    matriz[i][j] = colum2[i];
                }
                if (j == 3) {
                    matriz[i][j] = colum3[i];
                }

            }
        }
        
        
        
        
        System.out.println(" ");
        System.out.println("---ORDENADA DE MENOR A MAYOR POR COLUMNA---");
        System.out.println(" ");
        
        mostrarmatriz(matriz);

    }

    public static void llenarmatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                matriz[i][j] = (int) (Math.random() * 50);
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

    public static void burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

}
