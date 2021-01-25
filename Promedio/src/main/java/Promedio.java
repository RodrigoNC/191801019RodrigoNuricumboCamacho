/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
import java.util.Scanner;
public class Promedio {
    public static void main(String args[]){
        Scanner valor= new Scanner(System.in);
        double valor1, valor2, valor3, promedio;
        System.out.println("Inserta la primera calificación: ");
        valor1= valor.nextInt();
        System.out.println("Inserta la segunda calificación: ");
        valor2= valor.nextInt();
        System.out.println("Inserta la tercera calificación: ");
        valor3= valor.nextInt();
        promedio= (valor1+valor2+valor3)/3;
        System.out.println("El promedio de las 3 materias es de "+promedio);
    }
}
