/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Taza {
    //Atributos
    public String color;
    public double precio;
    public String tamano;
    public String modelo;
    public String material;
    
    //Métodos
    //Constructores
    public Taza(String color, double precio, String modelo, String tamano, String material){
        this.color= color;
        this.material= material;
        this.modelo= modelo;
        this.precio= precio;
        this.tamano= tamano;
    }
    public Taza(){
        this.color="";
        this.material="";
        this.modelo="";
        this.precio=0;
        this.tamano="";
    }
    //Método toString
    @Override
    public String toString(){
        return "El color de la taza es "+color+" , el precio es "+precio+" , el tamaño es "+tamano+" , el modelo es "+modelo+" , y el material es de "+material;
    }
}
