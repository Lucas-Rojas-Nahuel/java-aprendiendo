 
package datospersona;

 
public class Persona {
    
    private int dni;
    private String nombre;
    private String direccion;

    public Persona(int dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni: " + dni + ", nombre: " + nombre + ", direccion: " + direccion + '}';
    }
    
    
    
    
    
}
