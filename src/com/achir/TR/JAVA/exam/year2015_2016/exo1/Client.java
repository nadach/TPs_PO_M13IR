package com.achir.TR.JAVA.exam.year2015_2016.exo1;

/**
 * Created by achir on 28/12/2016.
 */

public class Client {

    private int id, anneeNaissance, tel;
    private String nom, prenom, adresse;

    public Client(String nom, String prenom, int anneeNaissance, int tel, String adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.anneeNaissance = anneeNaissance;
        this.adresse = adresse;
        this.tel = tel;
        id = Math.abs(this.hashCode());

    }

    public int getId() {
        return id;
    }

    public int getAnneeNaissance() {
        return anneeNaissance;
    }

    public void setAnneeNaissance(int anneeNaissance) {
        this.anneeNaissance = anneeNaissance;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int hashCode() {
        int hashCode = 17 ;
        hashCode = 31 * hashCode + ((nom == null) ? 0 : nom.hashCode());
        hashCode = 31 * hashCode + ((prenom == null) ? 0 : prenom.hashCode());
        hashCode = 31 * hashCode + anneeNaissance;
        hashCode = 31 * hashCode + tel;

        return hashCode ;
    }

    public String toString(){
        return "Client : " + prenom + " " + nom + "\n" + "ID : " + id +
                "\n" + "Annee de naissance : " + anneeNaissance + "\n"
                + "Telephone : " + tel + "\n" + "Adresse : " + adresse;
    }
}
