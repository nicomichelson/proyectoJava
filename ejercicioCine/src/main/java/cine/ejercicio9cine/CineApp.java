/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.ejercicio9cine;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class CineApp {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de espectadores");
        int cantEspectadores = sn.nextInt();
        
        Sala sala = new Sala();
        Espectador e;
        int fila;
        char letra;
        
        
        
       for(int i = 0; i < cantEspectadores && sala.hayAsiento(); i++){
        
        e = new Espectador();
        System.out.println(e);
        
        do{
            fila = MetodosSueltos.generaNumeroAleatorio(0, sala.getFilas()-1);
            letra = (char)MetodosSueltos.generaNumeroAleatorio('A', 'A'+(sala.getColumnas()-1));
        }while(sala.haySitioAsiento(fila, letra));
        
        //si el espectador cumple con las condiciones
        if(sala.sePuedeSentar(e)){
            e.pagar(sala.getPrecio());//el espectador paga el precio de la entrada
            sala.sentar(fila, letra, e);//el espectador se sienta
        }
        
       }
                
        System.out.println("muestra el pute");
        sala.mostrar();
    }
    
    
}
