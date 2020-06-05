/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.ejercicio9cine;

/**
 *
 * @author Nico
 */
public class Asiento {
    
    private char letra;
    private int fila;
    private Espectador espectador;//informacion del espectador si esta sentado, null si esta vacio
    
    public Asiento(char letra, int fila){
        this.letra= letra;
        this.fila = fila;
        this.espectador = null;//al iniciar el asiento, no habra nadie sentado
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }
    
    //indica si el aseinto esta ocupado
    public boolean ocupado(){
        return espectador != null;
    }

    @Override
    public String toString() {
        if(ocupado()){
           return "Asiento: " + fila+letra+ " y" + espectador;
        }
        return "Asiento: " + fila+letra+ " y este asiento esta vacio" ;
    }
    
    
    
    
}
