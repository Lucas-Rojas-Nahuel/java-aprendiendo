
package herencia;


public class Empleado extends Persona{
    int numeroLegajo;
    String cargo;
    Double sueldo;

    public Empleado() {
    }

    public Empleado(int numeroLegajo, String cargo, Double sueldo, int id, String dni, String nombre, String apellido, String domicilio, String telefono) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.numeroLegajo = numeroLegajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public int getNumeroLegajo() {
        return numeroLegajo;
    }

    public void setNumeroLegajo(int numeroLegajo) {
        this.numeroLegajo = numeroLegajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    
    
    
    
    
}
