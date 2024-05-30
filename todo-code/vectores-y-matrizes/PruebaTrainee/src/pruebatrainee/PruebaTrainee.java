package pruebatrainee;

import java.util.Scanner;

public class PruebaTrainee {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);

        String asientos[][] = new String[10][10];
        boolean bandera = false;

        //cargamos los asientos de la matriz
        for (int f = 0; f < 10; f++) {
            for (int a = 0; a < 10; a++) {
                asientos[f][a] = "L";

            }
        }

        //bucle al terminar el programa
        while (bandera != true) {

            //visualisamos los espacios disponibles
            System.out.println("¿Quiere visualizar los espacios disponibles?");
            String visuali = teclado.nextLine();

            if (visuali.equalsIgnoreCase("si")) {
                dibujarMapa(asientos);
            }

            System.out.println("Ingresar Fila del (1 al 10) a reservar");
            int fila = teclado2.nextInt() - 1;
            System.out.println("Ingresar asiento del (1 al 10) a reservar");
            int asiento = teclado2.nextInt() - 1;

            //bucle para que no se salga del limite de la matriz
            boolean fals = false;
            while (fals != true) {
                if (fila >= 10 || fila < 0) {
                    System.out.println("Solicitud de Fila denegada");
                    System.out.println("Intentelo de nuevo");
                    System.out.println("Ingresar Fila del (1 al 10) a reservar");
                    fila = teclado2.nextInt() - 1;//lo resto 1 para que el usuario ingrese del 1 al 1o

                }

                if (asiento >= 10 || asiento < 0) {
                    System.out.println("Solicitud de Asiento denegada");
                    System.out.println("Intentelo de nuevo");
                    System.out.println("Ingresar asiento del (1 al 10) a reservar");
                    asiento = teclado2.nextInt() - 1;

                }

                //verificamos que el lugar este libre 
                if (asientos[fila][asiento].equalsIgnoreCase("l")) {

                    asientos[fila][asiento] = "X";
                    System.out.println("Asiento reservado con exito");
                    fals = true;//si el asiento esta reservado terminamos el bucle
                } else {//en caso contrario solicitamos de nuevo los datos

                    System.out.println("Asiento ocupado, por favor ingrese otro asiento");

                    System.out.println("Ingresar Fila del (1 al 10) a reservar");
                    fila = teclado2.nextInt() - 1;

                    System.out.println("Ingresar asiento del (1 al 10) a reservar");
                    asiento = teclado2.nextInt() - 1;

                }

            }

            //damos fin al programa si el usuario desea 
            System.out.println("¿Quieres salir del programa?");
            String salir = teclado.nextLine();
            if (salir.equalsIgnoreCase("si")) {
                bandera = true;
            }

        }

    }

    static void dibujarMapa(String[][] asientos) {

        for (int f = 0; f < 10; f++) {
            System.out.print((f + 1) + " ");
            for (int a = 0; a < 10; a++) {
                System.out.print("[" + asientos[f][a] + "]");
            }
            System.out.println("");
        }

    }

}
