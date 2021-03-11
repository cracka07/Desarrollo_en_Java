
package test;

import entidad.Persona;

public class ForEachTest {
    public static void main(String[] args) {
        int edades[]={15,21,35,88};
        
        for(int edad:edades){
            System.out.println("edad:"+edad);
        }
            Persona p1[]={new Persona("Juan"), new Persona("Karla")};
            
            System.out.println("");
            
            for(Persona p: p1){
                System.out.println("p:"+p);
            }
    }
}
