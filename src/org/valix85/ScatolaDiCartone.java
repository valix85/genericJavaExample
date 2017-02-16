package org.valix85;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Valerio on 16/02/2017.
 */
public class ScatolaDiCartone<T extends Oggetto> extends ScatolAstratta implements Scatola<T> {

    private List<T> sdc; //scatola di cartone container

    public ScatolaDiCartone(){
       sdc = new LinkedList<T>();
    }

    @Override
    public void metti(T ogg ){
        sdc.add(ogg);
    }

    @Override
    public T togli(int i){
        return sdc.get(i);
    }
    @Override
    public int numeroOggetti(){
        return sdc.size();
    }

    public void stampaContenuto(){
        Iterator<T> i = sdc.iterator();
        while(i.hasNext()){
            T s = i.next();
            System.out.println(s.stampaID());
        }
    }


}
