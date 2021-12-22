
package MascotaServicio;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MascotaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
    private List<String> mascotas;


    public MascotaServicio() {
        this.mascotas = new ArrayList();
        
    }
    
    public void crearMascota() {
        System.out.println("Ingrese la raza");
        String raza = leer.next();
        
        mascotas.add(raza);
    }
    
    public void mostrarMascota(){
        System.out.println("Las razas almacenadas son");
        
        for (String aux : mascotas) {
            System.out.println(aux);
        }
        System.out.println("Cantidad de razas "+ mascotas.size());
    }
    
    public void removerMascota(String nombre){
        String m;
        
        for (int i = 0; i < mascotas.size(); i++) {
             m = mascotas.get(i);
            if (m.equals(nombre)) {
                mascotas.remove(m);
            }
            System.out.println("La raza no está en la lista");
            
        }
        
            
            
            
            
        }
        
        
        
    }
    

