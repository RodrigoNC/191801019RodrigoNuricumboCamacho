/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Coche {
    public String marca, color;
    public int matricula;
    public double precio;
    public String tamanio;
    
    public Coche (String marca, String color, int matricula, double precio, String tamanio){
        this.color= color;
        this.marca= marca;
        this.matricula= matricula;
        this.precio= precio;
        this.tamanio= tamanio;
    }
    
    public Coche (){
        this.color= "";
        this.marca= "";
        this.matricula= 0;
        this.precio= 0.0;
        this.tamanio= "";
    }
    @Override
    public String toString(){
        return "Coche\nColor: "+color+"\nMarca: "+marca+"\nMatricula: "+matricula+"\nPrecio: "+precio+"\nTamaño: "+tamanio;
    }
}
