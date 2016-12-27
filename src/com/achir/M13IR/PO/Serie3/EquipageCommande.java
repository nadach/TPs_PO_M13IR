package com.achir.M13IR.PO.Serie3;

import com.achir.M13IR.PO.Serie2.Equipage;

public class EquipageCommande extends Equipage {

    private Capitaine commandant;

    /**
     *
     * @param commandant commandant
     */
    public EquipageCommande(Capitaine commandant){
        super();
        this.commandant = commandant;
    }

    /**
     *
     * @return commandant
     */
    public Capitaine getCommandant() {
        return commandant;
    }

    @Override
    public String toString() {
        return "EquipageCommande{" +
                "commandant=" + commandant +
                "} " + super.toString();
    }
}
