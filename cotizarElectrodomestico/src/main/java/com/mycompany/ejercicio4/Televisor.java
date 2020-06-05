/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author Nico
 */
public class Televisor extends Electrodomestico{
    
    private final static int RESOLUCION_DEF = 20;
    
    
    private int resolucion;
    private boolean sintonizador;
    
    public Televisor(){
       this(PRECIO_BASE_DEF,COLOR_DEF,CONSUMO_ELECTRICO_DEF,PESO_DEF,RESOLUCION_DEF,false);
    }
    
    public Televisor(double precioBase, double peso){
        this(precioBase,COLOR_DEF,CONSUMO_ELECTRICO_DEF,peso,RESOLUCION_DEF,false);
    }
    
    public Televisor(double precioBase, String color, char consumoElectrico, double peso, int resolucion, boolean sintonizador){
        super(precioBase,color,consumoElectrico,peso);
        this.resolucion= resolucion;
        this.sintonizador = sintonizador;
    }
    
    public double resolucion(){
        return resolucion;
    }
    
    public double precioFinal(){
        double plus = super.precioFinal();
        //si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30%
        if(resolucion>40)
            plus += precioBase*0.3;
        //tiene un sintonizador TDT incorporado, aumentara 50 €
        if(sintonizador)
            plus+=50;
        return plus;
            
        }
    
    
}
