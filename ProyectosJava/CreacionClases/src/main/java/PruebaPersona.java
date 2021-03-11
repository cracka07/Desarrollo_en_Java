/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Silvia
 */
public class PruebaPersona {
    public static void main(String[] args) {
        
        //Creaciòn de objeto tipo Persona
        //Definiciòn de variable tipo Persona
        Persona persona1=new Persona();
        //accedemos al objeto Persona, llamamos al metodo desplegarNombre()
        persona1.desplegarNombre();
        
        //Modificamos los atributos de los valores del atributo  DEL OBJETO PERSONA
        persona1.nombre="Perez";
        persona1.apellido="Julian";
        
        persona1.desplegarNombre();
        
        //Creación de segundo objeto tipo Persona
        Persona persona2=new Persona();
        
        persona2.nombre="Pablo";
        persona2.apellido="Martin";
        
        persona1.desplegarNombre();
        
    }
}
