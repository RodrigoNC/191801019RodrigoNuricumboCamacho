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
public class AreaParalelogramo {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int base, altura;
        System.out.println("Área de un paralelogramo");
        System.out.println("Inserte el valor de la base: ");
        base = scanner.nextInt();
        System.out.println("Inserte el valor de la altura: ");
        altura = scanner.nextInt();
        System.out.println("El area del paralelogramo es "+base*altura+ " cm^2");
    }
}
