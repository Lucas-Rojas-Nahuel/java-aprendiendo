
package universidades;


public class Universidad {
    
    //Creo los datos a utilizar
    private String nombre;
    private int cue;
    private String provinciaRadicacion;
    
    //Creo un Constructor vacio
    public Universidad() {
    }

    //Creo un Constructor con parametros
    public Universidad(String nombre, int cue) {
        this.nombre = nombre;
        this.cue = cue;
    }

    //Sus correspondientes getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCue() {
        return cue;
    }

    public void setCue(int cue) {
        this.cue = cue;
    }

    public String getProvinciaRadicacion() {
        return provinciaRadicacion;
    }

    public void setProvinciaRadicacion(String provinciaRadicacion) {
        this.provinciaRadicacion = provinciaRadicacion;
    }
    
    
    
}
