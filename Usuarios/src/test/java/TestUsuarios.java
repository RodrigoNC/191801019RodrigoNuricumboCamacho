
import Usuarios.Usuarios;
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
public class TestUsuarios {
    public static void main(String[] args) {
        Date fecha= new Date();
        Usuarios usuario= new Usuarios (1, "Rodrigo Nuricumbo Camacho", "191801019", fecha);
        System.out.println(usuario);
    }
}
