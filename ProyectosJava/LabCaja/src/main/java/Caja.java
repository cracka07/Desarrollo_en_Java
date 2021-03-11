/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Silvia
 */
public class Caja {
   private int alto;
   private  int ancho;
  private   int prof;
    public Caja(){
        
    }
    public Caja(int a,int b,int c){
        alto=a;
        ancho=b;
        prof=c;
        
    }
    public int volumenCaja(int a, int b, int c){
        int vol;
        vol=a*b*c;
        return vol;
    }
    public int volumenCaja(){
        return ancho*alto*prof;
    }
            
    
}
