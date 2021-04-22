public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1=new Caja();
        caja1.setAlto(8);
        caja1.setAncho(1);
        caja1.setProfundo(8);
        
   System.out.println("Resultado caja1:" + caja1.calcularVolumen());
        
        
        Caja caja2=new Caja(3,2,6);
       
        int resul=caja2.calcularVolumen();
        System.out.println("El volumen de la caja2 es:" + resul);
        
       
   
}
}
