 
package ejercicio3;

import java.util.Scanner;

 
public class Ejercicio3 {

     
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in); 
        
        System.out.println("Ingresar DNI: ");
        int dni= teclado.nextInt();
        
        System.out.println("Ingresar Nombre: ");
        String nombre= teclado.next();
        
        
            
        while (dni != 0 || !nombre.equalsIgnoreCase("fin")){
            System.out.println("Ingresar edad; ");
            int edad= teclado.nextInt();
            
            if (edad >= 50){
                System.out.println("El participante "+ nombre+" pertenece a la categoria de Adultos Mayores");
            } else{
                if(edad > 30 ){
                   System.out.println("El participante "+ nombre+" pertenece a la categoria de Adultos "); 
                } else {
                    if(edad >= 18 ){
                        System.out.println("El participante "+ nombre+" pertenece a la categoria de Juveniles");
                    }else{
                        if(edad >= 11 ){
                            System.out.println("El participante "+ nombre+" pertenece a la categoria de Menores B");
                        }else{
                            if (edad >= 6){
                                System.out.println("El participante "+ nombre+" pertenece a la categoria de Menores A");
                            }else{
                                System.out.println("La persona "+ nombre+ " no puede participar porque es menor de edad");
                            }
                            
                        }
                    }
                }
            }
            
            System.out.println("Ingresar DNI: ");
            dni= teclado.nextInt();
        
            System.out.println("Ingresar Nombre: ");
            nombre= teclado.next();
        }
    }
    
}
