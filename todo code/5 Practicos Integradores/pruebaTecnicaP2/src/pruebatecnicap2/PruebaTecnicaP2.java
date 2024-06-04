

package pruebatecnicap2;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import pruebatecnicap2.logica.Cliente;
import pruebatecnicap2.logica.Ticket;


public class PruebaTecnicaP2 {

    
    public static void main(String[] args) {
        
       //creo estructura de datos
       List<Ticket> listaTickets= new ArrayList<Ticket>(); 
       
       //creo tickets
       Ticket ticket1 = new Ticket(12,2,3,1500, new Date(), new Date());
       Ticket ticket2 = new Ticket(13,2,4,1500, new Date(), new Date());
       
       //creo ticket mediante constructor vacio y aplico encapsulamiento
       Ticket ticket3= new Ticket();
       ticket3.setNumero(20);
       ticket3.setFila(5);
       ticket3.setAsiento(1);
       ticket3.setPrecio(2300);
       ticket3.setFechaDeCompra(new Date());
       ticket3.setFechaDeValidez(new Date());
       
       //agrego elementos a la lista
       listaTickets.add(ticket1);
       listaTickets.add(ticket2);
       listaTickets.add(ticket3);
       
       //suma de precios
       
       double suma= 0;
      
       for(Ticket tick: listaTickets){
           suma = suma + tick.getPrecio();
       }
       
        System.out.println("La suma de precios es de: "+suma);
       
        //pedir fila al usuario
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("ingrese la fila de la que desea ver tickets");
        int fila=teclado.nextInt();
        
        boolean bandera = false;
        
        for(Ticket tick:listaTickets){
            if(tick.getFila()==fila){
                System.out.println(tick.toString());
                bandera= true;
            }
        }
        
        if(bandera == false){
            System.out.println("No se encontraron datos de la fila en cuestión");
        }
        
        //prueba cliente
        Cliente cli= new Cliente();
        cli.setId(1);
        cli.setNombre("Lucas");
        cli.setApellido("Rojas");
        cli.setDni("123456789");
        cli.getListaTickets().add(ticket1);
        
        Ticket ticket4 = new Ticket(12,4,6,2500, new Date(2045-8-24), new Date());
        cli.getListaTickets().add(ticket4);
        
        
    }
>>>>>>> Stashed changes
}
