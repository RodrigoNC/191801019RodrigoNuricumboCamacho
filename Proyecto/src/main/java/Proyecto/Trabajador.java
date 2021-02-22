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
public class Trabajador extends Cliente{
    private String cargo;
    private boolean titulado, tiempoCompleto;
    private double sueldo;
    public Trabajador(String cargo, boolean titulado, boolean tiempoCompleto, double sueldo, int rfc, String nombre, String apellidoPaterno, String apellidoMaterno, String sexo){
        super(rfc, nombre, apellidoPaterno, apellidoMaterno, sexo);
        this.cargo=cargo;
        this.titulado=titulado;
        this.tiempoCompleto=tiempoCompleto;
        this.sueldo=sueldo;
    }
    
    public Trabajador(){
        super();
        this.cargo="";
        this.titulado=false;
        this.tiempoCompleto=false;
        this.sueldo=0.0;
    }
    
    @Override
    public String toString(){
        return "Trabajador\nCargo: "+cargo+"\n¿Titulado? "+titulado+"\n¿Tiempo completo? "+tiempoCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isTitulado() {
        return titulado;
    }

    public void setTitulado(boolean titulado) {
        this.titulado = titulado;
    }

    public boolean isTiempoCompleto() {
        return tiempoCompleto;
    }

    public void setTiempoCompleto(boolean tiempoCompleto) {
        this.tiempoCompleto = tiempoCompleto;
    }

    public double getSueldo() {
        return sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
