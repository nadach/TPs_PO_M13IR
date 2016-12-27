package com.achir.M13IR.PO.Serie3;

/**
 * Created by achir on 27/12/2016.
 */
public class BateauAMoteur extends Bateau implements Propulsion {

    public BateauAMoteur(String nom, int tonnage, EquipageCommande equipageCommande) {
        super(nom, tonnage, equipageCommande);
    }

    @Override
    public String getPropulsion() {
        return "moteur";
    }
}
