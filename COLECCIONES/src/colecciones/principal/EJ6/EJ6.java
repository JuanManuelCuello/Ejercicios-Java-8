package colecciones.principal.EJ6;

import colecciones.entidades.Tienda.Tienda;
import colecciones.servicios.Tienda.TiendaServicio;
import java.util.Scanner;

public class EJ6 {

    public static void main(String[] args) {

        TiendaServicio serv = new TiendaServicio();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("--TiendaEGG--");

        System.out.println("1 - Introducir un producto");
        System.out.println("2 - Modificar precio");
        System.out.println("3 - Eliminar un producto");
        System.out.println("4 - Mostrar los productos");
        System.out.println("5 - Salir");

        int opc = leer.nextInt();
        
        do{
        switch (opc) {
            case 1:
                Tienda p = serv.cargarProducto();
                serv.agregarProducto(p);
                break;

            case 2: 
                serv.modificarPrecio();
                break;
            case 3:
                System.out.println("Ingrese un producto a eliminar");
                String a = leer.next().toUpperCase();
                serv.eliminarProducto(a);
                break;
            case 4: 
                serv.imprimirTienda();
                break;
            case 5: 
                break;
            
            default: System.out.println("Ingrese una opcion valida");
                
        }
        }
        while (opc!=5);

    }

}
