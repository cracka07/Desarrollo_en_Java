public class Caja {
    private int alto;
    private int ancho;
    private int profundo;
   
    
  public Caja(){
      
  }
  public Caja(int alto, int ancho, int profundo){
      this.alto=alto;
      this.ancho=ancho;
      this.profundo=profundo;
  }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

  
  
  public int calcularVolumen(){
     int  vol=ancho*alto*profundo;
     return vol;
  }


    @Override
    public String toString() {
        return "Caja{" + "alto=" + alto + ", ancho=" + ancho + ", profundo=" + profundo + '}';
    }

   
  
}
