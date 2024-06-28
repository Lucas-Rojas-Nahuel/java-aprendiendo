
package agregacion;


public class Agregacion {

    
    public static void main(String[] args) {
        Main main= new Main();
        
        main.factura.agregarRenglonFactura(main.reglon1);
        main.factura.agregarRenglonFactura(main.reglon2);
        main.factura.agregarRenglonFactura(main.reglon3);
    
        main.factura.mostrarInformacion();
    
    }
    
}
