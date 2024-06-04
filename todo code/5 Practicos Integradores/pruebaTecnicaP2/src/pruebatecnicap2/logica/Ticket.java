
package pruebatecnicap2.logica;

import java.util.Date;


public class Ticket {
    
    private int numero;
    private int fila;
    private int asiento;
    private double precio;
    private Date fechaDeCompra;
    private Date fechaDeValidez;
    
    
    
    public Ticket() {
    }

    public Ticket(int numero, int fila, int asiento, double precio, Date fechaDeCompra, Date fechaDeValidez) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fechaDeCompra = fechaDeCompra;
        this.fechaDeValidez = fechaDeValidez;
    }

    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public int getNumero(){
        return numero;
    }
    
    public void setFila(int fila){
        this.fila=fila;
    }
     
    public int getFila(){
        return fila;
    }
    
    public void setAsiento(int asiento){
        this.asiento=asiento;
    }
    
    public int getAsiento(){
        return asiento;
    }
    
    public void setPrecio(double precio){
        this.precio=precio;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setFechaDeCompra(Date fechaDeCompra){
        this.fechaDeCompra= fechaDeCompra;
    }
    
    public Date getFechaDeCompra(){
        return fechaDeCompra;
    }
    
    public void setFechaDeValidez(Date fechaDeValidez){
        this.fechaDeValidez= fechaDeValidez;
    }
    
    public Date getFechaDeValidez(){
        return fechaDeValidez;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", precio=" + precio + ", fechaDeCompra=" + fechaDeCompra + ", fechaDeValidez=" + fechaDeValidez + '}';
    }
    
    
    
    
}
