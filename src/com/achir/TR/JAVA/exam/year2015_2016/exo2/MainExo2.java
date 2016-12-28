package com.achir.TR.JAVA.exam.year2015_2016.exo2;

import com.achir.TR.JAVA.exam.year2015_2016.exo1.*;

import java.io.File;

/**
 * Created by achir on 28/12/2016.
 */
public class MainExo2 {
    public static void main(String[] args) {
        Client client1 = new Client("DUPONT", "Alain", 1900, 0606060606, "Paris");
        Client client2 = new Client("DUBOIS", "Anthony", 1900, 0606060612, "Paris");
        Client client3 = new Client("PAUL", "Maryse", 1900, 0606060611, "Paris");

        Compte compte1 = new Compte(client1, 1600);
        Compte compte2 = new Compte(client2, 600);
        Compte compte3 = new Compte(client3, 42);

        Banque banque = new Banque();
        banque.ajouteCompte(compte1);
        banque.ajouteCompte(compte2);
        banque.ajouteCompte(compte3);

        LireEcrireComptes compte = new LireEcrireComptes();
        compte.sauveComptes(banque,"datas" + File.separator + "Comptes.txt");
        System.out.println(compte.readComptes("datas" + File.separator + "Comptes.txt"));
    }
}
