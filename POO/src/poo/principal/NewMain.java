/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Juan Manuel
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"R", "R", "A", "A", "S", "S", "G", "H"}));
        ArrayList<String> pares = new ArrayList();

        String aux = "";
        int cont = 0;
        int aux1 = 0;
        int aux2 = 0;

        /////////////////
        for (int i = 0; i < medias.size(); i++) {
            aux = medias.get(i);

            System.out.println("i " + i + " AUX : " + aux);
            cont = 0;
            /////////////////////////////
            for (int j = 0; j < medias.size(); j++) {
                if (aux.equals(medias.get(j))) {
                    cont++;
                    aux1 = j;
                    if (cont == 2) {
                        aux2 = j;
                        pares.add(aux);

                        aux1 = 0;
                        aux2 = 0;
                        System.out.println("j " + j + ", aux " + aux + " cont:" + cont);
                    }

                }

            }

        }

        Set<String> s = new HashSet<String>(pares);

        TreeSet<String> fin = new TreeSet<String>();
        for (String pare : s) {
            fin.add(pare);
        }

        for (String pare : fin) {
            System.out.print(pare);
        }

        System.out.println("");
    }
}
