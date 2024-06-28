
package agregacion;

import java.util.ArrayList;



public class Factura {
    public int numeroFactura;
    public Fecha fecha;
    public Cliente cliente;
    public ArrayList<RenglonFactura> renglonesFacturas;

    public Factura(int numeroFactura, Fecha fecha, Cliente cliente) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.renglonesFacturas= new ArrayList<>();
    }

    

    public void agregarRenglonFactura(RenglonFactura renglonFactura){
        this.renglonesFacturas.add(renglonFactura);
    }
    
    public double calcularTotal(){
        double total = 0;
        for(RenglonFactura renglon: renglonesFacturas){
            total+= renglon.getImporteTotal();
        }
        return total;
    }

    public void mostrarInformacion(){
        System.out.println("Numero de factura: "+numeroFactura);
        System.out.println("Fecha: "+ fecha.dia+"/"+fecha.mes+"/"+fecha.anio);
        System.out.println("Cliente: DNI:"+cliente.dni+" Nombre: "+ cliente.nombre);
        System.out.println("Renglon de factura");
        for(RenglonFactura renglon: renglonesFacturas){
            System.out.println("-"+ renglon.getDescripcion()+"- Cantidad: "+renglon.getCantidad()+" - Precio unitario: "+renglon.getPrecioUnitario()+"- Importe total: "+ renglon.getImporteTotal());
        }
        System.out.println("Total: "+ calcularTotal());
    }
    
    
}
