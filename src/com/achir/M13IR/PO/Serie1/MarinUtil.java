package com.achir.M13IR.PO.Serie1;

/**
 * Created by achir on 11/11/2016.
 */

import java.util.Arrays;

public class MarinUtil {

    public void augmenteSalaire(Marin[] marins, int pourcentage) {

        for (int i = 0 ; i < marins.length ; i++) {
            int nouveauSalaire = (marins[i].getSalaire()*(100 + pourcentage))/100 ;
            marins[i].setSalaire(nouveauSalaire) ;
        }
    }

    public int getMaxSalaire(Marin[] marins) {

        int maxSalaire = 0 ;
        for (int i = 0 ; i < marins.length ; i++) {
            if (marins[i].getSalaire() > maxSalaire) {
                maxSalaire = marins[i].getSalaire() ;
            }
        }
        return maxSalaire ;
    }

    public int getMoyenneSalaire(Marin[] marins) {
        int sommeSalaire = 0 ;
        for (int i = 0 ; i < marins.length ; i++) {
            sommeSalaire += marins[i].getSalaire() ;
        }
        return sommeSalaire / marins.length ;
    }

    public int getMedianeSalaire(Marin[] marins) {
        int[] salaires = new int[marins.length] ;
        for (int i = 0 ; i < marins.length ; i++) {
            salaires[i] = marins[i].getSalaire() ;
        }
        Arrays.sort(salaires) ;
        return salaires[salaires.length / 2] ;
    }
}

