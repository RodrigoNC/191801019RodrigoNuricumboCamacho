/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Proyecto.Registro;

/**
 *
 * @author Rodrigo
 */
public class DaRegistro {
        private static String SQL = "jdbc:mysql://localhost:3306/proyecto?zeroDateTimeBehavior=CONVERT_TO_NULL";
    public static List <Registro> listaRegistro() throws SQLException{
        List <Registro> listaRegistro = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion= conexion.createStatement();
        SQL = "SELECT * FROM registro";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            Registro registro = new Registro(resultado.getInt("RFC"), resultado.getInt("Clave"));
            listaRegistro.add(registro);
        }
        Conexion.Close(conexion, declaracion, resultado);
        return listaRegistro;
    }
    
    public static void insertar(Registro registro) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO registro(RFC, Clave)VALUES(?,?)";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setInt(1, registro.getRFC());
        declaracion.setInt(2, registro.getClave());
        declaracion.executeUpdate();
        Conexion.Close(conexion, declaracion);
    }
    
    public static void eliminar(Registro registro) throws SQLException{
         Connection conexion = Conexion.getConnection();
         SQL= "DELETE FROM registro WHERE RFC = ?";
         PreparedStatement declaracion= conexion.prepareStatement(SQL); 
         declaracion.setInt(1, registro.getRFC());
         declaracion.executeUpdate();
         Conexion.Close(conexion, declaracion);
    }
}
