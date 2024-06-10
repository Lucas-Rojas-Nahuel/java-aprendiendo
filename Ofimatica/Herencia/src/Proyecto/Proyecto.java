
package Proyecto;

 
public class Proyecto {

    
    public static void main(String[] args) {
        Persona persona =new Persona();
        
        Estudiante es =  persona.crearEstudiante() ;
        
        
        es.dni=29;
        es.carrera= "matematica";
        es.direccion= "barrio";
        es.nombre="lucas";
        
        System.out.println("nombre: "+ es.nombre+ " dni: "+es.dni+ " direccion: "+es.direccion+" carrera: "+es.carrera);
    }
    
}
