
package declararvariable;

import java.util.Scanner;


public class declararVariable {

    
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Ingresar nombre: ");
        String nombre=teclado.nextLine();
        
        System.out.print("Ingresar edad: ");
        int edad=teclado.nextInt();
        
        System.out.print("Ingresar altura: ");
        Float altura=teclado.nextFloat();
        
        Sujeto datos=new Sujeto(nombre, edad, altura);
        System.out.println(datos.toString());
        
        
        
        
    }
    
}
