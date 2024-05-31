 
package ejercicio.pkg2;
import java.util.Scanner;
 
public class integradorDeCondicional {

    
    public static void main(String[] args) {
        
        int empleados;
        System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
        System.out.println("1- Repositores, 2- Cajeros, 3- Supervisores");
        
        Scanner teclado = new Scanner (System.in);
        empleados = teclado.nextInt();
        
         
        double repositores= 15890 + (15890 * 0.10);
        double cajeros = 25630.89;
        double supervisores= 35560.20 - (35560.20 * 0.11) ;
        
        switch(empleados){
            case 1 -> System.out.println("los repositores cobran: $"+ repositores);
            case 2 -> System.out.println("los cajeros cobran: $"+ cajeros);
            case 3 -> System.out.println("los supervisores cobran: $"+ supervisores);
            default -> System.out.println("No as seleccionado ninguno de los tres tipos");
        }
    }
}
