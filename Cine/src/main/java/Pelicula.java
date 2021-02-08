/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Pelicula {
    public String titulo, director, genero, cajaProductora, clasificacion;
    public int anio;
    public double duracion;
    public boolean subtitulos;
    
    public Pelicula(String titulo, String director, String genero, String cajaProductora, String clasificacion, int anio, double duracion, boolean subtitulos){
        this.anio= anio;
        this.cajaProductora= cajaProductora;
        this.clasificacion= clasificacion;
        this.director= director;
        this.duracion= duracion;
        this.genero= genero;
        this.subtitulos= subtitulos;
        this.titulo= titulo;
    }
    public Pelicula(){
        this.anio= 0;
        this.cajaProductora= "";
        this.clasificacion= "";
        this.director= "";
        this.duracion= 0;
        this.genero= "";
        this.subtitulos= false;
        this.titulo= "";
    }
    public Pelicula(String titulo){
        this.titulo= titulo;
    }
    @Override
    public String toString(){
        return "Título: "+titulo+"\nDirector: "+director+"\nGénero: "+genero+"\nCaja productora: "+cajaProductora+"\nClasificación: "+clasificacion+"\nAño: "+anio+"\nDuración: "+duracion+"\nSubtítulos: "+subtitulos;
    }
}
