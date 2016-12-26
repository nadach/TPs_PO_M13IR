
package com.achir.M13IR.PO.Serie3;

/**
 * Created by achir on 26/12/2016.
 */

import com.achir.M13IR.PO.Serie1.Marin;
import com.achir.M13IR.PO.Serie3.Capitaine;
import com.achir.M13IR.PO.Serie3.EquipageCommande;
import com.achir.M13IR.PO.Serie3.util.Grade;

public class MainExo4 {
    public static void main(String[] args) throws CloneNotSupportedException{
        Capitaine c1 = new Capitaine("jean","paul", Grade.CAPITAINE);
        Marin m1 = new Marin("pierre","tata");

        EquipageCommande ec = new EquipageCommande(c1);


    }

}
