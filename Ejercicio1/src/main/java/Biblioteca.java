
import java.util.ArrayList;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Biblioteca {
    private ArrayList<Libros> libros = new ArrayList();
    private ArrayList<Lector> lectores = new ArrayList();
    private String nombre;

    public Biblioteca(String nombre) {
        this.nombre=nombre;
        this.libros=libros;
        this.lectores=lectores;
    }
    
    public Biblioteca() {
        this.nombre="";
        this.libros=null;
        this.lectores=null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    public ArrayList<Lector> getLectores() {
        return lectores;
    }

    public void setLectores(ArrayList<Lector> lectores) {
        this.lectores = lectores;
    }
    
    public void agregarLibro(Libros libro){
        libros.add(libro);
    }
    
    public String imprimirLibro(){
        String texto = "";
        for (Libros libro: libros){
            texto+=libro.getNombre()+"\n";
            texto+=libro.getTipo()+"\n";
            texto+=libro.getEditorial()+"\n";
            texto+=libro.getAnio()+"\n";
        }
        return texto;
    }
}
