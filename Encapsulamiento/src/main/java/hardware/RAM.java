/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hardware;

/**
 *
 * @author Rodrigo
 */
public class RAM {
    private String marca;
    private int memoria;
    private int velocidad;
    
    public RAM(String marca, int memoria, int velocidad){
        this.memoria=memoria;
        this.marca=marca;
        this.velocidad=velocidad;
    }
    
    public RAM(){
        this.memoria=8;
        this.marca="Kingston";
        this.velocidad=2;
    }
    
    public int getMemoria(){
        return this.memoria;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public int getVelocidad(){
        return this.velocidad;
    }
    
    public void setMemoria(int memoria){
        this.memoria=memoria;
    }
    
    public void setMarca(String marca){
        this.marca=marca;
    }
    
    public void setVelocidad(int velocidad){
        this.velocidad=velocidad;
    }
    
    @Override
    public String toString(){
        return "RAM\nMarca: "+marca+"\nCantidad: "+memoria+"GB\nVelocidad: "+velocidad+"MB/s";
    }
}
