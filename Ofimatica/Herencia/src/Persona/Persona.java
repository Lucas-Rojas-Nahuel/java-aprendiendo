
package Persona;


public class Persona {
        
    String nombre, direccion; 

    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
        
    public void mostrarInfoPersona(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Dierección: "+ direccion);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
}
