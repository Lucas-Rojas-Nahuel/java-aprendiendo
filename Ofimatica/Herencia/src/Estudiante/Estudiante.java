
package Estudiante;
import Persona.Persona;

public class Estudiante extends Persona {
    
    int numeroLegajo;
    String carrera;

    public Estudiante(int numeroLegajo, String carrera, String nombre, String direccion) {
        super(nombre, direccion);
        this.numeroLegajo = numeroLegajo;
        this.carrera = carrera;
    }
    
    public void mostrarInfoEstudiante(){
        System.out.println("Nombre: "+ getNombre() );
        System.out.println("Dirección: "+ getDireccion());
        System.out.println("Numero Legajo: "+ numeroLegajo);
        System.out.println("Carrera: "+ carrera);
    }
    
}
