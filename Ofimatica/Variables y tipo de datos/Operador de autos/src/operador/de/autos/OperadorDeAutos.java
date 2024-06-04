 
package operador.de.autos;

import Automovil.Automovil;
import java.util.Scanner;

 
public class OperadorDeAutos {

     
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        System.out.print("Ingresar marca del vehiculo: ");
        String marca=teclado.nextLine();
        
        System.out.print("Ingresar modelo del vehiculo: ");
        String modelo=teclado.nextLine();
        
        System.out.print("Ingresar año de fabricacion: ");
        int anioFabricacion=teclado.nextInt();
        
        Automovil auto=new Automovil();
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setAnioFabricacion(anioFabricacion);
        
        
        
        System.out.println("---INFORMACIÓN DEL VEHICULO---");
        System.out.println("Marca: "+auto.getMarca());
        System.out.println("Modelo: "+auto.getModelo());
        System.out.println("Año de fabricación: "+auto.getAnioFabricacion());
    }
    
}
