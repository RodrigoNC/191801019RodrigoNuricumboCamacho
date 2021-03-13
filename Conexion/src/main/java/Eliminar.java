
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
public class Eliminar {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexión con base de datos
            Connection conexion= DriverManager.getConnection(url, "root", "");
            //Crear una declaración para la base de datos
            String SQL= "DELETE FROM usuarios WHERE id = ?";
            PreparedStatement declaracion= conexion.prepareStatement(SQL);
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el id del usuario a eliminar: ");
            int id= scanner.nextInt();
            scanner.nextLine();
            declaracion.setInt(1, id); 
            declaracion.executeUpdate();
            System.out.println("Eliminado con éxito");
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
