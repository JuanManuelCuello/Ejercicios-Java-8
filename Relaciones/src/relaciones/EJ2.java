
package relaciones;

import java.util.ArrayList;
import java.util.Scanner;
import relaciones.entidades.Juego;
import relaciones.entidades.Jugador;
import relaciones.entidades.Revolver;


public class EJ2 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
     Juego juego = new Juego();   
     Revolver r = new Revolver();
     ArrayList<Jugador> jugadores = new ArrayList();
     
      

      System.out.println("Cuantas personas van a participar");
      int player = leer.nextInt();
      
      Jugador jugador = new Jugador(); 
      
       if (player > 6 || player < 0) {
            player = 6;
       }

        for (int i = 0; i < player; i++) {

           jugadores.add(jugador.crearJugador());
       }

       juego.llenarJuego(jugadores, r);
       juego.ronda();
       
        
        
       
        
    }
    
}
