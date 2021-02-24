/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author Rodrigo
 */
public class Persona {

    String nombre;
    private String apellidoPaterno, apellidoMaterno, genero;
    private int edad, rfc;
    
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String genero, int edad, int rfc){
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.genero=genero;
        this.edad=edad;
        this.rfc=rfc;
    }
    
    public Persona(){
        this.nombre="";
        this.apellidoPaterno="";
        this.apellidoMaterno="";
        this.genero="";
        this.edad=0;
        this.rfc=0;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nApellido Paterno: "+apellidoPaterno+"\nApellido Materno: "+apellidoMaterno+"\nGénero: "+genero+"\nEdad: "+edad+"\nRFC: "+rfc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRfc() {
        return rfc;
    }

    public void setRfc(int rfc) {
        this.rfc = rfc;
    }
}
