 
package ejercicio2;

import java.util.Scanner;

 
public class Ejercicio2 {

    
    public static void main(String[] args) {
      
        double matriz[][]= new double [4][4];
        
        Scanner teclado= new Scanner(System.in);
        
        double suma= 0.0;
        
        //Cargamos las notas en las matriz 
        for (int f=0; f<4; f++){
            for(int c= 0; c<3; c++){
                System.out.println("alumno "+(f+1)+ " ingresar nota "+ (c+1));
                matriz[f][c]= teclado.nextDouble();
                suma=suma+ matriz[f][c];
            }
            matriz[f][3]= suma/3;
            suma= 0.0;
        } 
       //muestro las notas
        
        for (int f=0; f<4; f++){
            System.out.println("alumno "+(f+1)+": nota 1"+"| nota 2 |"+" nota 3 |"+" promedio |");
            System.out.println("             "+matriz[f][0]+"        "+ matriz[f][1]+"        "+ matriz[f][2]+"        "+ matriz[f][3]);
        }
        
    }
    
}
