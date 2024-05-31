
package temperatura_min_y_max;

import java.util.Scanner;


public class Temperatura_min_y_max {

   
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       Scanner teclado2= new Scanner(System.in);
       Scanner teclado3= new Scanner(System.in);
       
       String nombre[]= new String[5];
       int minima[]= new int[5];
       int maxima[]= new int[5];
       
       for(int x=0; x<5; x++){
           System.out.println("Ingresar nombre de la ciudad");
           nombre[x]= teclado.nextLine();
           
           System.out.println("Ingresar temperatura minima");
           minima[x]= teclado2.nextInt();
           
           System.out.println("Ingresar temperatura maxima");
           maxima[x]= teclado3.nextInt();
           
        }
       
       int min=0;
       int posiMin=0;
       int max=0;
       int posiMax=0;
       
       for(int x=0; x<5; x++){
           
            //buscamos el valor minimo
           if(x==0){
               min= minima[x];
               posiMin= x;
           }else{
               if(min > minima[x]){
                   min= minima[x];
                   posiMin=x;
               }
           }
           
           //buscamos el valor maximo
           if(x==0){
               max= maxima[x];
               posiMax= x;
            }else{
               if(max< maxima[x]){
                   max= maxima[x];
                   posiMax= x;
               }
           }
        }
       
        System.out.println("la ciudad de "+ nombre[posiMin]+" tiene la temperatura mas minima de "+min+"º");
        System.out.println("la ciudad de "+ nombre[posiMax]+" tiene la temperatura maxima es de "+max+"º");
      
       
    }
    
}
