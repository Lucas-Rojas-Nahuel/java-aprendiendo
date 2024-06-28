 
package declararvariable;

 
public class Sujeto {
     private String nombre;
        private int edad;
        private Float altura;

    public Sujeto(String nombre, int edad, Float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

  

    @Override
    public String toString() {
        return "Sujeto{" + "nombre: " + nombre + ", edad: " + edad + ", altura: " + altura + '}';
    }
        
}
