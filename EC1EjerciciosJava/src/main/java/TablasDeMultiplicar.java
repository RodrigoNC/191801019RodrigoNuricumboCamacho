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
public class TablasDeMultiplicar {
    public static void main(String args[]){
      Scanner scanner= new Scanner(System.in);
      int numero, contador=1;
      System.out.println("Tablas de multiplicar");
      System.out.println("Inserta un número para calcular su tabla de multiplicar: ");
      numero= scanner.nextInt();
      System.out.println("La tabla del "+numero+" es la siguiente: ");
      for(contador=1; contador<=10; contador++){
          System.out.println(" "+numero+" x "+contador+" = "+(numero*contador));
      }
    }
}
