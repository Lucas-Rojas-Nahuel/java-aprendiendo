package pruebatrainee;

import java.util.Scanner;

public class PruebaTrainee {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        String asientos[][] = new String[10][10];
        boolean bandera = false;

        //cargamos los asientos en estado libre
        for (int f = 0; f < 10; f++) {
            for (int a = 0; a < 10; a++) {
                asientos[f][a] = "L";

            }
        }

        //bucle al terminar el programa
        while (bandera != true) {

            System.out.println("Ingresar Fila de 1-10 a reservar");
            int fila = teclado2.nextInt() - 1;
            System.out.println("Ingresar asiento del 1-10 a reservar");
            int asiento = teclado2.nextInt() - 1;

            //bucle para que no se salga del limite de la matriz
            while (fila >= 10 || asiento >= 10) {
                if (fila >= 10) {
                    System.out.println("Solo tenemos 10 filas de asientos");
                    System.out.println("Intentelo de nuevo");
                    System.out.println("Ingresar Fila del 1 al 10 a reservar");
                    fila = teclado2.nextInt() - 1;//lo resto 1 para que el usuario ingrese del 1 al 1o
                }

                if (asiento >= 10) {
                    System.out.println("Solo tenemos 10 asientos");
                    System.out.println("Intentelo de nuevo");
                    System.out.println("Ingresar asiento del 1 al 10 a reservar");
                    asiento = teclado2.nextInt() - 1;

                }

            }
            
            //verificamos que el lugar este libre 
            if (asientos[fila][asiento].equalsIgnoreCase("l")) {

                asientos[fila][asiento] = "X";
                System.out.println("Asiento reservado con exito");
            } else {

                System.out.println("Asiento ocupado, por favor ingrese otro asiento");

            }

            
            System.out.println("¿Quiere visualizar los espacios disponibles?");
            String visuali = teclado.nextLine();

            //visualisamos los espacios disponibles    
            if (visuali.equalsIgnoreCase("si")) {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------");

                for (int f = 0; f < 10; f++) {
                    System.out.println("Fila: " + (f + 1) + "| Asiento 1 |Asiento 2 |Asiento 3 |Asiento 4 |Asiento 5 |Asiento 6 |Asiento 7 |Asiento 8 |Asiento 9 |Asiento 10 |");
                    System.out.println("        |  " + asientos[f][0] + "          " + asientos[f][1] + "          " + asientos[f][2] + "          " + asientos[f][3] + "          " + asientos[f][4] + "          " + asientos[f][5] + "          " + asientos[f][6] + "          " + asientos[f][7] + "          " + asientos[f][8] + "          " + asientos[f][9]);
                    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
                }
            }

            //damos fin al programa si el usuario desea 
            System.out.println("¿Quieres salir del programa?");
            String salir=teclado.nextLine();
            if (salir.equalsIgnoreCase("si")){
                bandera= true;
            }
            
            
        }

    }

}
