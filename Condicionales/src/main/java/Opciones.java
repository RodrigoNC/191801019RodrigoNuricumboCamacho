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
public class Opciones {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Dame el primer valor: ");
        numero1= scanner.nextInt();
        System.out.println("Dame el segundo valor: ");
        numero2= scanner.nextInt();
        System.out.println("Opción 1: Suma\n Opción 2: Resta");
        int opcion= scanner.nextInt();
        switch(opcion)
        {
            case 1:
                System.out.println(numero1+numero2);
            break;
            case 2:
                System.out.println(numero1-numero2);
            break;
            default:
                System.out.println("No existe esta opción");
            break;
        }
    }
}
