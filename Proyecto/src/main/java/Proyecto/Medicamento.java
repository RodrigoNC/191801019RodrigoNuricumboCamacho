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
public class Medicamento {
    private String nombreMedicamento, tipo, fechaCaducidad;
    private int volumen, clave;
    
    public Medicamento(String nombreMedicamento, String tipo, String fechaCaducidad, int volumen, int clave){
        this.nombreMedicamento=nombreMedicamento;
        this.tipo=tipo;
        this.volumen=volumen;
        this.fechaCaducidad=fechaCaducidad;
        this.clave=clave;
    }
    
    public Medicamento(){
        this.nombreMedicamento="";
        this.tipo="";
        this.volumen=0;
        this.fechaCaducidad="";
        this.clave=0;
    }
    
    public Medicamento(String nombreMedicamento, String tipo, String fechaCaducidad, int volumen){
        this.nombreMedicamento=nombreMedicamento;
        this.tipo=tipo;
        this.fechaCaducidad=fechaCaducidad;
        this.volumen=volumen;
    }
    
    @Override
    public String toString(){
        return ""+clave+" "+nombreMedicamento;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
    
    public String imprimir(){
        return "Nombre del medicamento: "+nombreMedicamento+"\nTipo: "+tipo+"\nVolumen: "+volumen+"\nFecha de caducidad: "+fechaCaducidad;
    }
}
