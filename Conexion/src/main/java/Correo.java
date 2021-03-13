
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Correo {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/usuarios?zeroDateTimeBehavior=CONVERT_TO_NULL";
        try{
            //Crear conexión con base de datos
            Connection conexion= DriverManager.getConnection(url, "root", "");
            //Crear una declaración para la base de datos
            Statement declaracion= conexion.createStatement();
            String SQL= "SELECT * FROM usuarios_correo";
            //Variable que recibirá el resultado de ejecutar la secuencia SQL 
            ResultSet resultado = declaracion.executeQuery(SQL);
            //Imprimir valores
            while (resultado.next()){
            System.out.println(resultado.getString("id"));
            System.out.println(resultado.getString("id_usuario"));
            System.out.println(resultado.getString("nombre_correo"));
            System.out.println(resultado.getString("contraseña"));
            System.out.println(resultado.getString("fecha_registro"));
        }
            //Cerrar toda conexión con la base de datos
            resultado.close();
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
