package relaciones.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Persona {

    private String nombre, apellido, edad, doc;
    private Perro perro;
    private ArrayList<Perro> listaPerro;
    private ArrayList<Persona> listaPersona;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona(String nombre, String apellido, String edad, String doc, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.doc = doc;

    }

    public Persona() {
        listaPerro = new ArrayList();
        listaPersona = new ArrayList();
    }

    //@Override
    //public String toString() {
    //    return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", doc=" + doc + "\n , perro=" + perro + '}';
    // }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public ArrayList<Perro> getListaPerro() {
        return listaPerro;
    }

    public void setListaPerro(ArrayList<Perro> listaPerro) {
        this.listaPerro = listaPerro;
    }

    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", doc=" + doc + ", perro=" + perro + '}';
    }

    public void adoptar(ArrayList<Perro> perros, String nombre) {

//        perros.stream().filter((adopcion) -> (adopcion.getNombre().equals(nombre))).forEachOrdered((adopcion) -> {
//            perro = adopcion;
//        });

        perros.forEach(a -> {
            if (a.getNombre().equals(nombre)) {
                perro = a;
            }
        });
        

    }

}
