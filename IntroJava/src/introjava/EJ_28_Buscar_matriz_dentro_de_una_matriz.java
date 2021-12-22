package introjava;

import java.util.Scanner;

public class EJ_28_Buscar_matriz_dentro_de_una_matriz {

    public static void main(String[] args) {

        int[][] matrizM = new int[10][10];
        int[][] matrizP = new int[3][3];
        int[] vector = new int[9];

        int cont = 0;
        llenarmatriz(matrizM);
        mostrarmatriz(matrizM);
        System.out.println(" ");
        matrizabuscar(matrizP);

        //matrizP a vector
        for (int i = 0; i < matrizP.length; i++) {
            for (int j = 0; j < matrizP.length; j++) {

                vector[cont] = matrizP[i][j];
                cont = cont + 1;
            }

        }
        //mostrar vector
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "] ");

        }
        System.out.println(" ");

        //comprobar coincidencias 
        int cont1 = 0;
        int cont2 = 0;
        for (int i = 0; i < matrizM.length; i++) {
            for (int j = 0; j < matrizM.length; j++) {

                if (matrizM[i][j] == vector[0]) {

                    for (int k = i; k < (i + 3); k++) {
                        for (int l = j; l < (j + 3); l++) {
                            //System.out.print(" [" + matrizM[k][l] + "] ");
                            if (matrizM[k][l] == vector[cont1]) {
                                System.out.println(" ");
                                cont2 = cont2 + 1;
                                if (cont2 == 9) {
                                    System.out.println("La matriz comienza en i:"+i+" j:"+j);
                                    break;
                                }
                            }//System.out.println("cont2: "+cont2);
                            cont1 = cont1 + 1;

                        }

                    }
                }

            }

        }

    }

    public static void llenarmatriz(int[][] matriz) {

        Scanner leer = new Scanner(System.in);

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

    public static void matrizabuscar(int[][] matriz) {

        Scanner leer = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("ingrese un numero para la posición i:" + i + " - j:" + j);
                matriz[i][j] = leer.nextInt();
            }
        }
    }

    public static void buscar(int[][] matriz) {

    }
}
