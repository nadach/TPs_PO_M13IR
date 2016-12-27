package com.achir.M13IR.PO.Serie4;

import com.achir.M13IR.PO.Serie1.Marin;

/**
 * Created by achir on 27/12/2016.
 */
public class MainExo8a {
    public static void main(String[] argv) {
        Marin m1 = new Marin("Maito", "Gaï", 1000);
        Marin m2 = new Marin("Haruno", "Sakura", 1000);
        Marin m3 = new Marin("Hatake", "Kakashi", 1000);
        Marin m4 = new Marin("Sarutobi", "Asuma", 1000);
        Marin m5 = new Marin("Namikaze", "Minato", 1000);
        Marin m6 = new Marin("Sarutobi", "Hiruzen", 1000);

        MarinComparator MC = new MarinComparator();

        System.out.println("comparainson of " + m1 + " and " + m2 + " -> " + MC.compare(m1,m2));
        System.out.println("comparainson of " + m1 + " and " + m1 + " -> " + MC.compare(m1,m1));
        System.out.println("comparainson of " + m3 + " and " + m6 + " -> " + MC.compare(m3,m6));
        System.out.println("comparainson of " + m4 + " and " + m5 + " -> " + MC.compare(m4,m5));



    }
}
