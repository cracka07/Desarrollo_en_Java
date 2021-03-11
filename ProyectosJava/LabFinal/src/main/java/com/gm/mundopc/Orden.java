
package com.gm.mundopc;

import java.util.Date;


public class Orden {
 private int idOrden;
 private Computadora computadoras[];
 private static int contadorOrdenes;
 private int contadorComputadoras;
 private static final int MAX_COMPUTADORAS=10;
 
 public Orden(){
     this.idOrden=++contadorOrdenes;
    computadoras=new Computadora[MAX_COMPUTADORAS];
     
 }
 public void agregarComputadora(Computadora comp){
     if(this.contadorComputadoras<MAX_COMPUTADORAS){
    computadoras[contadorComputadoras++]=comp ;
     }else{
         System.out.println("Superò el limite de computadoras:" + MAX_COMPUTADORAS);
     }
 }
 public void mostrarOrden(){
     System.out.println("Orden Nª: #"+this.idOrden);
     System.out.println(new Date());
     System.out.println("Computadoras en la Orden");
     for (int i = 0; i < this.contadorComputadoras; i++) {
         System.out.println(computadoras[i]);
         
     }
 }

   
    }

