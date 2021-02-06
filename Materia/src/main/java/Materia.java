/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Materia {
    public String nombreMateria;
    public String carreraMateria;
    public int creditosMateria;
    public int codigoMateria;
    public int cuatrimestreMateria;
    
    public Materia(String nombreMateria, String carreraMateria, int creditosMateria, int codigoMateria, int cuatrimestreMateria){
        this.carreraMateria= carreraMateria;
        this.codigoMateria= codigoMateria;
        this.creditosMateria= creditosMateria;
        this.cuatrimestreMateria= cuatrimestreMateria;
        this.nombreMateria= nombreMateria;
    }
    public Materia(){
        
    }
    @Override
    public String toString(){
        return "Materia: "+nombreMateria+"\nCarrera: "+carreraMateria+"\nCréditos: "+creditosMateria+"\nCódigo: "+codigoMateria+"\nCuatrimestre: "+cuatrimestreMateria;
    }
}
