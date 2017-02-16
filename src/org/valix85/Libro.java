package org.valix85;

/**
 * Created by Valerio on 16/02/2017.
 */
public class Libro extends Oggetto {
    private String titolo = "";
    private String isbn = "";
    private String Autore = "";

    public Libro(String titolo, String isbn, String autore) {
        this.titolo = titolo;
        this.isbn = isbn;
        Autore = autore;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutore() {
        return Autore;
    }

    public void setAutore(String autore) {
        Autore = autore;
    }

    public String toString(){
        return this.titolo;
    }

    public String stampaTitoloISBN(){
        return this.getIsbn()+" - "+this.getTitolo();
    }
    @Override
    public String stampaID(){
        return stampaTitoloISBN();
    }
}
