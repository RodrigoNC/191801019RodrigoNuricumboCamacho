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
public class UsuariosCorreos{
    private int idCorreo, idUsuario;
    private String contrasenaCorreo, nombreCorreo;
    private Date fechaRegistro;

    public UsuariosCorreos(int idCorreo, int idUsuario, String contrasenaCorreo, String nombreCorreo, Date fechaRegistro) {
        this.idCorreo = idCorreo;
        this.idUsuario = idUsuario;
        this.contrasenaCorreo = contrasenaCorreo;
        this.nombreCorreo = nombreCorreo;
        this.fechaRegistro = fechaRegistro;
    }

    public UsuariosCorreos() {
    }

    @Override
    public String toString() {
        return "Correos de usuarios: " + "\nId de correo=" + idCorreo + "\nId de usuario=" + idUsuario + "\nContrasena de correo=" + contrasenaCorreo + "\nNombre del correo=" + nombreCorreo + "\nFecha de registro=" + fechaRegistro;
    }

    public int getIdCorreo() {
        return idCorreo;
    }

    public void setIdCorreo(int idCorreo) {
        this.idCorreo = idCorreo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasenaCorreo() {
        return contrasenaCorreo;
    }

    public void setContrasenaCorreo(String contrasenaCorreo) {
        this.contrasenaCorreo = contrasenaCorreo;
    }

    public String getNombreCorreo() {
        return nombreCorreo;
    }

    public void setNombreCorreo(String nombreCorreo) {
        this.nombreCorreo = nombreCorreo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
}
