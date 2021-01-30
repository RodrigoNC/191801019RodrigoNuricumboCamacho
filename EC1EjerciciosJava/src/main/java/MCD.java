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
public class MCD {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int numero1, numero2;
        System.out.println("MCD: Máximo común divisor");
        System.out.println("Inserta el primer número: ");
        numero1= scanner.nextInt();
        do{
            System.out.println("Inserta el segundo valor: ");
            numero2= scanner.nextInt();
        }
        while(numero2==numero1);
        while(numero1!=numero2){
            if(numero1>numero2)
            {
                numero1-=numero2;
            }
            else
            {
                numero2-=numero1;
            }
        }
        System.out.println("El MCD es "+numero1);
    }
}
