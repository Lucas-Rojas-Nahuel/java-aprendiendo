
package ejercicio.pkg7;

import java.util.Scanner;


public class AreaTriangulo {

    
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
     
        System.out.print("Ingresar base del triangulo: ");
       double base= teclado.nextDouble();
       
        System.out.print("Ingresar altura del triangulo: ");
        double altura= teclado.nextDouble();
        
        double area= base*altura/2;
        
        System.out.println("El area de un triangulo es de "+ area);
        
        
    }
    
}
