
package ejercicio.pkg8;

import java.util.Scanner;


public class ParEImpar {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Ingresar un numero: ");
        double numero= teclado.nextDouble();
        
        if (numero%2==0){
            System.out.println("El numero "+numero+" es par");
        }else{
            System.out.println("El numero "+numero+" es impar");
        }
        
        
    }
    
}
