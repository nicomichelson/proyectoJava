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
public class MetodosSueltos {
    
    public static int generaNumeroAleatorio(int minimo, int maximo){
        int num = (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    
}
