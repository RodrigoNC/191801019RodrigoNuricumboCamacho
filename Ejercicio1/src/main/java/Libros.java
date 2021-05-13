
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Libros {
   private String nombre, tipo, editorial, identificador;
   private int anio;
   private ArrayList <Autores> autores = new ArrayList();

    public Libros(String nombre, String tipo, String editorial, int anio, ArrayList <Autores> autores) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.editorial = editorial;
        this.identificador=identificador;
        this.anio = anio;
        this.autores=autores;
    }

    public Libros() {
    }

    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + ", tipo=" + tipo + ", editorial=" + editorial + ", identificador=" + identificador + ", anio=" + anio + ", autores=" + autores + '}';
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public ArrayList <Autores> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList <Autores> autores) {
        this.autores = autores;
    }
}
