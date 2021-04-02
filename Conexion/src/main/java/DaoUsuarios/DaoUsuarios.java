/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoUsuarios;

import Conexion.Conexion;
import Usuarios.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rodrigo
 */
public class DaoUsuarios {
    private static String SQL = "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
    public static List <Usuarios> listausuarios() throws SQLException{
        List <Usuarios> listaUsuarios = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion= conexion.createStatement();
        SQL = "SELECT * FROM usuarios";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            Usuarios usuario = new Usuarios(resultado.getInt("id"), resultado.getString("nombre_usuario"), resultado.getString("contraseña"), resultado.getString("fecha_de_alta"), resultado.getBoolean("estatus"));
            listaUsuarios.add(usuario);
        }
        Conexion.Close(conexion, declaracion, resultado);
        return listaUsuarios;
    }
    public static void insertar(Usuarios usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO usuarios(nombre_usuario, contraseña, estatus)VALUES(?,?,?)";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setString(1, usuario.getNombreUsuario());
        declaracion.setString(2, usuario.getContrasena());
        declaracion.setBoolean(3, usuario.isEstatus());
        declaracion.executeUpdate();
        Conexion.Close(conexion, declaracion);
    }
    
    public static void eliminar(Usuarios usuario) throws SQLException{
         Connection conexion = Conexion.getConnection();
         SQL= "DELETE FROM usuarios WHERE id = ?";
         PreparedStatement declaracion= conexion.prepareStatement(SQL);
         declaracion.setInt(1, usuario.getId()); 
         declaracion.executeUpdate();
         Conexion.Close(conexion, declaracion);
    }
    
    public static void modificar(Usuarios usuario) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL= "UPDATE usuarios SET nombre_usuario= ?, contraseña= ?, estatus= ? WHERE id = ?";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setString(1, usuario.getNombreUsuario());
        declaracion.setString(2, usuario.getContrasena());
        declaracion.setBoolean(3, usuario.isEstatus());
        declaracion.setInt(4, usuario.getId()); 
        declaracion.executeUpdate();
        Conexion.Close(conexion, declaracion);
    }
}
