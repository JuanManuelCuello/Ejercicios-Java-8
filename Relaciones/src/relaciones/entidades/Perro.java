package relaciones.entidades;

public class Perro {

    private String nombre, raza, tamanio, edad;

    public Perro(String nombre, String raza, String tamanio, String edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamanio = tamanio;
        this.edad = edad;
    }

    public Perro() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamanio;
    }

    public void setTamaño(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", tamanio=" + tamanio + ", edad=" + edad + '}';
    }


}
