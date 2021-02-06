/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Yogurt {
    //Atributos
    public String nombre;
    public String marca;
    public int cantidad;
    public int codigo;
    public String sabor;
    public double precio;
    
    //Métodos
    public Yogurt(String nombre, String marca, int cantidad, int codigo, String sabor, double precio){
        this.cantidad= cantidad;
        this.codigo= codigo;
        this.marca= marca;
        this.nombre= nombre;
        this.precio= precio;
        this.sabor= sabor;
    }
    
    public Yogurt(){
        this.cantidad= 0;
        this.codigo= 0;
        this.marca= "";
        this.nombre= "";
        this.precio= 0;
        this.sabor= "";
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nMarca: "+marca+"\nSabor: "+sabor+"\nCodigo: "+codigo+"\nPrecio: "+precio+"\nCantidad: "+cantidad;
    }
}
