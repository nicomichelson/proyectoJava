/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faker;

import java.util.Random;

/**
 *
 * @author Nico
 */
public class FakerGenerator {
    
    public String generarAsignatura(){
        
        String[] asignaturas= {"Fisica", "Matematicas", "Historia","Computacion"};
        Random r = new Random();
        
        int valor = r.nextInt(asignaturas.length);
        
        return asignaturas[valor];
        
    }
    
    public String generadorNombreMasculino(){
        String[] nombres ={"Eddi", "Jorge", "Pirulo","Cosme","Ozzy","Pericles",
                            "Pepe", "Fernando", "Alberto", "Nacho", "Eustaquio"};
        Random r = new Random();
        int valor = r.nextInt(nombres.length);
        return nombres[valor];
    }
    
    public String generadorNombreFemenino(){
        String[] nombres ={"Rocio", "Erica", "Puerca","Alicia", "Laura", "Clotilde", "Pepa", "Elena"};
        Random r = new Random();
        int valor = r.nextInt(nombres.length);
        return nombres[valor];
    }
    
    //este metodo no debe ir en esta clase pero lo pongo por ahora aca
    public static int generarNumeroAleatorio(int minimo, int maximo){
        
        int numero = (int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        
        return numero;
    }
    
    
    
}
