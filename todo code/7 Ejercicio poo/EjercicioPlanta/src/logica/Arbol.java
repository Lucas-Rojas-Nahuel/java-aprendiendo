 
package logica;

 
public class Arbol extends Planta {
 
    private String variedad;
    private String tipoDeTronco;
    private double radioDeTronco;
    private String color;
    private String tipoDeHojas;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoDeTronco, double radioDeTronco, String color, String tipoDeHojas, String nombre, Double altoDeTallo, boolean tieneHojas, Double climaIdeal) {
        super(nombre, altoDeTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDeTronco = radioDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public double getRadioDeTronco() {
        return radioDeTronco;
    }

    public void setRadioDeTronco(double radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }
    
     

    @Override
    protected void decirLoQueSoy() {
        System.out.println("Hola soy un árbol");
    }
    
}
