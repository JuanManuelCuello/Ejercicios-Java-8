
package introjava;

import java.util.Scanner;


public class EJ_24_convertir_arreglo_de_int_a_String {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la dimension del vector:");
        
        int dim = leer.nextInt();
        
        int [] numeros = new int [dim];
        String [] caden = new String [dim];
        
        llenarvector(numeros);
        
        mostrar(numeros);
        
        int cont1 = 0; 
        int cont2 =0;
        int cont3 =0; 
        int cont4 =0;
        int cont5 =0;
        
        
        for (int i= 0; i < dim; i++) {
            int aux = numeros [i];
                 
            String subcaden= String.valueOf(aux);
            
            caden [i] = subcaden;
    
            int subs = caden[i].length();
            
            if (subs == 1) {
                cont1++; 
            }
            if (subs == 2) {
                cont2++; 
            }
            if (subs == 3) {
                cont3++; 
            }
            if (subs == 4) {
                cont4++; 
            }
            if (subs == 5) {
                cont5++; 
            }
            
        }
        System.out.println("");
        System.out.println("Hay "+cont1+ " numeros de 1 digito" );
        System.out.println("Hay "+cont2+ " numeros de 2 digito" );
        System.out.println("Hay "+cont3+ " numeros de 3 digito" );
        System.out.println("Hay "+cont4+ " numeros de 4 digito" );
        System.out.println("Hay "+cont5+ " numeros de 5 digito" );
        System.out.println("");
        
        
        
    }
    
    public static void llenarvector(int[] vector) {
        for (int i = 0; i < vector.length - 1; i++) {
            vector[i] = (int) (Math.random() * 99999);
        }
    }
    
    public static void mostrar(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" [" + vector[i] + "] ");
        }
    }
}
