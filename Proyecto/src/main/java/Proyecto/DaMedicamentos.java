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
public class DaMedicamentos {
    private static String SQL = "jdbc:mysql://localhost:3306/proyecto?zeroDateTimeBehavior=CONVERT_TO_NULL";
    public static List <Medicamento> listaMedicamentos() throws SQLException{
        List <Medicamento> listaMedicamento = new ArrayList<>();
        Connection conexion = Conexion.getConnection();
        Statement declaracion= conexion.createStatement();
        SQL = "SELECT * FROM medicamento";
        ResultSet resultado = declaracion.executeQuery(SQL);
        while (resultado.next()){
            Medicamento medicamento = new Medicamento(resultado.getString("Nombre"), resultado.getString("Tipo"), resultado.getString("Fecha_Caducidad"), resultado.getInt("Volumen"), resultado.getInt("Clave"));
            listaMedicamento.add(medicamento);
        }
        Conexion.Close(conexion, declaracion, resultado);
        return listaMedicamento;
    }
    public static void insertar(Medicamento medicamento) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL = "INSERT INTO medicamento(Nombre, Tipo, Volumen, Fecha_Caducidad)VALUES(?,?,?,?)";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setString(1, medicamento.getNombreMedicamento());
        declaracion.setString(2, medicamento.getTipo());
        declaracion.setInt(3, medicamento.getVolumen());
        declaracion.setString(4, medicamento.getFechaCaducidad());
        declaracion.executeUpdate();
        Conexion.Close(conexion, declaracion);
    }
    
    public static void eliminar(Medicamento medicamento) throws SQLException{
         Connection conexion = Conexion.getConnection();
         SQL= "DELETE FROM medicamento WHERE Clave = ?";
         PreparedStatement declaracion= conexion.prepareStatement(SQL); 
         declaracion.setInt(1, medicamento.getClave());
         declaracion.executeUpdate();
         Conexion.Close(conexion, declaracion);
    }
    
    public static void modificar(Medicamento medicamento) throws SQLException{
        Connection conexion = Conexion.getConnection();
        SQL= "UPDATE medicamento SET Nombre= ?, Tipo= ?, Volumen= ?, Fecha_Caducidad= ? WHERE Clave = ?";
        PreparedStatement declaracion= conexion.prepareStatement(SQL);
        declaracion.setString(1, medicamento.getNombreMedicamento());
        declaracion.setString(2, medicamento.getTipo());
        declaracion.setInt(3, medicamento.getVolumen());
        declaracion.setString(4, medicamento.getFechaCaducidad());
        declaracion.setInt(5, medicamento.getClave());
        declaracion.executeUpdate();
        Conexion.Close(conexion, declaracion);
    }
}
