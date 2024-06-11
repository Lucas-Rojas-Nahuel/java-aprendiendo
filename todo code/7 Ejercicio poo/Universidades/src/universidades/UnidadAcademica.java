
package universidades;


public class UnidadAcademica extends Universidad{
    
    //Creo los datos a utilizar
    private int idUnidadAcademica;
    private String orientacion;

    //Creo un Constructor con parametros
    public UnidadAcademica(int idUnidadAcademica) {
        this.idUnidadAcademica = idUnidadAcademica;
    }

    //Sus correspondientes getters y setters
    public int getIdUnidadAcademica() {
        return idUnidadAcademica;
    }

    public void setIdUnidadAcademica(int idUnidadAcademica) {
        this.idUnidadAcademica = idUnidadAcademica;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    
    
    
}
