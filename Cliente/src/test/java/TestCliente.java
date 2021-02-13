
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
public class TestCliente {
    public static void main(String[] args) {
        Coche coche= new Coche("Chrysler", "Rojo", 2, 450.5, "Chico");
        Cliente cliente= new Cliente(1, 58, "Elías", coche);
        System.out.println(cliente);
    }
}
