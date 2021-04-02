/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public abstract class Personajes {
    private int id, vida;
    private String nombre, raza;
    
    public Personajes(int id, int vida, String nombre, String raza){
        this.id=id;
        this.nombre=nombre;
        this.raza=raza;
        this.vida=vida;
    }
    
    public Personajes(){
        this.id=0;
        this.nombre="";
        this.raza="";
        this.vida=0;
    }

    @Override
    public String toString() {
        return "Personajes:" + "id=" + id + ", vida=" + vida + ", nombre=" + nombre + ", raza=" + raza;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    } 
}
