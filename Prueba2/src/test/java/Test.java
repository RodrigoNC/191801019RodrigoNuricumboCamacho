
import Info.Instituto;
import Info.Persona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Test {
    public static void main(String[] args) {
        Instituto instituto1= new Instituto();
        instituto1.setCreditos(100);
        instituto1.setMateria("Redes");
        instituto1.setMatricula(1999);
        instituto1.setNota(10);
        Persona persona1= new Persona();
        persona1.setNombre("María");
        persona1.setApellidoPaterno("Clément");
        persona1.setApellidoMaterno("Vázquez");
        persona1.setEdad(21);
        persona1.setSexo("Femenino");
        Persona persona2= new Persona(persona1.getNombre(), persona1.getApellidoPaterno(), persona1.getApellidoMaterno(), persona1.getEdad(), persona1.getSexo(), instituto1);
        System.out.println(persona2);
    }
}
