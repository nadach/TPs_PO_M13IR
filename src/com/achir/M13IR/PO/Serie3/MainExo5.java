package com.achir.M13IR.PO.Serie3;

import com.achir.M13IR.PO.Serie3.util.Grade;

/**
 * Created by achir on 27/12/2016.
 */
public class MainExo5 {
    public static void main(String[] args) {
        EquipageCommande ec = new EquipageCommande(new Capitaine("sparow", "jack", Grade.CAPITAINE));
        BateauARames BR = new BateauARames("BR", 12, ec);
        System.out.println(BR);
        System.out.println(BR.getPropulsion());

        BateauAVoiles BV = new BateauAVoiles("BV", 12, ec);
        System.out.println(BV);
        System.out.println(BV.getPropulsion());

        BateauAMoteur BM = new BateauAMoteur("BM", 12, ec);
        System.out.println(BM);
        System.out.println(BM.getPropulsion());
    }
}
