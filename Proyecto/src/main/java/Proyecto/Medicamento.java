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
    private String nombreMedicamento, tipo;
    private int volumen, fechaCaducidad, clave;
    
    public Medicamento(String nombreMedicamento, String tipo, int volumen, int fechaCaducidad, int clave){
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
        this.fechaCaducidad=0;
        this.clave=0;
    }
    
    @Override
    public String toString(){
        return "Nombre del medicamento: "+nombreMedicamento+"\nTipo: "+tipo+"\nVolumen: "+volumen+"\nFecha de caducidad: "+fechaCaducidad;
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

    public int getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
}
