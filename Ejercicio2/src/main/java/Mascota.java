/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rodrigo
 */
public class Mascota extends Animal{
    private String foto, comida, tamanio;

    public Mascota(String foto, String comida, String tamanio, String localización) {
        super(localización);
        this.foto = foto;
        this.comida = comida;
        this.tamanio = tamanio;
    }

    public Mascota() {
    }

    @Override
    public String toString() {
        return "Mascota{" + "foto=" + foto + ", comida=" + comida + ", tamanio=" + tamanio + '}';
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    public String hacerRuido(){
        String texto= "";
        return texto;
    }
}
