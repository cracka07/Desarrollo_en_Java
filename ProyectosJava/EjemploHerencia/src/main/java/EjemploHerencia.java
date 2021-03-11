
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Silvia
 */
public class EjemploHerencia {

    public static void main(String[] args) {
         Empleado empleado1=new Empleado("Juan",5000);
         empleado1.setEdad(45);
         empleado1.setGenero('M');
         empleado1.setDireccion("Ibarra Magnolia");
         System.out.println(empleado1);
         
         Cliente cliente1=new Cliente(new Date(), true);
         cliente1.setNombre("Enrique");
         System.out.println(cliente1);
    }
}
