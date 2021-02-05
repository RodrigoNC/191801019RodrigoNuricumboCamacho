/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Luchador {
    public String tipo;
    public int edad;
    public double peso, altura, flexibilidad, motricidad, rapidez, fuerza, resistencia;
    
    @Override
    public String toString(){
        return "El luchador "+tipo+" tiene "+edad+" años, pesa "+peso+" kg, mide "+altura+" cm, flexibilidad de "+flexibilidad+" puntos, motricidad de "+motricidad+" puntos, fuerza de "+fuerza+" N, y resistencia de "+resistencia+" puntos";
    }
}
