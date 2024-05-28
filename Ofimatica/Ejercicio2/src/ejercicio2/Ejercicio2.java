 
package ejercicio2;

import java.util.Scanner;

 
public class Ejercicio2 {

    
    public static void main(String[] args) {
         Scanner teclado= new Scanner(System.in);
         
         System.out.println("Ingresar Primer numero; ");
         double num1 = teclado.nextDouble();
         
         System.out.println("Ingresar Segundo numero:");
         double num2 = teclado.nextDouble();
         
         double suma = num1 + num2;
         double resta = num1 - num2;
         double division = num1 / num2;
         double multiplicacion = num1 * num2;
        
       
         
        System.out.println("La suma de "+num1+" y "+ num2+" es de "+ suma);
        System.out.println("La resta de "+num1+" y "+ num2+" es de "+ resta);
        System.out.println("La división de "+num1+" y "+ num2+" es de "+ division);
        System.out.println("La multiplicación de "+num1+" y "+ num2+" es de "+ multiplicacion);
                
    }
    
}
