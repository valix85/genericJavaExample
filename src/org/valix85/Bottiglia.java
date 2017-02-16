package org.valix85;

/**
 * Created by Valerio on 16/02/2017.
 */
public class Bottiglia extends Oggetto{
    String nome = "";
    String contenuto = "";
    String quantità = "";

    public Bottiglia(String nome, String contenuto, String quantità) {
        this.nome = nome;
        this.contenuto = contenuto;
        this.quantità = quantità;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContenuto() {
        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getQuantità() {
        return quantità;
    }

    public void setQuantità(String quantità) {
        this.quantità = quantità;
    }

    public String stampaID(){
        return "Sono una bottiglia";
    }
}
