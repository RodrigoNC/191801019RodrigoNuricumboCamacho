/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author Rodrigo
 */
public class Empleado {
    private int dni;
    private String nombre, apellidoPaterno, apellidoMaterno;
    
    public Empleado(int dni, String nombre, String apellidoPaterno, String apellidoMaterno){
        this.dni=dni;
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
    }
    
    public Empleado(){
        this.dni=0;
        this.nombre="";
        this.apellidoPaterno="";
        this.apellidoMaterno="";
    }
    
    @Override
    public String toString(){
        return "Empleado\nNombre: "+nombre+"\nApellido paterno: "+apellidoPaterno+"\nApellido materno: "+apellidoMaterno+"\nDNI: "+dni;
    }
}
