package com.achir.M13IR.PO.Serie4;

import com.achir.M13IR.PO.Serie1.Marin;
import com.achir.M13IR.PO.Serie2.Equipage;

/**
 * Created by achir on 27/12/2016.
 */
public class MainExo6 {
    public static void main(String[] args) {

        Marin m1 = new Marin("Maito", "Gaï", 1000);
        Marin m2 = new Marin("Haruno", "Sakura", 1000);
        Marin m3 = new Marin("Hatake", "Kakashi", 1000);
        Marin m4 = new Marin("Sarutobi", "Asuma", 1000);
        Marin m5 = new Marin("Namikaze", "Minato", 1000);
        Marin m6 = new Marin("Sarutobi", "Hiruzen", 1000);

        Equipage eq1 = new Equipage();
        eq1.addMarin(m1);
        eq1.addMarin(m2);
        eq1.addMarin(m3);
        System.out.println(eq1);

        Equipage eq2 = new Equipage();
        eq2.addMarin(m4);
        eq2.addMarin(m5);
        eq2.addMarin(m6);
        System.out.println(eq2);

    }
}
