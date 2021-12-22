package relaciones.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private Revolver revolver;
    private ArrayList<Jugador> jugadores;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Juego{" + "revolver=" + revolver + ", jugadores=" + jugadores + '}';
    }

    public Juego() {
    }

    public Juego(Revolver revolver, ArrayList<Jugador> jugadores) {
        this.revolver = revolver;
        this.jugadores = jugadores;
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver r) {

      
     this.jugadores = jugadores;
     this.revolver = r;
     
     
    }

    public void ronda() {
        
        revolver.llenarRevolver();
        int i=0;
        do {

            for (Jugador j : jugadores) {
                System.out.println("ronda "+i);
                
                i++;
                
                if (j.disparo(revolver)) {
                    System.out.println(j.getNombre()+", ID: "+j.getId()+" Ha sido mojado");
                    break;
                }

            }

        } while (!revolver.mojar());

    }

}
