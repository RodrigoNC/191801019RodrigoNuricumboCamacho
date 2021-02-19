
import hardware.RAM;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestRAM {
    public static void main(String[] args) {
        RAM memoria1= new RAM();
        memoria1.getMemoria();
        memoria1.getMarca();
        memoria1.getVelocidad();
        memoria1.setMemoria(16);
        memoria1.setMarca("NVIDIA");
        memoria1.setVelocidad(8);
        System.out.println(memoria1);
    }
}
