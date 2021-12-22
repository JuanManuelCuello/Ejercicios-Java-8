/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones.entidades.Tienda;

/**
 *
 * @author Juan Manuel
 */
public class Tienda {

private String Producto, Precio;

    public Tienda(String Producto, String Precio) {
        this.Producto = Producto;
        this.Precio = Precio;
    }

    public Tienda() {
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    @Override
    public String toString() {
        return "Tienda{" + "Producto=" + Producto + ", Precio=" + Precio + '}';
    }


    
}
