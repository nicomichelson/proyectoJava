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
public class Sala {
    
    private Pelicula pelicula;
    private Asiento [][] asientos;
    private int precio;
    
    
    public Sala(){
      asientos = new Asiento[8][8];
      this.pelicula = new Pelicula();
      this.precio = 200;
      rellenarAsientos();
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
    private void rellenarAsientos(){
        int fila = asientos.length;
        for(int i=0; i<asientos.length;i++){
            for(int j=0; j<asientos[0].length; j++){
                //los chars se pueden sumar;
                asientos[i][j]= new Asiento((char)('A'+j),fila);
                //suma char A con un valor j, A es un numero entero que se representa en la tabla ASCII
                //devuelve un entero, por eso casting char
            }
            fila--; //decremento la fila para actualizar la fila
        }
    }
    //se fija si hay asientos libres
    public boolean hayAsiento(){
        for(int i=0; i<asientos.length; i++){
            for(int j=0; j<asientos[0].length; j++){
                if(!asientos[i][j].ocupado()){
                    return true;
                }
                
            }
        }
        return false;
    }
    
    //indico si en una posision concreta hay un asiento vacio
    public boolean haySitioAsiento(int fila, char letra){
        return getAsiento(fila,letra).ocupado();
    }
    
    //devuelve un asiento concreto por su fila y letra
    public Asiento getAsiento(int fila, char letra){
        return asientos[asientos.length - fila - 1][letra - 'A'];
    }
    
    //indicamos si cumple con las condiciones para q se pueda sentar
    public boolean sePuedeSentar(Espectador e){
        return e.tieneDinero(precio) && e.tieneEdad(pelicula.getEdadMinima());
    }
    
    //siento al espectador en un asiento
    public void sentar(int fila, char letra, Espectador e){
        getAsiento(fila,letra).setEspectador(e);
    }
    
    //numero de filas de la sala
    public int getFilas(){
        return asientos.length;
    }
    //numero de columnas de la sala
    public int getColumnas(){
        return asientos[0].length;
    }
    
    public void mostrar(){
        System.out.println("informacion de la sala de cine ");
        System.out.println("Pelicula "+ pelicula);
        System.out.println("Precio de la entrada " + precio);
        System.out.println(" ");
        for(int i = 0; i<asientos.length; i++){
            for(int j=0; j<asientos[0].length; j++){
                System.out.println(asientos[i][j]);
            }
            System.out.println(" ");
        }
    }
    
    
}
