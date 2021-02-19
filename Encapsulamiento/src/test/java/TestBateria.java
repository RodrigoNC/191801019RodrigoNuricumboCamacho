
import hardware.Bateria;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestBateria {
    public static void main(String[] args) {
        Bateria bateriaCelular= new Bateria(100);
        bateriaCelular.setPorcentaje(99);
        System.out.println(bateriaCelular);
    }
}
