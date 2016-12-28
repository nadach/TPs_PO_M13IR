package com.achir.TR.JAVA.exam.year2015_2016.exo1;

/**
 * Created by achir on 28/12/2016.
 */

public class Compte {
    private int id, solde;
    private Client client;

    public Compte (Client client, int solde){
        this.client = client;
        this.solde = solde;
        id = Math.abs(this.hashCode());
    }

    public int getSolde() {
        return solde;
    }


    public void setSolde(int solde) {
        this.solde = solde;
    }


    public Client getClient() {
        return client;
    }


    public void setClient(Client client) {
        this.client = client;
    }

    public int getId() {
        return id;
    }


    public boolean crediter(int somme){
        if(somme < 0) {
            System.out.println("Impossible d'ajouter la somme de : " + somme +
                    ". Entrez une somme positive.");
            return false;
        }
        else {
            solde += somme;
            System.out.println("Ajout avec succes");
            return true;
        }
    }

    public boolean debiter(int somme){
        if((solde - Math.abs(somme)) >= -100 ) {
            solde -= Math.abs(somme);
            System.out.println("Ajout avec succes");
            return true;
        } else {
            System.out.println("Impossible de retirer "
                    + Math.abs(somme) + ". Votre solde doit etre superieur � 100 Euros");
            return false;
        }

    }

    public String toString(){
        return "Compte numero : " + id + "\nClient : "
                + client.getPrenom() + " " + client.getNom() + "\n"
                + "Solde : " + solde + "\n";
    }

    public int hashCode() {
        int hashCode = 3 ;
        hashCode = 31 * hashCode + client.hashCode();
        hashCode = 31 * hashCode + solde;

        return hashCode ;
    }


}



