
package excepciones;


public class Excepciones {

    
    public static void main(String[] args) {
      
        try {
            int resultado = 3/0;
        }
        catch(Exception e){
            System.out.println("No se puede dividir por cero");
        }
        
        
        int edades []= {15, 12, 23, 30};
        
        
        try{
            System.out.println("la edad de la posicion 4 es: "+ edades[4]);
        }
        catch(Exception e){
            System.out.println("Intentaste acceder a una posicion no existenete");
        }
    }
    
}
