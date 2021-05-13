/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Animal {
    private String localización;

    public Animal(String localización) {
        this.localización = localización;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" + "localización=" + localización + '}';
    }

    public String getLocalización() {
        return localización;
    }

    public void setLocalización(String localización) {
        this.localización = localización;
    }
    
    public String comer(){
        String texto= "";
        texto+= "El animal come";
        return texto;
    }
    
    public String dormir(){
        String texto= "";
        texto+= "El animal duerme";
        return texto;
    }
    
    public String respirar(){
        String texto= "";
        texto+= "El animal respira";
        return texto;
    }
}
