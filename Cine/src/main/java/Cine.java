
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Cine {
    public String nombreCine;
    public int horaInicio, horaFin;
    public ArrayList <Pelicula> peliculas= new ArrayList();
    
    public Cine(){
        this.horaFin= 0;
        this.horaInicio= 0;
        this.nombreCine= "";
        this.peliculas= null;
    }
    public Cine(String nombreCine, int horaInicio, int horaFin){
        this.horaInicio= horaInicio;
        this.horaFin= horaFin;
        this.nombreCine= nombreCine;
        this.peliculas= peliculas;
    }
    public String imprimirPeliculas(){
        String cartelera= "";
        for(Pelicula pelicula: peliculas){
            cartelera+= pelicula.titulo+"\n";
        }
        return cartelera;
    }
    public void agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
    }
    //Método para calcular la cantidad de películas
    public int cantidadPeliculas(){
        return peliculas.size();
    }
    //Método para mostrar un menú de todas las películas
    public String menu(){
        String menu= "";
        int contador= 1;
        menu+= "Menú de películas\n";
        for(Pelicula pelicula: peliculas){
            menu+= ""+contador+"-  "+pelicula.titulo+"\n";
            contador++;
        }
        return menu;
    }
    //Método para determinar su el cine está abierto en base a una hora ingresada
    public boolean cineAbierto(int hora){
        if(hora<horaInicio || hora>horaFin){
            return false;
        }
        else{
            return true;
        }
    }
    @Override
    public String toString(){
        return "Cine: "+nombreCine+"\nHora de inicio: "+horaInicio+"\nHora final: "+horaFin;
    }
}
