package com.achir.M13IR.PO.Serie3;

import com.achir.M13IR.PO.Serie1.Marin;
import com.achir.M13IR.PO.Serie2.Equipage;
import com.achir.M13IR.PO.Serie3.util.Grade;

public class MainExo3 {

    public static void main(String[] args) {
        Capitaine c1 = new Capitaine("jean","paul", Grade.CAPITAINE);
        Marin m1 = new Marin("pierre","tata");

        Equipage equip = new Equipage();
        System.out.println("Add Capitaine c1 to equipage equip: " + equip.addMarin(m1));
        System.out.println("Add Marin m1 to equipage equip: " + equip.addMarin(c1));
        // Question 4 : Oui c'est possible de ranger un capitaine dans un équipage, sans modifier la classe Equipage 

        System.out.println(equip);
    }
}

