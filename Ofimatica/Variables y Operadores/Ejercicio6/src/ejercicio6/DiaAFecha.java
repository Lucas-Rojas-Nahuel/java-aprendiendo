
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
        int conMes= 1;
        int añobisiesto=0;
        
        //variables auxiliares
        int mes,año;
        mes=dia;
        año= dia;
        int conDia=0;
        int bisiesto=0;
        
        //calculamos el año
        while(año>=365){
                año= año-365;
                conAño++;
                bisiesto++;
                
                if(bisiesto==4){
                   
                    añobisiesto++;
                    bisiesto=0;
                    
                    
                }
                
        
        
        
        
        
        
        
        }
        
       
        
        
        
        //calculamos los dias del mes
        while(dia>31){
            
            if(conDia==13){
                añobisiesto++;
            }
            
            if(añobisiesto==4){
               
                if(conDia<=12){
                    switch(conDia){
                        case 1 -> dia=dia>=31?dia-31:dia;
                        case 2 -> dia=dia>=29?dia-29:dia;
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
                }else{
                    
                }
                
                
            }
            
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
            conDia++;
        }
        
        System.out.println("dia: "+ dia+" Mes: "+conMes+" Año: "+conAño);
        
    }
    
}
