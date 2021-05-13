
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner= new Scanner (System.in);
        Scanner scan = new Scanner (System.in);
        int op=0;
        Biblioteca biblioteca = new Biblioteca("12 Norte");
        System.out.println(biblioteca);
        do{
            System.out.println("Inserta una opción:\n1-Agregar libro\n2-Agregar lector\n3-Salir\n");
            op= scan.nextInt();
            switch(op){
                case 1:
                    System.out.println("Inserta el nombre del libro: \n");
                    String nombre = scanner.nextLine();
                    System.out.println("Inserta el tipo de libro: \n");
                    String tipo = scanner.nextLine();
                    System.out.println("Inserta la editorial del libro: \n");
                    String editorial = scanner.nextLine();
                    System.out.println("Inserta el año del libro: \n");
                    int anio = scan.nextInt();
                    System.out.println("Inserta el nombre del autor: \n");
                    String nombreAutor = scanner.nextLine();
                    System.out.println("Inserta la nacionalidad del autor: \n");
                    String nacionalidad = scanner.nextLine();
                    System.out.println("Inserta la fecha de nacimiento del autor: \n");
                    String nacimiento = scanner.nextLine();
                    DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
                    Date fecha = format.parse(nacimiento);
                    Autores autor = new Autores(nombreAutor, nacionalidad, fecha);
                    Libros libro = new Libros(nombre, tipo, editorial, anio, Autores autor: autor);
                    biblioteca.agregarLibro(libro);
                    break;
                case 2:
                    System.out.println(biblioteca.imprimirLibro());
            }
        }
        while(op!=3);
    }
}
