/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Profesores {
    private String nombre, gradoEscolar;
    private int id;
    private boolean titulado;
    
    public Profesores(String nombre, String gradoEscolar, int id, boolean titulado){
        this.nombre=nombre;
        this.id=id;
        this.gradoEscolar=gradoEscolar;
        this.titulado=titulado;
    }
    
    public Profesores(){
        this.nombre="";
        this.id=0;
        this.gradoEscolar="";
        this.titulado=false;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getGradoEscolar(){
        return this.gradoEscolar;
    }
    
    public void setGradoEscolar(String gradoEscolar){
        this.gradoEscolar=gradoEscolar;
    }
    
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    public boolean getTitulado(){
        return this.titulado;
    }
    
    public void setTitulado(boolean titulado){
        this.titulado=titulado;
    }
    @Override
    public String toString(){
        return "Profesores:\nNombre: "+nombre+"\nId: "+id+"\nGrado escolar: "+gradoEscolar+"\n¿Titulado? "+titulado;
    }
}
