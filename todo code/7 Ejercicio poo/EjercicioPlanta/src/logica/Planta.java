 
package logica;

 
public abstract class Planta {
    
    private String nombre;
    private Double altoDeTallo;
    private boolean tieneHojas;
    private Double climaIdeal;

    public Planta() {
    }

    
    
    public Planta(String nombre, Double altoDeTallo, boolean tieneHojas, Double climaIdeal) {
        this.nombre = nombre;
        this.altoDeTallo = altoDeTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getAltoDeTallo() {
        return altoDeTallo;
    }

    public void setAltoDeTallo(Double altoDeTallo) {
        this.altoDeTallo = altoDeTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public Double getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(Double climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    protected abstract void decirLoQueSoy();
    
    
    
}
