package com.achir.M13IR.PO.Serie1;

/**
 * Created by achir on 11/11/2016.
 */

public class MainExo1 {

    public static void main(String[] args) {
        Marin m1 = new Marin("Artaud", "Florence", 49) ;
        Marin m2 = new Marin("Artaud", "Florence", 49) ;
        Marin m3 = new Marin("Tabarly", "Eric", 59) ;

        System.out.println("m1 = " + m1) ;
        System.out.println("m2 = " + m2) ;
        System.out.println("m3 = " + m3) ;

        System.out.println("m1 == m2 : " + (m1 == m2)) ;
        System.out.println("m1 == m3 : " + (m1 == m3)) ;
        System.out.println("m2 == m3 : " + (m2 == m3)) ;

        System.out.println("m1 égale m2 : " + m1.equals(m2)) ;
        System.out.println("m1 égale m3 : " + m1.equals(m3)) ;
        System.out.println("m2 égale m3 : " + m2.equals(m3)) ;

        System.out.println("Hashcode de m1 : " + m1.hashCode()) ;
        System.out.println("Hashcode de m2 : " + m2.hashCode()) ;
        System.out.println("Hashcode de m3 : " + m3.hashCode()) ;
    }

}
