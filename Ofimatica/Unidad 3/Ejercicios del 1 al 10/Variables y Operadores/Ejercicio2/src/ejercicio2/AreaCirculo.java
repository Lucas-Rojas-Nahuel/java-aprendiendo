
package ejercicio2;

import java.util.Scanner;


public class AreaCirculo {

    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Ingresar radio: ");
        double radio= teclado.nextDouble();
        
        double area= 3.14*(radio*radio);
        
        System.out.println("El area del circulo es de "+ area+"cm2");
    }
    
}
