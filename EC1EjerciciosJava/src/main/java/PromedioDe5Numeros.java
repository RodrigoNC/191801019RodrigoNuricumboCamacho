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
public class PromedioDe5Numeros {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int vector[] = new int[5];
        int contador=0;
        double promedio=0.0;
        System.out.println("Promedio de 5 valores");
        while(contador<5){
            System.out.println("Inserte el valor "+(contador+1));
            vector[contador]= scanner.nextInt();
            promedio+= vector[contador];
            contador++;
        }
        System.out.println("El promedio de los 5 valores insertados es de "+(promedio/5));
    }
}
