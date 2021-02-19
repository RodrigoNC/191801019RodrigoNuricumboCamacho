/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programador;

import empleado.Empleado;

/**
 *
 * @author Rodrigo
 */
public class Programador extends Empleado{
    private int sueldo;
    
    public Programador(int sueldo, int dni, String nombre, String apellidoPaterno, String apellidoMaterno){
        super(dni, nombre, apellidoPaterno, apellidoMaterno);
        this.sueldo=sueldo;
    }
    
    public Programador(){
        super();
        this.sueldo=0;
    }
    
    @Override
    public String toString(){
        return "Programador\nSueldo: "+sueldo;
    }
}
