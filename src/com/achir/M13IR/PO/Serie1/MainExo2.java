package com.achir.M13IR.PO.Serie1;

/**
 * Created by achir on 11/11/2016.
 */

public class MainExo2 {

    public static void main(String... args) {

        Marin marin1 = new Marin("Tabarly", "Eric", 1000) ;
        Marin marin2 = new Marin("Artaud", "Florence", 1200) ;
        Marin marin3 = new Marin("Lamazou", "Titouan", 800) ;
        Marin marin4 = new Marin("Poupon", "Philippe", 1500) ;
        Marin marin5 = new Marin("Colas", "Alain", 1100) ;

        Marin[] marins = {marin1, marin2, marin3, marin4, marin5} ;

        MarinUtil marinUtil = new MarinUtil() ;
        marinUtil.augmenteSalaire(marins, 10) ;

        System.out.println("Salaire max = " + marinUtil.getMaxSalaire(marins)) ;
        System.out.println("Salaire moyen = " + marinUtil.getMoyenneSalaire(marins)) ;
        System.out.println("Salaire médian = " + marinUtil.getMedianeSalaire(marins)) ;
    }
}

