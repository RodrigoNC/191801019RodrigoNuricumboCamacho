/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Info;

/**
 *
 * @author Rodrigo
 */
public class Instituto {
    private String materia;
    private int creditos, nota, matricula;
    
    public Instituto(int matricula, String materia, int creditos, int nota){
        this.creditos=creditos;
        this.materia=materia;
        this.matricula=matricula;
        this.nota=nota;
    }
    
    public Instituto(){
        this.creditos=0;
        this.materia="";
        this.matricula=0;
        this.nota=0;
    }
    
    public String getMateria(){
        return this.materia;
    }
    
    public void setMateria(String materia){
        this.materia=materia;
    }
    
    public int getMatricula(){
        return this.matricula;
    }
    
    public void setMatricula(int matricula){
        this.matricula=matricula;
    }
    
    public int getCreditos(){
        return this.creditos;
    }
    
    public void setCreditos(int creditos){
        this.creditos=creditos;
    }
    
    public int getNota(){
        return this.nota;
    }
    
    public void setNota(int nota){
        this.nota=nota;
    }
    
    @Override
    public String toString(){
        return "\nMatrícula: "+matricula+"\nMateria: "+materia+"\nCréditos: "+creditos+"\nNota: "+nota;
    }
}
