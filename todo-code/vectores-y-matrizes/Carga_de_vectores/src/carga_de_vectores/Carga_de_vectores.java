 
package carga_de_vectores;

import java.util.Scanner;

 
public class Carga_de_vectores {

     
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
    
        String vector[]= new String[8];
        
        for(int x=0; x<vector.length; x++){
            System.out.println("Ingresar nombre "+ (x+1));
            vector[x]= teclado.nextLine();
        }
        
        for(int x=0; x<vector.length; x++){
            System.out.println((x+1)+": "+vector[x]);
        }
    
    
    
    }
    
}
