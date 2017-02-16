package org.valix85;

/**
 * Created by Valerio on 16/02/2017.
 */
public abstract class ScatolAstratta {

    private boolean lucchetto = false;

    public boolean isChiusa() {
        return lucchetto;
    }

    public void apriScatola(){this.lucchetto =false;};
    public void chiudScatola(){this.lucchetto =true;};



}
