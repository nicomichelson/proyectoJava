/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cine.ejercicio9cine;

/**
 *
 * @author Nico
 */
public class Pelicula {
    
    private String titulo;
    private int duracion;
    private String director;
    private int edadMinima;
    
    public Pelicula(){
        titulo = Constante.PELICULAS[MetodosSueltos.generaNumeroAleatorio(0, 3)];
        duracion = 20;
        director = "Cosme Fulanito";
        edadMinima = 18;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", director=" + director + ", edadMinima=" + edadMinima + '}';
    }
    
    
    
}
