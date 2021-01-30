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
public class Binario {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        int vector[]= new int [10];
        int valor, contador1=0, contador2=0;
        System.out.println("Binario: Convertir valores de decimal a binario");
        do{
            System.out.println("Inserta el valor a convertir: ");
            valor= scanner.nextInt();
        }
        while(valor<0);
        if(valor==0){
            System.out.println("El valor en binario es "+valor);
        }
        else{
            while(valor!=0){
                vector[contador1]= valor%2;
                valor/=2;
                contador1++;
                contador2+=1;
            }
            System.out.print("El valor en binario es ");
            for(contador1=contador2-1; contador1>=0; contador1--){
                System.out.print(""+vector[contador1]);
            }
        }
    }
}
