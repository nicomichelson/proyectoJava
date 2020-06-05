/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.ejercicio9cine;
import Faker.*;
/**
 *
 * @author Nico
 */
public class Espectador {
    
    private String nombre;
    private int edad;
    private int dinero;
    
    FakerGenerator faker = new FakerGenerator();
    
    public Espectador(){
        nombre = faker.generadorNombreMasculino();
        edad = MetodosSueltos.generaNumeroAleatorio(15 , 100);
        dinero = MetodosSueltos.generaNumeroAleatorio(20, 1000);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public FakerGenerator getFaker() {
        return faker;
    }

    public void setFaker(FakerGenerator faker) {
        this.faker = faker;
    }

    //pagamos la entrada de la pelicula
    public void pagar(int precio){
        this.dinero -=precio;
    }
    
    //vemos si tiene la edad minima para ver la pelicula
    public boolean tieneEdad(int edadMinima){
        return this.edad >= edadMinima;
    }
    
    //indicamos si tiene dinero para pagar la entrada
    public boolean tieneDinero(int precioEntrada){
        return this.dinero >= precioEntrada;
    }
    
    @Override
    public String toString() {
        return "Espectador{" + "nombre=" + nombre + ", edad=" + edad + ", dinero=" + dinero + '}';
    }
    
    
    
    
}
