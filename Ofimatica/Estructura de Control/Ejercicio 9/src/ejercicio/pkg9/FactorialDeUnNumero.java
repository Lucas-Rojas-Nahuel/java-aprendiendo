
package ejercicio.pkg9;

import java.util.Scanner;


public class FactorialDeUnNumero {

   
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       
        System.out.print("Ingresar un numero: ");
        int numero=teclado.nextInt();
        
        int factorial=1;
        
        for (int i = numero ; i>1; i--){
            if(i==numero){
                factorial= i*(i-1);
            }else{
                factorial= factorial * (i-1);
            }
        }
       
        System.out.println("El factorial de "+ numero+" es de "+factorial);
       
    }
    
}
