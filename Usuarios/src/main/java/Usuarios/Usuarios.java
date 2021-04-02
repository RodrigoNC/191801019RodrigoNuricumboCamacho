/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

import java.util.Date;

/**
 *
 * @author Rodrigo
 */
public class Usuarios {
    private int id;
    private String nombreUsuario, contrasena;
    private Date fechaAlta;
    private boolean estatus;

    public Usuarios(int id, String nombreUsuario, String contrasena, Date fechaAlta, boolean estatus) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.fechaAlta = fechaAlta;
        this.estatus = estatus;
    }

    public Usuarios() {
    }

    @Override
    public String toString() {
        return "Usuarios:" + "\nId= " + id + "\nnombreUsuario= " + nombreUsuario + "\nContrasena=" + contrasena + "\nFechaAlta= " + fechaAlta +"\nEstatus= " +estatus;
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

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }
    
}