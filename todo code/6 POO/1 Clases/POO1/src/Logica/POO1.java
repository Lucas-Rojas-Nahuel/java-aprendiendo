
package Logica;

 
public class POO1 {

     
    public static void main(String[] args) {
       
        Alumno alumno1=new Alumno();
        Alumno alumno2=new Alumno(5,"juan","joselo");
        
        System.out.println("La id del alumno 2 es: "+ alumno2.getId());
        System.out.println("El nombre: "+ alumno2.getNombre());
        System.out.println("El apellido es: " +alumno2.getApellido());
        
        alumno1.setId(4);
        alumno1.setNombre("lufy");
        alumno1.setApellido("monkey");
        
        System.out.println("---------------");
        System.out.println("La id del alumno 1 es: "+ alumno1.getId());
        System.out.println("El nombre: "+ alumno1.getNombre());
        System.out.println("El apellido es: " +alumno1.getApellido());
        System.out.println("---------------");
        
    }
    
}
