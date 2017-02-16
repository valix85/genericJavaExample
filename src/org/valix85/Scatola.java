package org.valix85;

/**
 * Created by Valerio on 16/02/2017.
 */
public interface Scatola<K> {
    void metti( K ogg);
    K togli(int i);
    int numeroOggetti();
    void stampaContenuto();
}
