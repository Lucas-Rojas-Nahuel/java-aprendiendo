 
package carga_de_una_matriz;

 
public class Carga_De_Una_Matriz {

    
    public static void main(String[] args) {
         int numero[][]= new int[4][5];
         
         for (int x=0; x<4; x++){
             for(int i= 0; i<5; i++){
             numero[x][i]= 5;
                 System.out.println(numero[x][i]);
             }
         }
    }
    
}
