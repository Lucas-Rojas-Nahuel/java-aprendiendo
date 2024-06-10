 
package logica;

 
public class Arbusto extends Planta{
    
    private Double ancho;
    private boolean esDomestico;
    private String variedadArbusto;
    private String tipoDeHojas;
    private boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(Double ancho, boolean esDomestico, String variedadArbusto, String tipoDeHojas, boolean sePodaONo, String nombre, Double altoDeTallo, boolean tieneHojas, Double climaIdeal) {
        super(nombre, altoDeTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.tipoDeHojas = tipoDeHojas;
        this.sePodaONo = sePodaONo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
    
    
    
    @Override
    protected void decirLoQueSoy() {
        System.out.println("Hola soy un arbusto");
    }
    
}
