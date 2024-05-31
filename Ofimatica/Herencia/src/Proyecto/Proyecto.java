
package Proyecto;

import java.util.Scanner;
import Persona.Persona;
import Estudiante.Estudiante;

public class Proyecto {

    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Scanner teclado2= new Scanner(System.in);
        
        System.out.println("Ingresar nombre");
        String nombre= teclado.nextLine();
        
        System.out.println("Ingresar Dirección");
        String direccion= teclado.nextLine();
        
        System.out.println("Ingresar Numero Legajo");
        int numeroLegajo= teclado2.nextInt();
        
        System.out.println("Ingresar Carrera");
        String carrera= teclado.nextLine();
        
        System.out.println("INFORMACION PERSONA");
        Persona pers = new Persona(nombre, direccion);
        pers.mostrarInfoPersona();
        System.out.println("");
        
        System.out.println("INFORMACION ESTUDIANTE");
        Estudiante estu= new Estudiante(numeroLegajo, carrera, nombre, direccion);
        estu.mostrarInfoEstudiante();
    }
    
}
