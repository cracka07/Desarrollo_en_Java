/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Silvia
 */
public class Persona {
    
    private int idPersona;
    private String nombre;
    private int edad;
    private static int contadorPersona;
    
   private Persona(){
   //     super(); //se manda a llamar de manera automàtica
        this.idPersona=++contadorPersona;
    }
    //Constructor Completo= sobrecarga
    public Persona(String nombre, int edad){
        this();
        this.nombre=nombre;
        this.edad=edad;
    }

    public int getIdPersona() {
        return idPersona;
    }

//    public void setIdPersona(int idPersona) {
//        this.idPersona = idPersona;
//    }

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

    public static int getContadorPersona() {
        return contadorPersona;
    }

//    public static void setContadorPersona(int contadorPersona) {
//        Persona.contadorPersona = contadorPersona;
//    }
//    

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
