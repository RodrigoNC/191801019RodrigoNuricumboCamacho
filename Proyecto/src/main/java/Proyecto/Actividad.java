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
public class Actividad {
    private String nombreActividad, descripcion;
    private int numeroActividad;
    
    public Actividad(String nombreActividad, String descripcion, int numeroActividad){
        this.nombreActividad=nombreActividad;
        this.descripcion=descripcion;
        this.numeroActividad=numeroActividad;
    }
    
    public Actividad(){
        this.nombreActividad="";
        this.descripcion="";
        this.numeroActividad=0;
    }
    
    @Override
    public String toString(){
        return "Actividad: "+nombreActividad+"\nNúmero de actividad: "+numeroActividad+"\nDescripción: "+descripcion;
    }

    public String getNombreActividad() {
        return nombreActividad;
    }

    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroActividad() {
        return numeroActividad;
    }

    public void setNumeroActividad(int numeroActividad) {
        this.numeroActividad = numeroActividad;
    }
}