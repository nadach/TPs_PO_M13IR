package com.achir.M13IR.PO.Serie4;

import com.achir.M13IR.PO.Serie1.Marin;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by achir on 27/12/2016.
 */
public class MainExo7 {
    public static void main(String[] args) {
        Set<Marin> set = new HashSet<Marin>();

        Marin m1 = new Marin("Maito", "Gaï", 1000);
        Marin m2 = new Marin("Haruno", "Sakura", 1000);
        Marin m3 = new Marin("Hatake", "Kakashi", 1000);
        Marin m4 = new Marin("Sarutobi", "Asuma", 1000);
        Marin m5 = new Marin("Namikaze", "Minato", 1000);
        Marin m6 = new Marin("Sarutobi", "Hiruzen", 1000);

        System.out.println("add " +  m1 + " -> " + set.add(m1));
        System.out.println("add " +  m1 + " again -> " + set.add(m1));
        System.out.println("add " +  m2 + " -> " + set.add(m2));
        System.out.println("add " +  m3 + " -> " + set.add(m3));
        System.out.println("add " +  m4 + " -> " + set.add(m4));
        System.out.println("add " +  m5 + " -> " + set.add(m5));
        System.out.println("add " +  m6 + " -> " + set.add(m6));

    }
}
