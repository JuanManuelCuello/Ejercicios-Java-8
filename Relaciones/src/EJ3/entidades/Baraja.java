package EJ3.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Baraja {

    private Cartas carta;

    private ArrayList<Cartas> mazo;
    private ArrayList<Cartas> descarte;
    Scanner leer = new Scanner(System.in);

    public Baraja(Cartas carta, ArrayList<Cartas> mazo, ArrayList<Cartas> descarte) {
        this.carta = carta;
        this.mazo = mazo;
        this.descarte = descarte;
    }

    public Baraja() {
        mazo = new ArrayList();
        descarte = new ArrayList();
    }

    public Cartas getCarta() {
        return carta;
    }

    public void setCarta(Cartas carta) {
        this.carta = carta;
    }

    public ArrayList<Cartas> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Cartas> mazo) {
        this.mazo = mazo;
    }

    public ArrayList<Cartas> getDescarte() {
        return descarte;
    }

    public void setDescarte(ArrayList<Cartas> descarte) {
        this.descarte = descarte;
    }

    @Override
    public String toString() {
        return "Baraja{" + "carta=" + carta + ", mazo=" + mazo + ", descarte=" + descarte + '}';
    }

    
    
    
    
    
    public void Barajar() {
        Collections.shuffle(mazo);

    }

    public void siguienteCarta() {
        System.out.println("Siguiente carta" + mazo.get(0));
        descarte.add(mazo.get(0));
        mazo.remove(0);
        if (mazo.size() == 0) {
            System.out.println("No quedan mas cartas");
        }

    }

    public void cartasDisponibles() {
        System.out.println("Quedan [" + mazo.size() + "] cartas disponibles");

    }

    public void darCartas() {
        System.out.println("Cuantas cartas desea?");
        int cartas = leer.nextInt();

        ////MUESTRA X CANTIDAD DE CARTAS
        if (mazo.size() > cartas) {

            //     Iterator <Cartas> it = mazo.iterator();
            //    while (it.hasNext()){
            //       Cartas aux = it.next();
            //       System.out.println(aux);
            //     }
            for (int i = 0; i < cartas; i++) {
                System.out.println(mazo.get(i));
            }

            //// PASARLAS AL DESCARTE
            for (int i = 0; i < cartas; i++) {
                descarte.add(mazo.get(i));
                //mazo.remove(i);
            }
            for (int i = cartas - 1; i >= 0; i--) {
                mazo.remove(i);
            }

        } else {
            System.out.println("Quedan menos cartas de las que pidió");
        }

    }

    public void cartasMonton() {

        if (descarte.size() != 0) {
            Iterator<Cartas> it = descarte.iterator();
            while (it.hasNext()) {
                Cartas aux = it.next();
                System.out.println(aux);
            }
        } else {
            System.out.println("El monton está vacio");
        }

    }

    
    public void crearMazo() {
        String[] palos = {"oro", "basto", "copa", "espadas"};

        for (String palo : palos) {
            for (int i = 1; i < 13; i++) {
                if (i != 8 && i != 9) {
                    mazo.add(new Cartas(palo, i));
                }
            }
        }
    }

    
    
    public void mostrarBaraja() {
        mazo.forEach((m) -> { System.out.println(m); 
        });

    }
}
