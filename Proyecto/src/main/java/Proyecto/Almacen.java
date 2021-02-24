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
public class Almacen {
    private String nombreAlmacen;
    private int horaInicio, horaFin;
    private ArrayList <Empleado> empleados= new ArrayList();
    private ArrayList <Medicamento> medicamentos= new ArrayList();
    
    public Almacen(String nombreAlmacen, int horaInicio, int horaFin){
        this.nombreAlmacen=nombreAlmacen;
        this.horaInicio=horaInicio;
        this.horaFin=horaFin;
        this.empleados=empleados;
        this.medicamentos=medicamentos;
    }
    
    public Almacen(){
        this.nombreAlmacen="";
        this.horaInicio=0;
        this.horaFin=0;
        this.empleados=empleados;
        this.medicamentos=medicamentos;
    }
    
    @Override
    public String toString(){
        return "Almacen "+nombreAlmacen+"\nHora de inicio: "+horaInicio+"\nHora final: "+horaFin;
    }

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
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

    public ArrayList <Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList <Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList <Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList <Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    
    public void agregarMedicamento(Medicamento medicamento){
        medicamentos.add(medicamento);
    }
    
   public String imprimirEmpleadoCompleto(){
        String lista="";
        for(Empleado empleado: empleados){
            lista+= "Nombre: "+empleado.getNombre()+"\n";
            lista+= "Apellido Paterno: "+empleado.getApellidoPaterno()+"\n";
            lista+= "Apellido Materno: "+empleado.getApellidoMaterno()+"\n";
            lista+= "Edad: "+empleado.getEdad()+"\n";
            lista+= "RFC: "+empleado.getRfc()+"\n";
            lista+= "Cargo: "+empleado.getCargo()+"\n";
            lista+= "Sueldo: "+empleado.getSueldo()+"\n";
        }
        return lista;
    }
   
    public String imprimirEmpleado(){
        String lista="";
        for(Empleado empleado: empleados){
            lista+= "Nombre: "+empleado.getNombre()+"\n";
            lista+= "Apellido Paterno"+empleado.getApellidoPaterno()+"\n";
            lista+= "Apellido Materno"+empleado.getApellidoMaterno()+"\n";
            lista+= "Cargo: "+empleado.getCargo()+"\n";
        }
        return lista;
    }
    
    public String imprimirMedicamento(){
        String listado="";
        for(Medicamento medicamento: medicamentos){
            listado+= "Nombre del medicamento: "+medicamento.getNombreMedicamento()+"\n";
            listado+= "Fecha de caducidad: "+medicamento.getFechaCaducidad()+"\n";
            listado+= "Clave del medicamento: "+medicamento.getClave()+"\n";
        }
        return listado;
    }
}