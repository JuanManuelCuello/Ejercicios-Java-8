package poo.principal.EJ10;

import java.util.Arrays;

public class EJ10 {

    public static void main(String[] args) {

        float[] vectorA = new float[50];
        float[] vectorB = new float[20];

        for (int i = 0; i < vectorA.length; i++) {

            vectorA[i] = (float) (Math.random() * 100);

        }

        for (int i = 0; i < vectorA.length; i++) {

            System.out.print(" [" + vectorA[i] + "] ");

        }

        Arrays.sort(vectorA);

        System.out.println("");
        System.out.println("-ordenado-");
        System.out.println("");

        for (int i = 0; i < vectorA.length; i++) {

            System.out.print(" [" + vectorA[i] + "] ");

        }

        
        //vectorB=Arrays.copyOf(vectorA, 10);
        
        
        for (int i = 0; i < vectorB.length; i++) {

           if (i < 10) {
              vectorB[i] = vectorA[i];
            } else {
                vectorB[i] = (float) (0.5);
            }

        }
        System.out.println("");
        System.out.println("Vector A");
        
        for (int i = 0; i < vectorA.length; i++) {

            System.out.print("[" + vectorA[i] + "]" );

        }
        
        System.out.println("");
        System.out.println("Vector B");
        for (int i = 0; i < vectorB.length; i++) {

            System.out.print(" [" + vectorB[i] + "] ");

        }
        
        
    }
}
