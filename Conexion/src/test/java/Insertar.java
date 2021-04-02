import Conexion.Conexion;
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;
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
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del usuario: ");
        String nombre= scanner.nextLine();
        System.out.println("Ingrese la contraseña del usuario: ");
        String contrasena= scanner.nextLine();
        System.out.println("Ingrese el estatus del usuario (True= activo, False= inactivo): ");
        boolean status= scanner.nextBoolean();
        Usuarios usuario = new Usuarios(nombre, contrasena, status);
        DaoUsuarios.insertar(usuario);
    }
            /*//Crear conexión con base de datos
            //Connection conexion= DriverManager.getConnection(url, "root", "");
            Connection conexion = Conexion.getConnection();
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
            Conexion.Close(conexion, declaracion);
    }*/
}
