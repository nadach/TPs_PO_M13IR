package com.achir.M13IR.PO.Serie5;

import com.achir.M13IR.PO.Serie1.Marin;

import java.io.File;

/**
 * Created by achir on 27/12/2016.
 */
public class MainExo10 {
    public static void main(String[] args) {
        String nomFichierTxt = "datas" + File.separator + "marins.txt";

        Marin m1 = new Marin("Maito", "Gaï", 1000);
        Marin m2 = new Marin("Haruno", "Sakura", 1000);
        Marin m3 = new Marin("Hatake", "Kakashi", 1000);
        Marin m4 = new Marin("Sarutobi", "Asuma", 1000);
        Marin m5 = new Marin("Namikaze", "Minato", 1000);
        Marin m6 = new Marin("Sarutobi", "Hiruzen", 1000);

        Sauvegarde.sauveFichierTexte(nomFichierTxt,m1);
        Sauvegarde.sauveFichierTexte(nomFichierTxt,m2);
        Sauvegarde.sauveFichierTexte(nomFichierTxt,m3);
        Sauvegarde.sauveFichierTexte(nomFichierTxt,m4);
        Sauvegarde.sauveFichierTexte(nomFichierTxt,m5);
        Sauvegarde.sauveFichierTexte(nomFichierTxt,m6);
        System.out.println(Sauvegarde.lisFichierTexte(nomFichierTxt));

    }

}
