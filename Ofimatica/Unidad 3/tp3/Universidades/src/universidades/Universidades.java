
package universidades;


public class Universidades {
    
    public static void main(String[] args){
        //Creo una isntancia universidad1
        Universidad universidad1 = new Universidad("Universidad Nacional del Nordeste", 180142, "Corrientes");
        //Creo intancias para facultad
        Facultad f1 = new Facultad("FACENA",6000,4, "12/04/1970");
        Facultad f2 = new Facultad("HUMANIDADES",3300,2,"11/03/1958");
        Facultad f3 = new Facultad("BIOQUIMICA",2000,1,"15/05/1986");
        
        //Seteo los datos para f1, f2, f3
        f1.setNombre("Facultad de Cs. Exáctas y Naturales y Agrimensura");
        f2.setNombre("Facultad de Humanidades");
        f3.setNombre("Facultad de Bioquímica");
      
        //Creo una instancia u1 de unidad academica
        UnidadAcademica u1 = new UnidadAcademica(1);
        
        //Seteo los datos para u1
        u1.setOrientacion("Investigación");
        u1.setNombre("Unidad Académica del CONICET");
        
        //Punto A
        
        //Muestro en patalla los datos de cada instancias con sus correspondientes getters
        System.out.println("------------------------------------------------------------");
        System.out.println("Nombre de la Universidad: "+ universidad1.getNombre());
        System.out.println("CUE: "+ universidad1.getCue());
        System.out.println("Provincia: "+ universidad1.getProvinciaRadicacion());
        
        //Punto B
        // facultad 1
        System.out.println("------------------------------------------------------------");
        System.out.println("Nombre de la primera Facultad: "+ f1.getNombre());
        System.out.println("Denominación: "+f1.getDenomicacion());
        System.out.println("Matricula: "+f1.getMatricula());
        System.out.println("Fecha de Creación: "+f1.getFechaCreacion());
        
        // facultad 2
        System.out.println("------------------------------------------------------------");
        System.out.println("Nombre de la segunda Facultad: "+ f2.getNombre());
        System.out.println("Denominación: "+f2.getDenomicacion());
        System.out.println("Matricula: "+f2.getMatricula());
        System.out.println("Fecha de Creación: "+f2.getFechaCreacion());
        
        // facultad 3
        System.out.println("------------------------------------------------------------");
        System.out.println("Nombre de la tercera Facultad: "+ f3.getNombre());
        System.out.println("Denominación: "+f3.getDenomicacion());
        System.out.println("Matricula: "+f3.getMatricula());
        System.out.println("Fecha de Creación: "+f3.getFechaCreacion());
        
        
        //Punto C
        System.out.println("------------------------------------------------------------");
        System.out.println("ID de la Unidad Académica: "+u1.getIdUnidadAcademica());
        System.out.println("Nombre de la Unidad Académica: "+u1.getNombre());
        System.out.println("Orientación: "+u1.getOrientacion());
        System.out.println("------------------------------------------------------------");
    }
    
}
