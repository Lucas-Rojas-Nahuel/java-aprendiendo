 
package logica;

 
public class Flor extends Planta{
    private String colorDePetalos;
    private int cantidadPromDePetalos;
    private String colorDelPistillo;
    private String colorDeLosPetalos;
    private String variedadDeFlor;
    private String estacionQueFlorece;

    public Flor() {
    }

    public Flor(String colorDePetalos, int cantidadPromDePetalos, String colorDelPistillo, String colorDeLosPetalos, String variedadDeFlor, String estacionQueFlorece, String nombre, Double altoDeTallo, boolean tieneHojas, Double climaIdeal) {
        super(nombre, altoDeTallo, tieneHojas, climaIdeal);
        this.colorDePetalos = colorDePetalos;
        this.cantidadPromDePetalos = cantidadPromDePetalos;
        this.colorDelPistillo = colorDelPistillo;
        this.colorDeLosPetalos = colorDeLosPetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public int getCantidadPromDePetalos() {
        return cantidadPromDePetalos;
    }

    public void setCantidadPromDePetalos(int cantidadPromDePetalos) {
        this.cantidadPromDePetalos = cantidadPromDePetalos;
    }

    public String getColorDelPistillo() {
        return colorDelPistillo;
    }

    public void setColorDelPistillo(String colorDelPistillo) {
        this.colorDelPistillo = colorDelPistillo;
    }

    public String getColorDeLosPetalos() {
        return colorDeLosPetalos;
    }

    public void setColorDeLosPetalos(String colorDeLosPetalos) {
        this.colorDeLosPetalos = colorDeLosPetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }
    
     

    @Override
    protected void decirLoQueSoy() {
        System.out.println("Hola soy una flor");
    }
}
