
package bloquescodigo;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //Bloques de inicialización código estatico
    
    static{
             contadorPersona=10;
             //No podemos inicializar variables no estaticas dentro del bloque estatico
             //idPersona=4;
             System.out.println("Ejecucion de bloque estatico");
    }
    
    //Bloque no estàtico se copia a cada objeto
    
    {
        System.out.println("Ejecucion de bloque no estatico");
        this.idPersona=++contadorPersona;
    }
  public  Persona(){
        System.out.println("Ejeccucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }
    
    
    
    
}
