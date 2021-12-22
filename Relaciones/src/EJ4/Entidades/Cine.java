package EJ4.Entidades;

import java.util.ArrayList;

public class Cine {

    private int entrada;
    private Pelicula pelicula;

    public Cine() {
    }

    private Espectador[][] sala = new Espectador[8][6];

    public Cine(int entrada, Pelicula pelicula) {
        this.entrada = entrada;
        this.pelicula = pelicula;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Espectador[][] getSala() {
        return sala;
    }

    public void setSala(Espectador[][] sala) {
        this.sala = sala;
    }

    @Override
    public String toString() {
        return "Cine{" + "entrada=" + entrada + ", pelicula=" + pelicula + ", sala=" + sala + '}';
    }

    public void llenarSala(ArrayList<Espectador> e) {
        for (int i = 0; i < sala.length; i++) {

            for (int j = 0; j < sala[i].length; j++) {

                do {
                    int I = (int) (Math.random() * sala.length);
                    int J = (int) (Math.random() * sala.length);
                    int random = (int) (Math.random() * sala.length);

                   // if (sala[I][J] == null) {

                        if (e.get(random).getDineroDisp() >= entrada && e.get(random).getEdad() >= pelicula.getEdadMin()) {

                            sala[I][J] = e.get(random);

                            break;

                        }
                    

                } while (true);
            }

        }

    }

    public void mostrarSala() {

        String[] letras = {"A", "B", "C", "D", "E", "F"};

        for (int i = 0; i < sala.length; i++) {

            for (int j = 0; j < sala.length; j++) {

                if (sala[i][j] == null) {   ///error

                    System.out.println(letras[i] + (j + 1));

                } else {

                    System.out.println("(X)");
                }

            }

        }
    }

}

//    private Pelicula pelicula;
//
//    private Integer entrada;
//
//    
//
//    public Cine() {
//
//        sala = new ArrayList();
//    }
//
//    public Cine(Pelicula pelicula, Espectador espectador, Integer entrada, ArrayList<Butaca> sala) {
//        this.pelicula = pelicula;
//
//        this.entrada = entrada;
//
//        this.sala = sala;
//    }
//
//    public Pelicula getPelicula() {
//
//        return pelicula;
//    }
//
//    public void setPelicula(Pelicula pelicula) {
//        this.pelicula = pelicula;
//    }
//
//    public Integer getEntrada() {
//        return entrada;
//    }
//
//    public void setEntrada(Integer entrada) {
//        this.entrada = entrada;
//    }
//
//    public ArrayList<Butaca> getsala() {
//        return sala;
//    }
//
//    public void setEspec(ArrayList<Butaca> sala) {
//        this.sala = sala;
//    }
//
//    @Override
//    public String toString() {
//        return "Cine{" + "pelicula=" + pelicula + ", entrada=" + entrada + ", sala=" + sala + '}';
//    }
//
//    public void crearSala() {
//
//        String[] letras = {"A", "B", "C", "D", "E", "F"};
//
//        for (String letra : letras) {
//            for (int i = 1; i <= 8; i++) {
//                Butaca butaca = new Butaca();
//                butaca.setLetra(letra);
//                butaca.setNum(i);
//                butaca.setOcupado(false);
//                sala.add(butaca);
//                
//            }
//
//        }
//    }
//    public Integer ubicarEspectador(Espectador e) {
//        int random = (int) (Math.random() * sala.size());
//        
//       /// ArrayList<Butaca> sala = new ArrayList();
//        Butaca b = sala.get(random);
//        
//        //kboom
//        if (b.isOcupado()) {
//            ubicarEspectador(e);
//        } else {
//            if (e.getDineroDisp() >= entrada && e.getEdad() >= pelicula.getEdadMin()) {
//
//                b.setOcupado(true);
//                b.setEspectador(e);
//                sala.set(random, b);
//                
//            }
//           
//        }
//         return b.getNum();
//    }
//}
////        for (Butaca aux : espec) {
////            
////            if (aux.getDineroDisp()>=entrada) {
////                if (aux.getEdad()>=pelicula.getEdadMin()) {
////                    for (Butaca a : sala) {
////                        if (a.isOcupado()) {
////                            
////                        }
////                    }
////                        
////                    }
////                    
////                }
////                
////            }
////        

