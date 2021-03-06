package com.achir.M13IR.PO.Serie1;

/**
 * Created by achir on 11/11/2016.
 */

public class MainExo2 {

    public static void main(String... args) {

        Marin marin1 = new Marin("Barbarossa", "Aruj", 1000) ;
        Marin marin2 = new Marin("Barbarossa", "Khayr ad-Din ", 1200) ;
        Marin marin3 = new Marin("Dansa", "Simon", 800) ;
        Marin marin4 = new Marin("Salomo", "De Veenboer", 1500) ;
        Marin marin5 = new Marin("Ward", "John", 1100) ;

        Marin[] marins = {marin1, marin2, marin3, marin4, marin5} ;

        MarinUtil marinUtil = new MarinUtil() ;
        marinUtil.augmenteSalaire(marins, 10) ;

        System.out.println("Salaire max = " + marinUtil.getMaxSalaire(marins)) ;
        System.out.println("Salaire moyen = " + marinUtil.getMoyenneSalaire(marins)) ;
        System.out.println("Salaire médian = " + marinUtil.getMedianeSalaire(marins)) ;
    }
}

