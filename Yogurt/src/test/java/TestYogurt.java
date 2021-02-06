
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestYogurt {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Yogurts");
        System.out.println("Inserta el nombre del producto: ");
        String nombre= scanner.nextLine();
        System.out.println("Inserta el nombre de la marca: ");
        String marca= scanner.nextLine();
        System.out.println("Indica el sabor del producto: ");
        String sabor= scanner.nextLine();
        System.out.println("Inserta el código del producto: ");
        int codigo= scanner.nextInt();
        System.out.println("Inserta el precio del producto: ");
        double precio= scanner.nextDouble();
        System.out.println("Inserta la cantidad de existencias del producto: ");
        int cantidad= scanner.nextInt();
        Yogurt yogurtUsuario= new Yogurt(nombre, marca, cantidad, codigo, sabor, precio);
        System.out.println(yogurtUsuario);
        System.out.println("\n");
        
        Yogurt fresa= new Yogurt("Yogurt de fresa", "Griego", 30, 426, "Fresa", 15);
        System.out.println(fresa);
        System.out.println("\n");
        
        Yogurt pina= new Yogurt("Piña & coco", "Lala", 45, 319, "Piña coco", 12.5);
        System.out.println(pina);
        System.out.println("\n");
        
        Yogurt frambuesa= new Yogurt("Raspberry original", "Light & Fit", 10, 204, "Frambuesa", 18.7);
        System.out.println(frambuesa);
        System.out.println("\n");
        
        Yogurt manzana= new Yogurt("Manzana con tipo Yogurt", "Heinz", 35, 781, "Manzana", 12.3);
        System.out.println(manzana);
        System.out.println("\n");
        
        Yogurt durazno= new Yogurt("Yoghurt con durzano", "Yoplait", 60, 602, "Durazno", 14.6);
        System.out.println(durazno);
        System.out.println("\n");
        
        Yogurt natural= new Yogurt("Yogurt natural sin azúcar", "Danone", 40, 113, "Natural", 10);
        System.out.println(natural);
        System.out.println("\n");
    }
}
