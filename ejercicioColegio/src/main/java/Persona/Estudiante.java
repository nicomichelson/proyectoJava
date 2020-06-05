/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;
import Faker.*;
/**
 *
 * @author Nico
 */
public class Estudiante extends Persona {
    
   private int calificacion;
   
   private FakerGenerator cal = new FakerGenerator(); 
   
   public Estudiante(){
       super();
       calificacion=cal.generarNumeroAleatorio(0, 10);
       super.setEdad(cal.generarNumeroAleatorio(12, 25));
   }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public void disponibilidad() {
        
        //para q funcione un metodo en un metdo (generarNumero) abstracto el metodo a utilizar debe ser static
        int prob = cal.generarNumeroAleatorio(0, 100);
        if(prob < 50){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
    }

    
    
    

    @Override
    public String toString() {
        return "Estudiante: \n"+
                super.getNombre()+"\n"+
                super.getSexo()+"\n"+
                super.getEdad()+"\n"+
                calificacion;
    }
    
      
    
    
}
