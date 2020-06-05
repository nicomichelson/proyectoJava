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
public class PrincipalElectrodomestico {
   
    public static void main(String[] args){
        //creamos un array de 10 electrodomesticos
        Electrodomestico listaElectrodomesticos[]= new Electrodomestico[10];
        
        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Electrodomestico(200,"Verde", 'C',60);
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Televisor(500, "negro", 'E',80, 42, false);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(600, "gris", 'D',20 );
        listaElectrodomesticos[5]=new Lavadora(300, "blanco", 'Z',40 , 40);
        listaElectrodomesticos[6]=new Televisor(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, "verde", 'A', 100, 15);
        listaElectrodomesticos[8]=new Televisor(200, "naranja", 'C', 60, 30, true);
        listaElectrodomesticos[9]=new Electrodomestico(50, 10); 
        
        //creamos las variables para almacenar la suma de los precios
        
        double sumaElectrodomestico=0;
        double sumaTelevisor = 0;
        double sumaLavadora =0;
        
        /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
        */
        
        for(int i=0; i<listaElectrodomesticos.length; i++){
            
            if(listaElectrodomesticos[i] instanceof Electrodomestico)
                sumaElectrodomestico += listaElectrodomesticos[i].precioFinal();
            if(listaElectrodomesticos[i] instanceof Televisor)
                sumaTelevisor += listaElectrodomesticos[i].precioFinal();
            if(listaElectrodomesticos[i] instanceof Lavadora)
                sumaLavadora += listaElectrodomesticos[i].precioFinal();
            
        }
        
        //mostramos los resultados
        
        System.out.println("La suma de los precios de los Electrodomesticos es de "+ sumaElectrodomestico);
        System.out.println("La suma de los precios de los Televisores es de "+ sumaTelevisor);
        System.out.println("La suma de los precios de los Lavadora es de "+ sumaLavadora);
    }
    
    
}
