/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;
import Faker.FakerGenerator;
/**
 *
 * @author Nico
 */

import Faker.FakerGenerator;

public abstract class Persona {
    
    private static final int CHICO= 0;
    private static final int CHICA=1;
    
    
    private String nombre;
    private char sexo;
    private int edad;
    private boolean asistencia;
    
    
    FakerGenerator nombreFaker = new FakerGenerator();
    FakerGenerator numero = new FakerGenerator();
    
    public Persona(){
        int determinar_sex=  numero.generarNumeroAleatorio(0, 1);
        
        if(determinar_sex == CHICO){
            this.nombre = nombreFaker.generadorNombreMasculino();
            this.sexo = 'M';
        }else if(determinar_sex== CHICA){
            this.nombre = nombreFaker.generadorNombreFemenino();
            this.sexo='F';
        }
        
        disponibilidad();
    }
    
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public boolean isAsistencia(){
        return asistencia;
    }
    
    public void setAsistencia(boolean asistencia){
        this.asistencia = asistencia;
    }
    
    //metodo abstracto que deben implementar la clase Estudiante y profesor;
    public abstract void disponibilidad();
        
    
    
    
}
