 
package operador.de.autos;

 


 
public class OperadorDeAutos {

     
    public static void main(String[] args) {
        
        
        Automovil auto=new Automovil();
        auto.setMarca("Peugeot");
        auto.setModelo("508");
        auto.setAnioFabricacion(2018);
        
        
        
        System.out.println("---INFORMACIÓN DEL VEHICULO---");
        System.out.println("Marca: "+auto.getMarca());
        System.out.println("Modelo: "+auto.getModelo());
        System.out.println("Año de fabricación: "+auto.getAnioFabricacion());
    }
    
}
