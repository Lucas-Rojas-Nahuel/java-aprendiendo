
package universidades;

import java.util.Date;


public class Facultad extends Universidad {
    
    //Creo los datos a utilizar
    private String denomicacion;
    private int matricula;
    private int cantidadCarreras;
    private Date fechaCreacion;

    //Creo un Constructor con parametros
    public Facultad(String denomicacion) {
        this.denomicacion = denomicacion;
    }

    //Sus correspondientes getters y setters
    public String getDenomicacion() {
        return denomicacion;
    }

    public void setDenomicacion(String denomicacion) {
        this.denomicacion = denomicacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCantidadCarreras() {
        return cantidadCarreras;
    }

    public void setCantidadCarreras(int cantidadCarreras) {
        this.cantidadCarreras = cantidadCarreras;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
    
}
