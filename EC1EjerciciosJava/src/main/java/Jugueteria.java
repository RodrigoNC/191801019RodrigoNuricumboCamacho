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
public class Jugueteria {
    public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
     int pesoPayasos=112, numeroPayasos, pesoMunecas= 75, numeroMunecas;
     System.out.println("Juguetería");
     System.out.println("Peso de payasos: "+pesoPayasos+ " gramos");
     System.out.println("Peso de muñecas: "+pesoMunecas+ " gramos");
     System.out.println("Inserta la cantidad de payasos a pedir: ");
     numeroPayasos= scanner.nextInt();
     System.out.println("Inserta la cantidad de muñecas a pedir: ");
     numeroMunecas= scanner.nextInt();
     int pesoTotal= (numeroPayasos*pesoPayasos)+(numeroMunecas*pesoMunecas);
     System.out.println("El peso total del envío es de "+pesoTotal+" gramos");
    }
}
