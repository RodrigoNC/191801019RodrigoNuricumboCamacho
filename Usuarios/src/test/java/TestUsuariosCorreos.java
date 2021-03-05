
import Usuarios.UsuariosCorreos;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestUsuariosCorreos {
    public static void main(String[] args) {
        Date fecha= new Date();
        UsuariosCorreos correo= new UsuariosCorreos(1, 1, "191801019", "rodrigo.nuricumbo1819@uppuebla.edu.mx", fecha);
        System.out.println(correo);
    }
}
