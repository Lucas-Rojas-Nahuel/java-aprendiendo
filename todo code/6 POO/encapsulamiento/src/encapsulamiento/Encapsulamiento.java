
package encapsulamiento;


public class Encapsulamiento {

    
    public static void main(String[] args) {
        Alumno alum=new Alumno();
        Alumno alum2=new Alumno(15,"hola","pepe");
        
        
        System.out.println("id: "+ alum2.getId()+" nombre: "+alum2.getNombre()+ " apellido: "+ alum2.getApellido());
    }
    
}
