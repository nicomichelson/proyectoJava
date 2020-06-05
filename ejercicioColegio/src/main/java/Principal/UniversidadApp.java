/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Persona.*;
import aula.*;

/**
 *
 * @author Nico
 */
public class UniversidadApp {
    
    public static void main(String[] args) {
        
       Aula aula1 = new Aula();
       Aula aula2 = new Aula();
       Aula aula3 = new Aula();
       Aula aula4 = new Aula();
       Aula aula5 = new Aula();
       
       //indicamos si se puede dar clases
       if(aula1.darClases()){
           aula1.notas();
       }
       if(aula2.darClases()){
           aula2.notas();
       }
       if(aula3.darClases()){
           aula3.notas();
       }
       if(aula4.darClases()){
           aula4.notas();
       }
       if(aula5.darClases()){
           aula5.notas();
       }
        
       
        
    }
    
    
}
