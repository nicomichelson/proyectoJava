/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;
import Faker.*;
import Persona.*;
/**
 *
 * @author Nico
 */
public class Aula {
    
    private final int MAX_ESTUDIANTES = 15;
    
    private int id_aula;
    private Profesor profesor;
    private Estudiante[] estudiantes;
    private String asignatura;
    
    FakerGenerator faker = new FakerGenerator();
    
    public Aula(){
        this.id_aula = faker.generarNumeroAleatorio(0,100);
        
        profesor = new Profesor();
        estudiantes = new Estudiante[MAX_ESTUDIANTES];
        
        crearEstudiantes();
        
        asignatura = faker.generarAsignatura();
        
    }
    
    
    //crea los estudiantes para el aula
    private void crearEstudiantes(){
        for(int i=0; i<estudiantes.length; i++){
            estudiantes[i]= new Estudiante();
        }
    }

    //indica si la asistencia del alumno es mayor al 50%
    private boolean asistenciaAlumno(){
        int cuentaAsistencia = 0;
        
        //contamos las asistencias
        for(int i =0; i<estudiantes.length; i++){
            if(estudiantes[i].isAsistencia()){
                cuentaAsistencia++;
            }
        }
        //muestra la asistencia total
        System.out.println("hay "+ cuentaAsistencia+ " alumnos" );
        //devuelve si es mayor al 50%
        return cuentaAsistencia>=((int)(estudiantes.length/2));
    }
    
    //indicamos si se puede dar clases
    public boolean darClases(){
        //indicamos las condiciones para q se pueda dar clases
        if(!profesor.isAsistencia()){
            System.out.println("el profesor no esta, no se puede dar clases");
            return false;
        }else if((!profesor.getAsignatura().equals(asignatura))){
            System.out.println("La materia del profesor y del aula no son la misma, no se puede dar clases");
            return false;
        }else if(!asistenciaAlumno()){
            System.out.println("la asistencia no es suficiente, no se puede dar clases");
            return false;
        }
        
        System.out.println("Se pude dar clases");
        return true;
    }
    
    
    //indicamos las notas de los alumnos apobados, chicos y chicas
    public void notas(){
        
        int chicoAprobados = 0;
        int chicaAprobadas = 0;
        
        for(int i = 0; i<estudiantes.length; i++){
            
            //comprobamos si el alumno esta aprobado
            if(estudiantes[i].getCalificacion()>=5){
                //segun el sexo aumentamos en un 
                if(estudiantes[i].getSexo()=='H'){
                    chicoAprobados++;
                }else if(estudiantes[i].getSexo()=='F'){
                    chicaAprobadas++;
                }
                
                System.out.println(estudiantes[i].toString());
            }
        }
        System.out.println("Hay "+ chicoAprobados + " chicos aprobados "+ ", hay "+ chicaAprobadas + " chicas aprobadas"); 
    }
    
    
    
}
