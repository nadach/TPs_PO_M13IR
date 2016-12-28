package com.achir.TR.JAVA.exam.year2015_2016.exo1;

/**
 * Created by achir on 28/12/2016.
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Banque {

    private ArrayList<Compte> listeComptes;

    public Banque(){
        listeComptes = new ArrayList<Compte>();
    }

    public void creeCompte(Client client, int solde) {
        Compte compte = new Compte(client, solde);
        listeComptes.add(compte);

    }
    public void ajouteCompte(Compte compte){
        listeComptes.add(compte);
    }

    public String afficheComptes() {
        Iterator<Compte> it = listeComptes.iterator() ;
        String resultat = "";
        while(it.hasNext()) {
            Compte element = it.next();
            resultat += element.toString();
        }
        return resultat;
    }

    public ArrayList<Compte> getComptesNom(String nom){
        ArrayList<Compte> listeComptesNom = new ArrayList<>();
        Iterator<Compte> it = listeComptes.iterator() ;

        while(it.hasNext()) {
            Compte element = it.next();
            if(element.getClient().getNom().equals(nom))
                listeComptesNom.add(element);
        }

        return listeComptesNom;
    }

    public String afficheCompteNumero(int id){
        Iterator<Compte> it = listeComptes.iterator() ;
        String resultat = "";
        while(it.hasNext()) {
            Compte element = it.next();
            if(element.getId() == id) {
                resultat = element.toString();
                break;
            }
        }

        return resultat;
    }

    public boolean debiteCompteNumero(int id, int somme){
        Compte compte = null;
        Iterator<Compte> it = listeComptes.iterator() ;

        while(it.hasNext()) {
            Compte element = it.next();
            if(element.getId() == id) {
                compte = element;
                break;
            }
        }

        return compte.debiter(somme);
    }

    public boolean crediteCompteNumero(int id, int somme){
        Compte compte = null;
        Iterator<Compte> it = listeComptes.iterator() ;

        while(it.hasNext()) {
            Compte element = it.next();
            if(element.getId() == id) {
                compte = element;
                break;
            }
        }

        return compte.crediter(somme);
    }

    public void supprimeCompteNumero(int id, int somme){
        int idCompte = 0;
        Iterator<Compte> it = listeComptes.iterator() ;

        while(it.hasNext()) {
            Compte element = it.next();
            if(element.getId() == id) {
                idCompte = element.getId();
                break;
            }
        }

        listeComptes.remove(idCompte);
    }

    public void virement(int idACrediter, int idADebiter, int somme) {
        Iterator<Compte> it = listeComptes.iterator() ;
        Compte compteADebiter = null;
        Compte compteACrediter = null;

        while(it.hasNext()) {
            Compte element = it.next();
            if(element.getId() == idACrediter)
                compteACrediter = element;
            if(element.getId() == idADebiter)
                compteADebiter = element;
        }

        compteACrediter.crediter(somme);
        compteADebiter.debiter(somme);
    }

    public ArrayList<Compte> getListeComptes() {
        return listeComptes;
    }


}
