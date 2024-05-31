
package ejercicio1;

import java.util.Scanner;


public class SumaDeDosNumero {

    
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Ingresar primer numero: ");
        int num1= teclado.nextInt();
        
        System.out.print("Ingresar segundo numero: ");
        int num2= teclado.nextInt();
        
        int suma= num1 + num2;
        
        System.out.println("la suma de "+num1+" y "+num2+" es de "+ suma);
        
        
    }
    
}
