 
package Logica;

 
public class Squirtle extends Pokemons implements Agua{

    public Squirtle() {
    }

    
    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtle y utilizo el ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Squirtle y utilizo el ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirtle y utilizo el ataque mordisco");
    }

    @Override
    public void ataquePistolaAgua() {
        System.out.println("Hola soy Squirtle y utilizo el ataque pistola agua");
    }

    @Override
    public void ataqueHidropulso() {
        System.out.println("Hola soy Squirtle y utilizo el ataque hidropulso");
    }
    
}
