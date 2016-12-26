/**
 * PACKAGE
 */
package com.achir.M13IR.PO.Serie3;

/**
 * IMPORTS
 */
import com.achir.M13IR.PO.Serie2.Equipage;

/**
 * CLASS
 */
public class EquipageCommande extends Equipage {

    private Capitaine commandant;

    /**
     *
     * @param commandant
     */
    public EquipageCommande(Capitaine commandant){
        super();
        this.commandant = commandant;
    }

    /**
     *
     * @return
     */
    public Capitaine getCommandant() {
        return commandant;
    }


}
