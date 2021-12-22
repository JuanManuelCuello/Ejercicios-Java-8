package colecciones.servicios.Tienda;

import colecciones.entidades.Tienda.Tienda;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {

    private HashMap<String, Tienda> newmapa;
    private Scanner leer;

    public TiendaServicio() {
        this.newmapa = new HashMap<>();
        this.leer = new Scanner(System.in).useDelimiter("\n");

    }

    public Tienda cargarProducto() {
        System.out.println("Ingrese el nombre del producto");
        String nombre = leer.next().toUpperCase();

        System.out.println("Ingrese el precio de " + nombre);
        String precio = leer.next().toUpperCase();

        return new Tienda(nombre, precio);

    }

    public void agregarProducto(Tienda p) {
        newmapa.put(p.getProducto(), p);

    }

    public void imprimirTienda() {
        for (Map.Entry<String, Tienda> entry : newmapa.entrySet()) {
            String key = entry.getKey();
            Tienda value = entry.getValue();
            System.out.println("Producto: " + key + " , $" + value);
        }
    }

    public void eliminarProducto(String Producto) {
        newmapa.remove(Producto);

    }

    public void modificarPrecio(){
               
        System.out.println("Ingrese el nombre del producto");
        String produc = leer.next().toUpperCase();
        System.out.println("Ingrese el nuevo precio");
        String price = leer.next();
        
        Tienda p = newmapa.get(produc);
        p.setPrecio(price);
        newmapa.put(produc, p);
            
            
        
        
        
        
    }
    
    
    
}
