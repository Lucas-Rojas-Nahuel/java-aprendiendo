
package ejercicio6;

import java.util.Scanner;


public class DiaAFecha {

    
    public static void main(String[] args) {
        
        Scanner teclado= new Scanner(System.in);
        
        //Introducimos dias a calcular
        System.out.println("Convertidor de dias a dia/mes/año");
        System.out.print("Ingresar dias: ");
        int dia=teclado.nextInt();
        
        //variables contadores
        int conAño=0;
        int conMes= 0;
        
        
        //variables auxiliares
        int mes,año;
        mes=dia;
        año= dia;
        int conDia=0;
       
        
        //calculamos el año
        while(año>=365){
                año= año-365;
                conAño++;
        }
        
       
        //calculamos los dias del mes
        
        while(mes>=28){
            
            conMes++;
            
            switch(conMes){
                    case 1 -> mes=mes>=31?mes-31:mes;
                    case 2 -> mes=mes>=28?mes-28:mes;
                    case 3 -> mes=mes>=31?mes-31:mes;
                    case 4 -> mes=mes>=30?mes-30:mes;
                    case 5 -> mes=mes>=31?mes-31:mes;
                    case 6 -> mes=mes>=30?mes-30:mes;
                    case 7 -> mes=mes>=31?mes-31:mes;
                    case 8 -> mes=mes>=31?mes-31:mes;
                    case 9 -> mes=mes>=30?mes-30:mes;
                    case 10 -> mes=mes>=31?mes-31:mes;
                    case 11 -> mes=mes>=30?mes-30:mes;
                    case 12 -> mes=mes>=31?mes-31:mes;
                    default -> conMes=0;
            }
        }
        
        while(dia>=28){
            conDia++;
            switch(conDia){
                    case 1 -> dia=dia>=31?dia-31:dia;
                    case 2 -> dia=dia>=28?dia-28:dia;
                    case 3 -> dia=dia>=31?dia-31:dia;
                    case 4 -> dia=dia>=30?dia-30:dia;
                    case 5 -> dia=dia>=31?dia-31:dia;
                    case 6 -> dia=dia>=30?dia-30:dia;
                    case 7 -> dia=dia>=31?dia-31:dia;
                    case 8 -> dia=dia>=31?dia-31:dia;
                    case 9 -> dia=dia>=30?dia-30:dia;
                    case 10 -> dia=dia>=31?dia-31:dia;
                    case 11 -> dia=dia>=30?dia-30:dia;
                    case 12 -> dia=dia>=31?dia-31:dia;
                    default -> conDia=0;
                }
        }
        
        System.out.println("dia: "+ dia+" Mes: "+conMes+" Año: "+conAño);
        
    }
    
}
