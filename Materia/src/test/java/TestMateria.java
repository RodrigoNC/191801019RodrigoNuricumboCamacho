
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
public class TestMateria {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Scanner scan= new Scanner(System.in);
        System.out.println("Llena los siguientes datos de la materia: ");
        System.out.println("Inserta el nombre de la materia: ");
        String nombreMateria= scanner.nextLine();
        System.out.println("Inserta el nombre de la carrera: ");
        String carreraMateria= scanner.nextLine();
        System.out.println("Inserta el número de créditos: ");
        int creditosMateria= scan.nextInt();
        System.out.println("Inserta el código de la materia: ");
        int codigoMateria= scan.nextInt();
        System.out.println("Inserta el cuatrimestre de la materia: ");
        int cuatrimestreMateria= scan.nextInt();
        Materia materias= new Materia(nombreMateria, carreraMateria, creditosMateria, codigoMateria, cuatrimestreMateria);
        System.out.println(materias);
        System.out.println("\n");
        
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