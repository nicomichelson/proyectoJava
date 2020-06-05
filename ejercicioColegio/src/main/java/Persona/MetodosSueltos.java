/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author Nico
 */
public class MetodosSueltos {
    
    
    public static   int generarNumeroAleatorio(int minimo, int maximo){
        
        int numero = (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        
        return numero;
    }
    
    
}
