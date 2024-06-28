
package ejercicio5;

import java.util.Scanner;


public class PromedioDe3Numeros {

    
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Ingresar Primera Nota: ");
        double nota1= teclado.nextDouble();
        System.out.print("Ingresar Segunda Nota: ");
        double nota2= teclado.nextDouble();
        System.out.print("Ingresar Tercera Nota: ");
        double nota3= teclado.nextDouble();
        
        double promedio= (nota1+nota2+nota3)/3;
        
        System.out.println("El proedio es de: "+promedio);
        
    }
    
}
