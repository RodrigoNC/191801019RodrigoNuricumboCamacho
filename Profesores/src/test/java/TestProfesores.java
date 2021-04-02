/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class TestProfesores {
    public static void main(String[] args) {
        Profesores profesor1= new Profesores();
        profesor1.setNombre("Javier");
        profesor1.setId(18);
        profesor1.setGradoEscolar("Doctorado");
        profesor1.setTitulado(true);
        System.out.println(profesor1);
    }
}
