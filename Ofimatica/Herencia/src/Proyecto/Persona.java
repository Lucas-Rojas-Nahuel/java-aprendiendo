
package Proyecto;


public class Persona {
    public int dni;
    public String nombre;
    public String direccion;

    public Persona() {
    }

    public Persona(int dni, String nombre, String direccion) {
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Estudiante crearEstudiante(){
        return new Estudiante();
    }

    
   
    
    
    
}
