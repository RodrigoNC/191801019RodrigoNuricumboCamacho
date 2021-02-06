/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestMateria {
    public static void main(String[] args) {
        Materia fuPoo= new Materia("Fundamentos de POO", "Ing. en Tecnologías de la Información", 50, 7, 5);
        System.out.println(fuPoo);
        System.out.println("\n");
        Materia baseDeDatos= new Materia("Base de datos", "Ing. en Tecnologías de la Información", 30, 4, 5);
        System.out.println(baseDeDatos);
        System.out.println("\n");
        Materia escalamientoDeRedes= new Materia("Escalamiento de redes", "Ing. en Tecnologías de la Información", 70, 6, 5);
        System.out.println(escalamientoDeRedes);
    }
}
