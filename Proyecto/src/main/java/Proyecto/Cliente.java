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
public class Cliente {
    private int rfc;
    private String nombre, apellidoPaterno, apellidoMaterno, sexo;
    
    public Cliente(int rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String sexo){
        this.rfc=rfc;
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.sexo=sexo;
    }
    
    public Cliente(){
        this.rfc=0;
        this.nombre="";
        this.apellidoPaterno="";
        this.apellidoMaterno="";
        this.sexo="";
    }
    
    
    @Override
    public String toString(){
        return "Cliente\nNombre: "+nombre+"\nApellido paterno: "+apellidoPaterno+"\nApellido materno: "+apellidoMaterno+"\nRFC: "+rfc+"\nSexo: "+sexo;
    }

    public int getRfc() {
        return rfc;
    }

    public void setRfc(int rfc) {
        this.rfc = rfc;
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
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
}
