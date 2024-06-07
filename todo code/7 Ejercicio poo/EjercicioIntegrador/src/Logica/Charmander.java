 
package Logica;

 
public class Charmander extends Pokemons implements Fuego {

    public Charmander() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y utilizo el ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Charmander y utilizo el ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y utilizo el ataque Mordisco");
    }

    @Override
    public void ataqueAcuas() {
        System.out.println("Hola soy Charmander y utilizo el ataque acuas");
    }

    @Override
    public void ataqueLanzallamas() {
        System.out.println("Hola soy Charmander y utilizo el ataque lanzallamas");
    }
    
}
