/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Proyecto.Persona;

/**
 *
 * @author Rodrigo
 */
public class Empleado extends Persona{
    private String cargo, turno;
    private int sueldo;
    
    public Empleado(String cargo, int sueldo, String turno, String nombre, String apellidoPaterno, String apellidoMaterno, String genero, int edad, int rfc){
        super(nombre, apellidoPaterno, apellidoMaterno, genero, edad, rfc);
        this.cargo=cargo;
        this.sueldo=sueldo;
        this.turno=turno;
    }
    
    public Empleado(){
        super();
        this.cargo="";
        this.sueldo=0;
    }
    
    public Empleado(String cargo, int sueldo, String turno, String nombre, String apellidoPaterno, String apellidoMaterno, String genero, int edad){
        super(nombre, apellidoPaterno, apellidoMaterno, genero, edad);
        this.cargo=cargo;
        this.sueldo=sueldo;
        this.turno=turno;
    }
    
    @Override
    public String toString(){
        return ""+nombre;
    }

    public String imprimir(){
        return "Nombre: "+nombre+"Apellido Paterno: "+apellidoPaterno+"Género: "+genero+" Edad: "+edad+"Cargo "+cargo+"Sueldo: "+sueldo+"Turno: "+turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public int getSueldo(){
        return sueldo;
    }
    
    public void setSueldo(int sueldo){
        this.sueldo= sueldo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
}

