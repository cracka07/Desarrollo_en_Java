/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Silvia
 */
public class PruebaCaja {
    public static void main(String[] args) {
         int alt=9;
         int anch=3;
         int prof=3;
          
         Caja caja1=new Caja();
         System.out.println("resultado de caja1 es:"+ caja1.volumenCaja(alt,anch,prof));
        
        Caja caja2=new Caja(4,2,6);
            System.out.println("Volumen:"+" "+ caja2.volumenCaja());
    }

    
}
