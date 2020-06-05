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
public class Electrodomestico {
    
    //constantes
    protected final static String COLOR_DEF = "blanco";
    protected final static char CONSUMO_ELECTRICO_DEF = 'F';
    protected final static double PRECIO_BASE_DEF = 100;
    protected final static double PESO_DEF = 5;
    
    
    //variables
    protected double precioBase;
    protected String color;
    protected char consumoElectrico;
    protected double peso;
    
    public Electrodomestico(double precioBase, String color, char consumoElectrico, double peso){
        
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoElectrico(consumoElectrico);
        this.peso = peso;
        
    }
    
    public Electrodomestico(double precioBase, double peso){
        
        this(precioBase, COLOR_DEF, CONSUMO_ELECTRICO_DEF,peso);
        
    }
    
    public Electrodomestico(){
        this(PRECIO_BASE_DEF,COLOR_DEF,CONSUMO_ELECTRICO_DEF,PESO_DEF);
    }
    
    private void comprobarColor(String color){
        
        //colores disponibles
        String colores[] = {"blanco","rojo","negro","azul","gris"};
        boolean encontrado = false;
        
        for(int i=0; i<colores.length; i++){
            
            if(colores[i].equals(color))
                encontrado = true;
            
            if(encontrado){
                this.color = color;
            }else{
                this.color = COLOR_DEF;
            }
        }
        
    }
    //geters
    public double getPrecioBase(){
        return precioBase;
    }
    public String getColor(){
        return color;
    }
    public char getConsumoElectrico(){
        return consumoElectrico;
    }
    public double getPeso(){
        return peso;
    }
    
    //comprueba el consumo energetico, solo controla mayusculsa
    private void comprobarConsumoElectrico(char consumoElectrico){
        
        if(consumoElectrico>=65 && consumoElectrico<=70 ){
            this.consumoElectrico = consumoElectrico;
        }else{
            this.consumoElectrico = CONSUMO_ELECTRICO_DEF;
        }
        
    }
    
    //calcula el precio final del electrodomestico
    public double precioFinal(){
        
        double plus = 0;
        
        switch(consumoElectrico){
            case 'A':
                plus +=100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus +=60;
                break;
            case 'D':
                plus +=50;
                break;
            case 'E':
                plus+=30;
                break;
            case 'F':
                plus+=10;
                break;
                
        }
        
        
        if(peso>=0 && peso<=19){
            plus+=10;
        }else if(peso >=20 && peso<= 49){
            plus+=50;
        }else if(peso >= 50 && peso<=79){
            plus+=80;
        }else if(peso>=80){
            plus+=100;
        }
        return precioBase+plus;
    }
    
}
