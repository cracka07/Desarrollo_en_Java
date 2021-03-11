/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.mundopc;

/**
 *
 * @author Silvia
 */
public class Teclado extends DispositivoEntrada{
    private int idTeclado;
    private static int contadorTeclado;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada,marca);
        this.idTeclado=++contadorTeclado;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclado() {
        return contadorTeclado;
    }

    @Override
    public String toString() {
        return super.toString() + "Teclado{" + "idTeclado=" + idTeclado +'}';
    }
    
}
