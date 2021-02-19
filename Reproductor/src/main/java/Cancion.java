/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Cancion {
    //Atributos
    public int orden;
    public String titulo;
    public double duracion;
    
    //Métodos
    //Constructor
    public Cancion(int orden, String titulo, double duracion){
        this.orden= orden;
        this.titulo= titulo;
        this.duracion= duracion;
    }
    public Cancion(){
        this.orden= 0;
        this.titulo= "";
        this.duracion= 0;
    }
    @Override
    public String toString(){
        return "El titulo de la cancion es "+titulo+".\nSu orden es "+orden+".\nSu duración es de "+duracion+" minutos";
    }
}
