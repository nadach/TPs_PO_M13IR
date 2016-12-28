package com.achir.TR.JAVA.exam.year2015_2016.exo1;

/**
 * Created by achir on 28/12/2016.
 */
public class MainExo1 {
    public static void main(String[] args) {
        Client client1 = new Client("DUPONT", "Alain", 1900, 0606060606, "Paris");
        Client client2 = new Client("DUBOIS", "Anthony", 1900, 0606060612, "Paris");
        Client client3 = new Client("PAUL", "Maryse", 1900, 0606060611, "Paris");

        System.out.println(client1.toString());
        System.out.println(client2.toString());
        System.out.println(client3.toString());

        Compte compte1 = new Compte(client1, 1600);
        Compte compte2 = new Compte(client2, 600);
        Compte compte3 = new Compte(client3, 42);

        System.out.println(compte1.toString());
        System.out.println(compte2.toString());
        System.out.println(compte3.toString());

        Banque banque = new Banque();
        banque.ajouteCompte(compte1);
        banque.ajouteCompte(compte2);
        banque.ajouteCompte(compte3);

        System.out.println(banque.afficheComptes());
        System.out.println(banque.getComptesNom("DUBOIS"));


    }

}