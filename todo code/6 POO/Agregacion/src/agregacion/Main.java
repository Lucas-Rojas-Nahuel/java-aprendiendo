 
package agregacion;

 
public class Main {
    private Cliente cliente;
    Factura factura;
    public RenglonFactura reglon1;
    RenglonFactura reglon2;
    RenglonFactura reglon3;
    
    public Main(){
    cliente = new Cliente(12349,"Juan Perez");
    factura = new Factura(1,new Fecha(31,12,2023), cliente);
    reglon1= new RenglonFactura("Producto 1", 1, 100);
    reglon2= new RenglonFactura("Producto 2", 2, 200);
    reglon3= new RenglonFactura("Producto 3", 3, 300);
    }
}


