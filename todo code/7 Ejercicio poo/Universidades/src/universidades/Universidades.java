
package universidades;


public class Universidades {
    
    public static void main(String[] args){
        //Creo una isntancia universidad1
        Universidad universidad1 = new Universidad("UNNE", 180142);
        //Creo intancias para facultad
        Facultad f1 = new Facultad("Cs. Exáctas y Naturales y Agrimensura");
        Facultad f2 = new Facultad("Bioquímica");
        Facultad f3 = new Facultad("Humanidades");
        
        //Seteo los datos para f1, f2, f3
        f1.setNombre("FACENA");
        f1.setCue(190100);
        f1.setMatricula(1300);
        
        f2.setNombre("FIQU");
        f2.setCue(190101);
        f2.setMatricula(900);
        
        f3.setNombre("HUMSI");
        f3.setCue(190102);
        f3.setMatricula(600);
        
        //Creo una instancia u1 de unidad academica
        UnidadAcademica u1 = new UnidadAcademica(1);
        
        //Seteo los datos para u1
        u1.setOrientacion("Investigación");
        u1.setNombre("Unidad Académica del CONICET");
        
        //Punto A
        //Seteo la provincia de la universidad1
        universidad1.setProvinciaRadicacion("Corrientes");
        //Muestro en patalla los datos de cada instancias con sus correspondientes getters
        System.out.println("Nombre de la Universidad: "+ universidad1.getNombre()+ ", CUE: "+ universidad1.getCue()+", Provincia: "+ universidad1.getProvinciaRadicacion());
        
        //Punto B
        System.out.println("Nombre de la Facultad: "+ f1.getNombre()+", Denominación: "+f1.getDenomicacion()+", Matricula: "+f1.getMatricula());
        System.out.println("Nombre de la Facultad: "+ f2.getNombre()+", Denominación: "+f2.getDenomicacion()+", Matricula: "+f2.getMatricula());
        System.out.println("Nombre de la Facultad: "+ f3.getNombre()+", Denominación: "+f3.getDenomicacion()+", Matricula: "+f3.getMatricula());
        
        //Punto C
        System.out.println("ID de la Unidad Académica: "+u1.getIdUnidadAcademica()+ ", Nombre de la Unidad Académica: "+ u1.getNombre());
        
    }
    
}
