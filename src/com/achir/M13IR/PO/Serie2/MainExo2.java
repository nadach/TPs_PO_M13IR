package com.achir.M13IR.PO.Serie2;

/**
 * Created by achir on 18/11/2016.
 */

import com.achir.M13IR.PO.Serie1.Marin;

public class MainExo2 {

    public static void main(String[] args) {
        Equipage equipage = new Equipage();

        System.out.println("\nQuestion 1\n==========");
        System.out.println("Nombre maximal de marins que cet équipage peut accueillir : " + equipage.getCapacite());

        System.out.println("\nQuestion 2\n==========");
        System.out.println("Le nombre de marins effectivement présents dans l’équipage : " + equipage.getNombreMarins());

        System.out.println("\nQuestion 3\n==========");
        Marin m1 = new Marin("Maito", "Gaï", 1000);
	/*
	 * add marin
	 * */
        if (equipage.addMarin(m1))
            System.out.println("ajout de " + m1);
        else
            System.out.println(m1 + " est déja présent");
        System.out.println("Le nombre de marins effectivement présents dans l’équipage : " + equipage.getNombreMarins() + "\n");
	/*
	 * add marin
	 * */
        m1 = new Marin("Hatake", "Kakashi", 1000);
        if (equipage.addMarin(m1))
            System.out.println("ajout de " + m1);
        else
            System.out.println(m1 + " est déja présent");
        System.out.println("Le nombre de marins effectivement présents dans l’équipage : " + equipage.getNombreMarins() + "\n");
	/*
	 * add marin
	 * */
        m1 = new Marin("Maito", "Gaï", 1000);
        if (equipage.addMarin(m1))
            System.out.println("ajout de " + m1);
        else
            System.out.println(m1 + " est déja présent");
        System.out.println("Le nombre de marins effectivement présents dans l’équipage : " + equipage.getNombreMarins() + "\n");
	/*
	 * add marin
	 * */
        m1 = new Marin("Sarutobi", "Asuma", 1000);
        if (equipage.addMarin(m1))
            System.out.println("ajout de " + m1);
        else
            System.out.println(m1 + " est déja présent");
        System.out.println("Le nombre de marins effectivement présents dans l’équipage : " + equipage.getNombreMarins());

        System.out.println("\nQuestion 4\n==========");
        System.out.println(equipage);

        System.out.println("\nQuestion 5\n==========");
        m1 = new Marin("Maito", "Gaï", 1000);
        System.out.println(m1 + " is present : " + equipage.isMarinPresent(m1));

        System.out.println("\nQuestion 6\n==========");
        equipage.removeMarin(m1);
        System.out.println(equipage);

        System.out.println("\nQuestion 7\n==========");
        Marin[] T = equipage.getEquipage();
        System.out.println("Taille de T " + T.length);
        System.out.println("T[0] : " + T[0]);
        System.out.println("T[1] : " + T[1]);
        System.out.println("T[2] : " + T[2]);
        System.out.println("T[3] : " + T[3]);
        System.out.println("T[4] : " + T[4]);

        System.out.println("\nQuestion 8\n==========");
        equipage.clear();
        System.out.println(equipage);
        System.out.println("Le nombre de marins effectivement présents dans l’équipage : " + equipage.getNombreMarins());

        System.out.println("\nQuestion 9\n==========");
        m1 = new Marin("Maito", "Gaï", 1000);
        equipage.addMarin(m1);
        m1 = new Marin("Hatake", "Kakashi", 1000);
        equipage.addMarin(m1);
        m1 = new Marin("Sarutobi", "Asuma", 1000);
        equipage.addMarin(m1);
        System.out.println("Le nombre de marins effectivement présents dans l’équipage : " + equipage.getNombreMarins());
        System.out.println(equipage);

        Equipage equipage2 = new Equipage();
        m1 = new Marin("Namikaze", "Minato", 1000);
        equipage2.addMarin(m1);
        m1 = new Marin("Sarutobi", "Hiruzen", 1000);
        equipage2.addMarin(m1);
        System.out.println("Le nombre de marins effectivement présents dans l’équipage 2 : " + equipage2.getNombreMarins());
        System.out.println(equipage2);

        equipage.addAllEquipage(equipage2);
        System.out.println("Le nombre de marins effectivement présents dans l’équipage : " + equipage.getNombreMarins());
        System.out.println(equipage);

        System.out.println("\nQuestion 10\n===========");
        equipage.etendEquipage(5);
        m1 = new Marin("Haruno", "Sakura", 1000);
        equipage.addMarin(m1);
        System.out.println("Nombre maximal de marins que cet équipage peut accueillir : " + equipage.getCapacite());
        System.out.println("Le nombre de marins effectivement présents dans l’équipage : " + equipage.getNombreMarins());
        System.out.println(equipage);

        System.out.println("\nQuestion 12 et 13\n=================");
        equipage2.clear();
        equipage2.etendEquipage(5);
        m1 = new Marin("Haruno", "Sakura", 1000);
        equipage2.addMarin(m1);
        m1 = new Marin("Namikaze", "Minato", 1000);
        equipage2.addMarin(m1);
        m1 = new Marin("Sarutobi", "Hiruzen", 1000);
        equipage2.addMarin(m1);
        m1 = new Marin("Maito", "Gaï", 1000);
        equipage2.addMarin(m1);
        m1 = new Marin("Hatake", "Kakashi", 1000);
        equipage2.addMarin(m1);
        m1 = new Marin("Sarutobi", "Asuma", 1000);
        equipage2.addMarin(m1);
        System.out.println("Nombre maximal de marins que cet équipage 2 peut accueillir : " + equipage2.getCapacite());
        System.out.println("Le nombre de marins effectivement présents dans l’équipage 2 : " + equipage2.getNombreMarins());
        System.out.println(equipage2);

        if (equipage.equals(equipage2))
            System.out.println("Equipage 2 est égale à équipage 1 ");
        else
            System.out.println("Equipage 2 n'est pas égale à équipage 1 ");

        System.out.println("hasCode d'equipage 2 = " + equipage2.hashCode());
        System.out.println("hasCode d'equipage = " + equipage.hashCode());

    }
}
