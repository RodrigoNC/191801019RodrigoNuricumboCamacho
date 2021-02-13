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
public class TestCine {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        Scanner scan= new Scanner(System.in);
        int opcion=0;
        int hora=0;
        Cine cine= new Cine("Cinepolis", 9, 21);
        System.out.println(cine);
        do{
            System.out.println("¿Quieres agregar una película? ");
            System.out.println("1-Sí\n2-No");
            opcion= scan.nextInt();
            if(opcion==1){
                System.out.println("Inserta el título de la película: ");
                String titulo= scanner.nextLine();
                Pelicula nuevaPelicula= new Pelicula(titulo);
                cine.agregarPelicula(nuevaPelicula);
                cine.peliculas.size();
            }
            else{
                System.out.println("Terminado");
                System.out.println("\n");
            }
        }
        while(opcion!=2);
        System.out.println("Da una hora en formato de 24 hrs: ");
        hora= scan.nextInt();
        System.out.println(cine.imprimirPeliculas());
        System.out.println(cine.menu());
        System.out.println("La cantidad de películas es "+cine.cantidadPeliculas());
        System.out.println("¿El cine está abierto? "+cine.cineAbierto(hora));
    }
}
