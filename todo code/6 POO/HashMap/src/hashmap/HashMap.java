
package hashmap;

import java.util.Map;
import java.util.HashMap;




public class HashMap {

    
    public static void main(String[] args) {
       
        Map<Integer,String> mapaEmpleados = new HashMap<>();
        
        mapaEmpleados.put(1234, "hola como estas");
        mapaEmpleados.put(6348, "hello");
        mapaEmpleados.put(3794, "7u7");
        
       /* boolean estaono = mapaEmpleados.containsValue("7u7");
        
        if(estaono==true){
            System.out.println("el valor esta");
        }else{
            System.out.println("el valor no esta");
        }*/
        
        System.out.println(mapaEmpleados.keySet());
        
        
        
        
    }
    
}
