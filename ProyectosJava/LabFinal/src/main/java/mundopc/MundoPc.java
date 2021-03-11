
package mundopc;

import com.gm.mundopc.*;


public class MundoPc {
    public static void main(String[] args) {
       Raton raton1=new Raton("hdmi","Genius");
       Raton raton2=new Raton("ps2", "logi");
       
       Teclado teclado1=new Teclado("hdmi", "toshiba");
       Teclado teclado2=new Teclado("hdmi","sony");
       
       Monitor monitor1=new Monitor("Samsung",600);
       Monitor monitor2=new Monitor("Samsung",400);
       
       Computadora computadora1=new Computadora("Lenovo",raton1,teclado1,monitor1);
       Computadora computadora2=new Computadora("Asus",raton2,teclado2,monitor2);
       
       
        Orden or1=new Orden();
        Orden or2=new Orden();
        
        or1.agregarComputadora(computadora1);
        or2.agregarComputadora(computadora2);
        
        
        or1.mostrarOrden();
        System.out.println("--------------------------------");
        or2.mostrarOrden();
    }
}
