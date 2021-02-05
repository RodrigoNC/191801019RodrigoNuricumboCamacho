/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestLuchador {
    public static void main(String[] args) {
        Luchador chico= new Luchador();
        chico.tipo= "chico";
        chico.edad= 20;
        chico.altura= 150;
        chico.flexibilidad= 25;
        chico.fuerza= 10;
        chico.motricidad= 60;
        chico.peso= 55;
        chico.rapidez= 70;
        chico.resistencia= 25;
        System.out.println(chico);
        
        Luchador mediano= new Luchador();
        mediano.tipo= "mediano";
        mediano.edad= 25;
        mediano.altura= 170;
        mediano.flexibilidad= 35.5;
        mediano.fuerza= 27.5;
        mediano.motricidad= 55.5;
        mediano.peso= 70;
        mediano.rapidez= 68.9;
        mediano.resistencia= 45;
        System.out.println(mediano);
        
        Luchador grande= new Luchador();
        grande.tipo= "grande";
        grande.edad= 30;
        grande.altura= 185;
        grande.flexibilidad= 30;
        grande.fuerza= 70;
        grande.motricidad= 30;
        grande.peso= 80;
        grande.rapidez= 40;
        grande.resistencia= 80;
        System.out.println(grande);
    }
}
