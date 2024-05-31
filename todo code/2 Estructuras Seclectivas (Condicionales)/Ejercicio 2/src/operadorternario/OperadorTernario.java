 
package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

  
    public static void main(String[] args) {
       double promedio;
       String condicionFinal;
       
       Scanner teclado = new Scanner(System.in);    
       
        System.out.println("Ingresar promedio del alumno");
        promedio= teclado.nextDouble();
        
        condicionFinal= promedio>=6 ? "aprovado" : "desaprobado";
        System.out.println("la condicion final es de "+ condicionFinal);
        
    }
    
}
