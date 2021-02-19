/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestAk {
    public static void main(String[] args) {
        //Crear un objeto(Instanciar una clase)
        Ak cobre= new Ak();
        cobre.material= "cobre";
        cobre.disponibilidad= "alta";
        cobre.municion= 5;
        cobre.precio= 10;
        cobre.velocidadDisparo= 10.5;
        cobre.danio= 5;
        cobre.precision= 4;
        System.out.println(cobre);
        Ak diamante= new Ak();
        diamante.material= "diamante";
        diamante.disponibilidad= "baja";
        diamante.municion= 20;
        diamante.precio= 12000;
        diamante.velocidadDisparo= 13;
        diamante.danio= 15;
        System.out.println(diamante);
    }
}
