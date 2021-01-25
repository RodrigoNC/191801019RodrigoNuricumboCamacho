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
public class Taqueria {
    public static void main(String args[]){
        Scanner cantidad= new Scanner(System.in);
        int tacos= 17, refrescos=10, cantidadTacos, cantidadRefrescos, total;
        System.out.println("Taquería de Doña Pelos");
        System.out.println("Indica la cantidad de tacos que consumió: ");
        cantidadTacos= cantidad.nextInt();
        System.out.println("Indica la cantidad de refrescos que solicitó: ");
        cantidadRefrescos= cantidad.nextInt();
        total= (cantidadTacos*tacos)+(cantidadRefrescos*refrescos);
        System.out.println("El total a pagar es de "+total+" pesos");
    }
}
