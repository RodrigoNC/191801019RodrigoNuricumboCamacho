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

    public Usuarios(int id, String nombreUsuario, String contrasena, Date fechaAlta) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.fechaAlta = fechaAlta;
    }

    public Usuarios() {
    }

    @Override
    public String toString() {
        return "Usuarios:" + "\nId= " + id + "\nnombreUsuario= " + nombreUsuario + "\nContrasena=" + contrasena + "\nFechaAlta= " + fechaAlta;
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
    
}