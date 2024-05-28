 
package ejercicio1;

import java.util.Scanner;

 
public class Ejercicio1 {

     
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        System.out.println("Ingresar grados Celsius, para convertir a grados Fahrenheit: ");
        double celsius = teclado.nextDouble();
        
        double fahrenheit= celsius* 1.8 + 32;
        
        System.out.println(celsius+ "ºC es igua a "+ fahrenheit+"ºF");
           
    }
    
}
