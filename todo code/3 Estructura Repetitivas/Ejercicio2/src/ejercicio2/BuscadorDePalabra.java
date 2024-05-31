 
package ejercicio2;
import java.util.Scanner;
 
public class BuscadorDePalabra {

    
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingresar palabra");
        String palabra= teclado.nextLine();
        
        
        while (!palabra.equalsIgnoreCase("salir")){
            System.out.println(""+ palabra );
            
            System.out.println("Ingresar otra palabra: ");
            palabra= teclado.nextLine();
        }
        
    }
    
}
