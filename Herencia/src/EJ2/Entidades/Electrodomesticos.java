package EJ2.Entidades;

import java.util.Scanner;

public abstract class Electrodomesticos {

    protected double precio, peso;
    protected String color;
    protected char consumo;

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Electrodomesticos() {
    }

    public Electrodomesticos(double precio, double peso, String color, char consumo) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public void comprobarConsumoEnergetico(char letra) {

        if (letra == 'c' || 'a' == letra || 'b' == letra || 'd' == letra || 'e' == letra) {
            consumo = letra;
        } else {
            consumo = 'f';
        }

    }

    public void comprobarColor(String color) {
        color.toLowerCase();
        if (color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            this.color = color;
        } else {
            this.color = "blanco";

        }

    }

    public void crearElectrodomestico() {

        precio = 1000;
        System.out.println("Peso: ");
        setPeso(leer.nextInt());
        System.out.println("Color: ");
        setColor(leer.next());
        System.out.println("Consumo: ");
        char caracter = leer.next().charAt(0);
        setConsumo(caracter);

        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);

    }

    public double precioFinal() {
        double precioF = getPrecio();

        if (consumo == 'a') {
            precioF += 1000;
        }
        if (consumo == 'b') {
            precioF += 800;
        }
        if (consumo == 'c') {
            precioF += 600;
        }
        if (consumo == 'd') {
            precioF += 500;
        }
        if (consumo == 'e') {
            precioF += 300;
        }
        if (consumo == 'f') {
            precioF += 100;
        }

        if (peso >= 1 && peso <= 19) {
            precioF += 100;
        }
        if (peso <= 49 && peso >= 20) {
            precioF += 500;
        }
        if (peso >= 50 && peso <= 79) {
            precioF += 800;
        }
        if (peso > 80) {
            precioF += 1000;
        }

        setPrecio(precioF);

        return precioF;
    }

    @Override
    public String toString() {
        return "Electrodomesticos " + "precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo + '}';
    }

    
    
    
}
