
package Sujeto;


public class Sujeto {
        private String nombre;
        private int edad;
        private Float altura;

    public Sujeto(String nombre, int edad, Float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Sujeto{" + "nombre=" + nombre + ", edad=" + edad + ", altura=" + altura + '}';
    }
        
        
}
