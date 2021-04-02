/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Rodrigo
 */
public class Conexion {
    //static es una palabra reservada que determina que el atributo es de la clase y no del objeto.
    //final es un modificador que indica que el atributo es una constante por lo que no se le podrá cambiar el valor de ningún modo
    private static final String URL= "jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USUARIO= "root", CONTRASENA= "";
    public static Connection getConnection()throws SQLException{
        return DriverManager.getConnection(Conexion.URL, Conexion.USUARIO, Conexion.CONTRASENA);
        //throws SQLException es el try y el catch implementado en un método
    }
    //Polimorfismo
    public static void close(Connection conexion) throws SQLException{
        conexion.close();
    }
    public static void close(Statement declaracion) throws SQLException{
        declaracion.close();
    }
    public static void close(ResultSet resultado) throws SQLException{
        resultado.close();
    }
    public static void Close(Connection conexion, Statement declaracion, ResultSet resultado)throws SQLException{
        resultado.close();
        declaracion.close();
        conexion.close();
    }
    public static void Close(Statement declaracion, ResultSet resultado)throws SQLException{
        resultado.close();
        declaracion.close();
    }
    public static void Close(Connection conexion, Statement declaracion)throws SQLException{
        conexion.close();
        declaracion.close();
    }
}
