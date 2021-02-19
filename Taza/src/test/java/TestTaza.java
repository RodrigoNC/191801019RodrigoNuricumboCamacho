/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestTaza {
    public static void main(String[] args) {
        Taza roja= new Taza();
        roja.color= "rojo";
        roja.material="plástico";
        roja.modelo="navideño 2020";
        roja.precio= 350.90;
        roja.tamano= "mediano";
        System.out.println(roja);
        
        Taza naranja= new Taza("naranja", 119.50, "industrial", "grande", "plata");
        System.out.println(naranja);
}
}