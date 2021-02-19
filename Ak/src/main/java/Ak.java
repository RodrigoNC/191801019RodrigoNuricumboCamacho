/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Ak {
    
    //Atributos
    public String material, disponibilidad;
    public int municion;
    public double velocidadDisparo, precision, danio, precio;
    
    
    //Métodos
    
    @Override
    public String toString(){
        return "El material del arma es de "+material+" con una disponibilidad "+disponibilidad+" con una munición de "+municion+" con una velocidad de disparo "+velocidadDisparo+" con precisión de "+precision+" con un daño de "+danio+" y con un precio de "+precio;
    }
}
