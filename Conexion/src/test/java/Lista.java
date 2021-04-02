
import DaoUsuarios.DaoUsuarios;
import Usuarios.Usuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Usuarios.Usuarios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Lista {
    public static void main(String[] args) throws SQLException{
        List <Usuarios> listaUsuarios = new ArrayList<>();
        listaUsuarios = DaoUsuarios.listausuarios();
        for (Usuarios usuario: listaUsuarios){
           System.out.println(usuario);
        }
}
            /*//Crear conexión con base de datos
            //Connection conexion= DriverManager.getConnection(url, "root", "");
            Connection conexion = Conexion.getConnection();
            //Crear una declaración para la base de datos
            Statement declaracion= conexion.createStatement();
            String SQL= "SELECT * FROM usuarios";
            //Variable que recibirá el resultado de ejecutar la secuencia SQL 
            ResultSet resultado = declaracion.executeQuery(SQL);
            //Imprimir valores
            while (resultado.next()){
            System.out.println(resultado.getString("id"));
            System.out.println(resultado.getString("nombre_usuario"));
            System.out.println(resultado.getString("contraseña"));
            System.out.println(resultado.getString("estatus"));
            System.out.println(resultado.getString("fecha_de_alta"));
        }
            //Cerrar toda conexión con la base de datos
            Conexion.Close(conexion, declaracion, resultado);
    }
*/
}
