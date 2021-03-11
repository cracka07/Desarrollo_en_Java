
package arreglos;


public class EjemplosArreglos {
    public static void main(String[] args) {
        
      //Declarar variable tipo Arreglo
        int edades[];
        // Instanciar el arreglo
        edades=new int[3];
        
        //inicializar
            edades[0]=30;
            edades[1]=15;
            edades[2]=20;
            
            //Imprimir valores de arreglo
            
            System.out.println("arreglos enteros:"+ edades[0]);
                System.out.println("arreglos enteros:"+ edades[1]);
                    System.out.println("arreglos enteros:"+ edades[2]);
                       // System.out.println("arreglos enteros:"+ edades[5]);
                       
           //Declarar e instanciar arreglos tipo Object
           
           Persona persona[]=new Persona[4];
           
           persona[0]=new Persona("Juan");
           persona[1]=new  Persona("Maria");
           
           System.out.println("Arreglo Persona:"+ persona[0]);
           
           
           String nombres[]={"Juan","Maria","Laura","Ricardo"};
           
           for (int i = 0; i < nombres.length; i++) {
               System.out.println("Arreglo indice: "+ i + ":" + nombres[i]);
            
        }
    }
}
