/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

/**
 *
 * @author Rodrigo
 */
public class Persona {
    private String nombre, apellidoPaterno, apellidoMaterno, sexo;
    private int edad;
    Instituto instituto;
    
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String sexo, Instituto instituto){
        this.nombre=nombre;
        this.apellidoPaterno=apellidoPaterno;
        this.apellidoMaterno=apellidoMaterno;
        this.edad=edad;
        this.sexo=sexo;
        this.instituto=instituto;
    }
    
    public Persona(){
        this.nombre="";
        this.apellidoPaterno="";
        this.apellidoMaterno="";
        this.edad=0;
        this.sexo="";
        this.instituto=instituto;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getApellidoPaterno(){
        return this.apellidoPaterno;
    }
     
    public void setApellidoPaterno(String apellidoPaterno){
        this.apellidoPaterno=apellidoPaterno;
    }
    
    public String getApellidoMaterno(){
        return this.apellidoMaterno;
    }
     
    public void setApellidoMaterno(String apellidoMaterno){
        this.apellidoMaterno=apellidoMaterno;
    }
    
    public String getSexo(){
        return this.sexo;
    }
     
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    
    public int getEdad(){
        return this.edad;
    }
     
    public void setEdad(int edad){
        this.edad=edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nApellido paterno: "+apellidoPaterno+"\nApellido materno: "+apellidoMaterno+"\nEdad: "+edad+"\nSexo: "+sexo+""+instituto;
    }
}
