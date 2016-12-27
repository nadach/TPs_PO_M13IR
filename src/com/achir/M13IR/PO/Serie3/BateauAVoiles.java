package com.achir.M13IR.PO.Serie3;

/**
 * Created by achir on 27/12/2016.
 */

public class BateauAVoiles extends Bateau implements Propulsion {

    public BateauAVoiles(String nom, int tonnage, EquipageCommande equipageCommande) {
        super(nom, tonnage, equipageCommande);
    }


    @Override
    public String getPropulsion() {
        return "voiles";
    }
}
