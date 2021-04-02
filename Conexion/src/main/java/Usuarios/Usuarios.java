/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;
/**
 *
 * @author Rodrigo
 */
public class Usuarios {
    private int id;
    private String nombreUsuario, contrasena, fechaAlta;
    private boolean estatus;

    public Usuarios(int id, String nombreUsuario, String contrasena, String fechaAlta, boolean estatus) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.fechaAlta = fechaAlta;
        this.estatus = estatus;
    }
    
    public Usuarios(String nombreUsuario, String contrasena, boolean estatus){
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.estatus = estatus;
    }
    
    public Usuarios(int id){
        this.id = id;
    }
    
    public Usuarios(int id, String nombreUsuario, String contrasena, boolean estatus){
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.estatus = estatus;
    }

    public Usuarios() {
    }

    public Usuarios(String nombreUsuario, String contrasena){
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    
    public Usuarios(int id, String nombreUsuario, String contrasena){
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }
    
    @Override
    public String toString() {
        return " " + nombreUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }



    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
    
    public String imprimir() {
        return "Usuarios:" + "\nId= " + id + "\nnombreUsuario= " + nombreUsuario + "\nContrasena=" + contrasena + "\nFechaAlta= " + fechaAlta +"\nEstatus= " +estatus;
    }
    
}