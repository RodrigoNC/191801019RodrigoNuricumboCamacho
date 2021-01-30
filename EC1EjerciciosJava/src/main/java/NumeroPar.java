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
public class NumeroPar {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int numero;
        System.out.println("Número par");
        System.out.println("Inserta un valor: ");
        numero= scanner.nextInt();
        if(numero%2==0)
        {
            System.out.println("El número "+numero+" es par");
        }
        else
        {
            System.out.println("El número "+numero+" no es par");
        }
    }
}
