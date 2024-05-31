 
package ejercicios;
import java.util.Scanner;

 
public class numeroAImprimir {
    public static void main(String[] args){
        int num ;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar limite de numero que quiere contar: ");
        
        num = teclado.nextInt();
        
        for (int i=1 ; i <= num; i++){
            System.out.println("numero: "+ i);
        }
    }
}
