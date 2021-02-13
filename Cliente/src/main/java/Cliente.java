
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Cliente {
    public int dni, telefono;
    public String nombre;
    Coche coche;
    
    public Cliente(){
        this.coche= coche;
        this.dni= 0;
        this.nombre= "";
        this.telefono= 0;
    }
    
    public Cliente(int dni, int telefono, String nombre, Coche coche){
        this.coche= coche;
        this.dni= dni;
        this.nombre= nombre;
        this.telefono= telefono;
    }
    
    @Override
    public String toString(){
       return "Cliente: "+nombre+"\nTeléfono: "+telefono+"\nDNI: "+dni+"\n"+coche; 
    }
}
