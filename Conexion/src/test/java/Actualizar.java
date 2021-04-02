
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
public class Actualizar {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexión con base de datos
            Connection conexion= DriverManager.getConnection(url, "root", "");
            //Crear una declaración para la base de datos
            String SQL= "UPDATE usuarios SET nombre_usuario= ?, contraseña= ?, estatus= ? WHERE id = ?";
            PreparedStatement declaracion= conexion.prepareStatement(SQL);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el id del usuario a actualizar: ");
            int id= scanner.nextInt();
            scanner.nextLine();
            System.out.println("Ingrese el nuevo nombre del usuario: ");
            String nombre= scanner.nextLine();
            System.out.println("Ingrese la nueva contraseña del usuario: ");
            String contrasena= scanner.nextLine();
            System.out.println("Ingrese el nuevo estatus del usuario (1= activo, 0= inactivo): ");
            int status= scanner.nextInt();
            declaracion.setString(1, nombre);
            declaracion.setString(2, contrasena);
            declaracion.setInt(3, status);
            declaracion.setInt(4, id); 
            declaracion.executeUpdate();
            System.out.println("Actualizado correctamente");
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
