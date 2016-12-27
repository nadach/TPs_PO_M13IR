package com.achir.M13IR.PO.Serie4;

import com.achir.M13IR.PO.Serie1.Marin;
import java.util.Comparator;

/**
 * Created by achir on 27/12/2016.
 */
public class MarinComparator implements Comparator<Marin> {

    @Override
    public int compare(Marin o1, Marin o2) {
        if(o1.getNom().equals(o2.getNom())){
            return o1.getPrenom().compareTo(o2.getPrenom());
        }
        else{
            return o1.getNom().compareTo(o2.getNom());
        }
    }
}
