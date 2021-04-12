/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

import Proyecto.Conexion;
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
public class DaEmpleados {
    private static String SQL = "jdbc:mysql://localhost:3306/proyecto?zeroDateTimeBehavior=CONVERT_TO_NULL";
    public static List <Empleado> listaempleados() throws SQLException{
        List <Empleado> listaEmpleado = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion= conexion.createStatement();
        SQL = "SELECT * FROM empleado";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            Empleado empleado = new Empleado(resultado.getString("Cargo"), resultado.getInt("Sueldo"), resultado.getString("Turno"), resultado.getString("Nombre"), resultado.getString("Apellido_Paterno"), resultado.getString("Apellido_Materno"), resultado.getString("Género"), resultado.getInt("Edad"), resultado.getInt("RFC"));
            listaEmpleado.add(empleado);
        }
        Conexion.Close(conexion, declaracion, resultado);
        return listaEmpleado;
    }
    public static void insertar(Empleado empleado) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO empleado(Nombre, Apellido_Paterno, Apellido_Materno, Género, Edad, Sueldo, Cargo, Turno)VALUES(?,?,?,?,?,?,?,?)";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setString(1, empleado.getNombre());
        declaracion.setString(2, empleado.getApellidoPaterno());
        declaracion.setString(3, empleado.getApellidoMaterno());
        declaracion.setString(4, empleado.getGenero());
        declaracion.setInt(5, empleado.getEdad());
        declaracion.setInt(6, empleado.getSueldo());
        declaracion.setString(7, empleado.getCargo());
        declaracion.setString(8, empleado.getTurno());
        declaracion.executeUpdate();
        Conexion.Close(conexion, declaracion);
    }
    
    public static void eliminar(Empleado empleado) throws SQLException{
         Connection conexion = Conexion.getConnection();
         SQL= "DELETE FROM empleado WHERE RFC = ?";
         PreparedStatement declaracion= conexion.prepareStatement(SQL); 
         declaracion.setInt(1, empleado.getRfc());
         declaracion.executeUpdate();
         Conexion.Close(conexion, declaracion);
    }
    
    public static void modificar(Empleado empleado) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL= "UPDATE empleado SET Nombre= ?, Apellido_Paterno= ?, Apellido_Materno= ?, Género= ?, Edad= ?, Sueldo= ?, Cargo= ?, Turno= ? WHERE RFC = ?";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setString(1, empleado.getNombre());
        declaracion.setString(2, empleado.getApellidoPaterno());
        declaracion.setString(3, empleado.getApellidoMaterno());
        declaracion.setString(4, empleado.getGenero());
        declaracion.setInt(5, empleado.getEdad());
        declaracion.setInt(6, empleado.getSueldo());
        declaracion.setString(7, empleado.getCargo());
        declaracion.setString(8, empleado.getTurno());
        declaracion.setInt(9, empleado.getRfc());
        declaracion.executeUpdate();
        Conexion.Close(conexion, declaracion);
    }
    
}
