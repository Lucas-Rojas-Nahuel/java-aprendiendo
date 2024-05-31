 
package empresa_de_vuelo;

import java.util.Scanner;

 
public class Empresa_De_vuelo {

     
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        int vuelo[][]= new int[6][3];
        
        for (int f=0; f< 6; f++){
        
            for(int c=0; c<3; c++){
                System.out.println("vuelo "+(f+1)+" turno: "+ (c+1));
                vuelo[f][c]= teclado.nextInt();
            
            }
            
        }
        
        int numeroDestino;
        int numeroDeVuelo;
        int numeroPasaje;
        
        
        System.out.println("Destino: 1-Rio de Janeiro, 2-Cancún, 3-Madrid, 4-Roma, 5-Milan, 6-Iguazú, 7-salir");
        System.out.println("Ingresar un numero de destino: ");
        numeroDestino= teclado2.nextInt()-1;
        
        while(numeroDestino!=6){
            System.out.println("1-Mañana, 2-Mediodia, 3-Noche");
            System.out.println("Ingresar un numero de vuelo");
            numeroDeVuelo= teclado2.nextInt()-1;
        
            System.out.println("Ingresar la cantidad de pasaje que necesita: ");
            numeroPasaje= teclado2.nextInt();
        
            if(numeroPasaje<= vuelo[numeroDestino][numeroDeVuelo]){
                System.out.println("su reserva fue realizada con éxito");
                vuelo[numeroDestino][numeroDeVuelo]= vuelo[numeroDestino][numeroDeVuelo]-numeroPasaje;
            }else{
                System.out.println("disculpe, no se pudo completar su operación dado que no hay asientos disponibles");
            }
        
        
            System.out.println("Destino: 1-Rio de Janeiro, 2-Cancún, 3-Madrid, 4-Roma, 5-Milan, 6-Iguazú, 7-salir");
            System.out.println("Ingresar un numero de destino: ");
            numeroDestino= teclado2.nextInt()-1;
       
        }
        
    }
    
 }
