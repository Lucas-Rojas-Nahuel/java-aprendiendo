
package logica;

import java.util.ArrayList;
import java.util.List;


public class Comunicacion {
    
    public static void main(String[] args){
        //Punto 2
        //Creamos ArrayList para guardar los juegos
        List<Videojuegos> juegos = new ArrayList<Videojuegos>();
    
        //Cargamos los datos de los juegos en las listas
        Videojuegos juego1= new Videojuegos(20, "Minecraft", "pc", 100, "aventura");
        Videojuegos juego2= new Videojuegos(21, "God of war 2", "ps2", 300, "acción");
        Videojuegos juego3= new Videojuegos(22, "Need for speed Payback", "pc, ps4", 200, "carreras");
        Videojuegos juego4= new Videojuegos(23,"Silent Hill 2", "pc, ps3, ps4", 50, "terror");
        Videojuegos juego5= new Videojuegos(24, "Mario bros 64", "Nitendo 64", 100, "aventura");
        
        //Guardamos los datos de la lista
        juegos.add(juego1);
        juegos.add(juego2);
        juegos.add(juego3);
        juegos.add(juego4);
        juegos.add(juego5);
        
        //Punto 3
        //Mostramos los datos de la listas
        System.out.println("-----------------------------------");
        System.out.println("LISTA DE JUEGOS");
        System.out.println("-----------------------------------");
        for (Videojuegos juego:juegos){
            System.out.println(juego.toString());
        }
        
        //Punto 4
        //Modificamos dos juegos de la lista
        juego1.setTitulo("Genshin Impact");
        juego1.setCantidadJugadores(30);
        juego3.setTitulo("Need for Speed Most Wanted");
        juego3.setCantidadJugadores(500);
        
       
        
        System.out.println("---------------------------------------");
        System.out.println("LISTAS DE LOS JUEGOS CAMBIADOS");
        System.out.println("-----------------------------------");
        
        //Mostramos las lista de los juegos cambiados
        for (Videojuegos juego:juegos){
            System.out.println(juego.toString());
        }
        
        
        //Punto 5
        System.out.println("-----------------------------------------");
        System.out.println("LISTA DE LOS JUEGO DE NITENDO 64");
        System.out.println("-----------------------------------");
        
        //Mostramos las listas de la consola Nitendo 64 
        for(Videojuegos juego:juegos){
            if(juego.getConsola().equals("Nitendo 64")){
                System.out.println(juego.toString());
                break;
            }
        }
        
    }
    
}
