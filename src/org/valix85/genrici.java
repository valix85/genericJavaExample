package org.valix85;

/**
 * Created by Valerio on 16/02/2017.
 */
public class genrici {
    public static void main(String args[]){
        Scatola<Oggetto> sdc = new ScatolaDiCartone<>();

        sdc.metti(new Libro("JAVA 8, che palle i generics", "84735345", "OpenStyle"));
        sdc.metti(new Libro("JAVA 7, arrivano i generics!", "65156516", "OpenStyle"));
        sdc.metti(new Libro("Crypto", "8966625", "Dan Brown"));

        sdc.metti(new Bottiglia("Levissima","acqua","piena"));

        sdc.stampaContenuto();

    }
}
