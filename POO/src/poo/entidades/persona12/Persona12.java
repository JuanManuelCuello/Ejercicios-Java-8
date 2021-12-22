
package poo.entidades.persona12;

import java.util.Date;


public class Persona12 {

private String nombre;
private Date fecha;

    public Persona12() {
    }

    public Persona12(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Persona12{" + "nombre=" + nombre + ", fecha=" + fecha + '}';
    }













    
}
