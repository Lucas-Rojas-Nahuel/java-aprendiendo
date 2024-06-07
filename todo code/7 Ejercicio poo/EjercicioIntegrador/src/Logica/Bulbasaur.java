 
package Logica;

 
public class Bulbasaur extends Pokemons implements Planta {

    public Bulbasaur() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasuar y utilizo el ataque placaje");    
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Hola soy Bulbasuar y utilizo el ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasuar y utilizo el ataque mordisco");
    }

    @Override
    public void ataqueLatigoCepa() {
        System.out.println("Hola soy Bulbasuar y utilizo el ataque latigo cepa");
    }

    @Override
    public void ataqueHojaAfilada() {
        System.out.println("Hola soy Bulbasuar y utilizo el ataque hoja afilada");
    }
    
}
