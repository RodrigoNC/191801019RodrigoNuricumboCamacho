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
public class SiEntonces {
    public static void main(String args[]){
       Scanner scanner= new Scanner(System.in);
       int numero;
       System.out.println("Da un valor para determinar si es positivo o negativo: ");
       numero= scanner.nextInt();
       if(numero>0)
       {
           System.out.println("El valor es positivo");
       }
       else if(numero<0)
       {
           System.out.println("El valor es negativo");
       }
       else
       {
           System.out.println("El valor es neutro");
       }
    }
}
