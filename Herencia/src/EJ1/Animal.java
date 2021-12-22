/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJ1;

/**
 *
 * @author Juan Manuel
 */
public class Animal {

    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String razadelAnimal;

    public Animal(String nombre, String alimento, int edad, String razadelAnimal) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razadelAnimal = razadelAnimal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRazadelAnimal() {
        return razadelAnimal;
    }

    public void setRazadelAnimal(String razadelAnimal) {
        this.razadelAnimal = razadelAnimal;
    }

    public void Alimentarse() {

        System.out.println("se alimenta de: " + alimento);
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Raza: " + razadelAnimal);
    }

}
