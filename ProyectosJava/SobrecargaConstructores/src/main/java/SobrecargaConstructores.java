/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Silvia
 */
public class SobrecargaConstructores {
    
    
    public static void main(String[] args) {
        
        Persona persona1=new Persona("Juan",5);
        
        Empleado empleado1=new Empleado("Maria", 56, 1222);
        System.out.println(empleado1);
        
    }
}
