package introjava;

import java.util.Arrays;

public class EJ_22_Ordenar_arreglo_e_invertir {

    public static void main(String[] args) {

        int[] b = new int[100];

        llenarvector(b);

        for (int i = 0; i < 100; i++) {
            System.out.print(" " + b[i] + " ");
        }
        
        System.out.println(" ");
        System.out.println("--------------------------");
                      

        Arrays.sort(b);
       // invertirManual(b);
        System.out.println("Ordenado");
        
        for (int i = 0; i < 100; i++) {
            System.out.print(" " + b[i] + " ");
        }
        
    }

    public static void llenarvector(int[] vector) {
        for (int i = 0; i < 100; i++) {
            vector[i] = (int) (Math.random() * 100);

        }
    
        

    }

    
    public static void invertirManual(int[] arreglo) {
    int temporal; 
    int longitudDeArreglo = arreglo.length;
   
    for (int x = 0; x < longitudDeArreglo / 2; x++) {
   
      temporal = arreglo[x];
      int indiceContrario = longitudDeArreglo - x - 1;
      arreglo[x] = arreglo[indiceContrario];
      arreglo[indiceContrario] = temporal;
    }
   
  }
    
    
    
  /*  static void ordSelDesc(int[] arreglo) {
        //iteramos sobre los elementos del arreglo
        for (int i = 0 ; i < arreglo.length - 1 ; i++) {
            int max = i;
 
            //buscamos el mayor número
            for (int j = i + 1 ; j < arreglo.length ; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //encontramos el mayor número
                }
            }
 
            if (i != max) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }*/
}