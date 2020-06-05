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
public class Lavadora extends Electrodomestico{
    
    private final static int CARGA_DEF = 5;
    
    private int carga;
    
    
    //constructor con 5 parametros
    public Lavadora(double precioBase, String color, char consumoElectrico, double peso, int carga){
        super(precioBase,color,consumoElectrico,peso);
        this.carga = carga;
    }
    //constructor por defecto
    public Lavadora(){
        this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ELECTRICO_DEF, PESO_DEF, CARGA_DEF);
    }
    //constructor con dos parametreos
    public Lavadora(double precioBase, double peso){
        this(precioBase, COLOR_DEF, CONSUMO_ELECTRICO_DEF,peso, CARGA_DEF);
    }
    
    public int getCarga(){
        return carga;
    }
    
    //precio final de la lavadora
    public double precioFinal(){
        //invocamos el metodo precioFinal de la clase padre
        double plus = super.precioFinal();
        //si tiene una carha mayor a 30 se incrementa el precio en 50
        if(carga>30)
            plus+=50;
        return plus;
    }
}
