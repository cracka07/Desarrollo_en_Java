
package com.gm.ventas;
import java.util.Date;

public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;  
    private static final int MAX_PRODUCTOS=10;
    
    public Orden(){
        this.idOrden=++contadorOrdenes;
        productos=new Producto[MAX_PRODUCTOS];
    }
  
    public void agregarProducto(Producto producto){
        if (this.contadorProductos<MAX_PRODUCTOS){
    //Se inicializa el contadorProducto, y una vez que se ingresa un nuevo producto, el contador incrementa en uno
            productos[this.contadorProductos++]= producto;
    }else{
            System.out.println("Se ha superado el màximo de productos:"+ MAX_PRODUCTOS);
        }
    }
    public double calcularTotal(){
        double total=0;
        for (int i = 0; i < this.contadorProductos; i++) {
            //Declarar una variable para almacenar la posición que estamos recorriendo
            Producto producto=this.productos[i];
            total+=producto.getPrecio();
        }
          return total;
}
    public void mostrarOrden(){
        System.out.println("Orden #:"+this.idOrden);
        System.out.println("Fecha de orden: "+ new Date());
        System.out.println("Total de la Orden:"+this.calcularTotal());
        System.out.println("Productos de la orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
//            Producto producto=productos[i];
//            System.out.println(producto);
            System.out.println(productos[i]);
            
        }
        
    }
}
    
