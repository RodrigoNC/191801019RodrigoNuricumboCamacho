/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.util.ArrayList;

/**
 *
 * @author Rodrigo
 */
public class Empresa {
    private String nombreEmpresa;
    private int horaInicio, horaFin;
    private ArrayList <Cliente> clientes= new ArrayList();
    private ArrayList <Trabajador> trabajadores= new ArrayList();
    
    public Empresa(String nombreEmpresa, int horaInicio, int horaFin){
        this.nombreEmpresa=nombreEmpresa;
        this.horaInicio=horaInicio;
        this.horaFin=horaFin;
        this.clientes= clientes;
        this.trabajadores= trabajadores;
    }
    
    public Empresa(){
        this.nombreEmpresa="";
        this.horaInicio=0;
        this.horaFin=0;
        this.clientes=null;
        this.trabajadores=null;
    }
    @Override
    public String toString(){
        return "Empresa: "+nombreEmpresa+"\nHora de inicio: "+horaInicio+"\nHora final: "+horaFin;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public int getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(int horaInicio) {
        this.horaInicio = horaInicio;
    }

    public int getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(int horaFin) {
        this.horaFin = horaFin;
    }

    public ArrayList <Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList <Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList <Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(ArrayList <Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public int cantidadClientes(){
        return clientes.size();
    }
    
    public int cantidadTrabajadores(){
        return trabajadores.size();
    }
}
