 
package Logica;

 
public class Pikachu extends Pokemons implements Electrico {

    public Pikachu() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y utilizo el ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Pikachu y utilizo el ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
     System.out.println("Hola soy Pikachu y utilizo el ataque mordisco");
    }

    @Override
    public void ataqueImpactrueno() {
     System.out.println("Hola soy Pikachu y utilizo el ataque impactrueno");
    }

    @Override
    public void ataqueRayo() {
        System.out.println("Hola soy Pikachu y utilizo el ataque rayo");
    }
    
}
