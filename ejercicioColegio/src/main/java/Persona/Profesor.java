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
public class Profesor extends Persona {
    private String asignatura;
    private Faker.FakerGenerator faker =new Faker.FakerGenerator();
    
    public Profesor(){
        super();
        asignatura = faker.generarAsignatura();
        super.setEdad(faker.generarNumeroAleatorio(12, 25));
    }
    
    
    public String getAsignatura(){
        return asignatura;
    }
    
    public void setAsignatura(String asignatura){
        this.asignatura = asignatura;
    }

    @Override
    public void disponibilidad() {
        int prob = faker.generarNumeroAleatorio(0,100);
        
        if(prob < 20){
            super.setAsistencia(false);
        }else{
            super.setAsistencia(true);
        }
        
        
    }

    @Override
    public String toString() {
        return "Profesor: \n"+
                super.getNombre()+"\n"+
                super.getSexo()+"\n"+
                super.getEdad()+"\n"+
                asignatura;
    }
    
    
    
    
}
