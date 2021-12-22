package relaciones.entidades;

import java.util.Scanner;

public class Jugador {

    private Integer id;
    private String nombre;
    private boolean mojado;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Jugador() {

    }

    public Jugador(Integer id, String nombre, boolean mojado) {
        this.id = id;
        this.nombre = nombre;
        this.mojado = mojado;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public Jugador crearJugador() {

        Jugador jugador1 = new Jugador();
        System.out.println("Ingrese su ID");
        jugador1.setId(leer.nextInt());
        System.out.println("Ingrese su nombre");
        jugador1.setNombre(leer.next());

        return jugador1;

    }

    public boolean disparo(Revolver r) {

        System.out.println(r.mojar());

        if (r.getpActual() == r.getpAgua()) {
            this.mojado = false;
            return true;
        } else {

            r.sigChorro();
        }
        return false;
    }

}
