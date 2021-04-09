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
public class Registro {
    private int RFC, Clave;
    
    public Registro(int RFC, int Clave){
        this.RFC= RFC;
        this.Clave= Clave;
    }

    public Registro() {
    }

    @Override
    public String toString() {
        return "Registro{" + "RFC=" + RFC + ", Clave=" + Clave + '}';
    }

    public int getRFC() {
        return RFC;
    }

    public void setRFC(int RFC) {
        this.RFC = RFC;
    }

    public int getClave() {
        return Clave;
    }

    public void setClave(int Clave) {
        this.Clave = Clave;
    }
    
}
