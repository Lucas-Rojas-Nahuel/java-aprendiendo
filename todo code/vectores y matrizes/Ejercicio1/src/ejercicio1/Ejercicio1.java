
package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
        
        int vector[] = new int[15];
       
       for(int i= 0 ; i < vector.length; i++){
           System.out.println("Ingresar numero para la posicion "+(i+1));
           vector[i]= teclado.nextInt();
       }
       
       int cont= 0;
       
       for (int x= 0; x<vector.length; x++){
           
           if(vector[x]== 3){
               cont= cont +1;
           }
       }
       
        System.out.println("El numero 3 apararecio "+ cont+" veces");
       
    }
    
}
