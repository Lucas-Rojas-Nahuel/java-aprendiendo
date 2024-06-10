 
package Logica;
 
public class EjercicioIntegrador {

    
    public static void main(String[] args) {
        Charmander charmander=new Charmander();
        Squirtle squir=new Squirtle();
        Bulbasaur bulba=new Bulbasaur();
        Pikachu pika=new Pikachu();
        
        charmander.atacarPlacaje();
        charmander.ataqueAcuas();
        bulba.atacarMordisco();
        bulba.ataqueLatigoCepa();
        squir.atacarArañazo();
        squir.ataquePistolaAgua();
        pika.atacarPlacaje();
        pika.ataqueImpactrueno();
        
    }
    
}
