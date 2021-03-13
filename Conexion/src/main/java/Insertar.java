
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Insertar {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexión con base de datos
            Connection conexion= DriverManager.getConnection(url, "root", "");
            //Crear una declaración para la base de datos
            String SQL= "INSERT INTO usuarios(nombre_usuario, contraseña, estatus)VALUES(?,?,?)";
            PreparedStatement declaracion= conexion.prepareStatement(SQL);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre del usuario: ");
            String nombre= scanner.nextLine();
            System.out.println("Ingrese la contraseña del usuario: ");
            String contrasena= scanner.nextLine();
            System.out.println("Ingrese el estatus del usuario (1= activo, 0= inactivo): ");
            int status= scanner.nextInt();
            declaracion.setString(1, nombre);
            declaracion.setString(2, contrasena);
            declaracion.setInt(3, status);
            //Variable que recibirá el resultado de ejecutar la secuencia SQL 
            declaracion.executeUpdate();
            //Insertar valores
            
            //Cerrar toda conexión con la base de datos
            declaracion.close();
            conexion.close();
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }

    private static void While(boolean next) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
