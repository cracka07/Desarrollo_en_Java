package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {
    public static void main(String[] args) {
        PersonaDAO personaDao=new PersonaDAO();
     
//        //INSERTANDO UN NUEVO OBJETO DE TIPO PERSONA
//        
//        Persona personaNueva=new Persona("Marcelo", "Hernando", "hm@gmail.com", "789234540");
//        personaDao.insertar(personaNueva);
//        
         //Eliminar Registro
       
       Persona personaEliminar=new Persona(5);
       personaDao.eliminar(personaEliminar);
       
//       //Actualizar Objeto persona
//       
//       Persona personaActualiza=new Persona(1, "Javier", "Enrique", "jf@gmail.com", "12687562");
//       personaDao.actualizar(personaActualiza);
              //LISTADO PERSONAS
          List<Persona> personas= personaDao.seleccionar();
          personas.forEach(persona -> {
           System.out.println("Persona: "+ persona);  
    });
       
    }
}
