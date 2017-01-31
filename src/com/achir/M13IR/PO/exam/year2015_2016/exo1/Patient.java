package com.achir.M13IR.PO.exam.year2015_2016.exo1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by achir on 29/12/2016.
 */

public class Patient {
    // Nom et prenom du patient
    private String nom;
    private String prenom;

    // Liste des medocs
    private Set<String> ordonnance;

    /**
     * Constructeur
     * @param nom nom du patient
     * @param prenom prenom du patient
     */
    public Patient(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        ordonnance = new HashSet<String>();
    }

    /**
     * Getter pour le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     *
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     *
     * @return
     */
    public Set<String> getOrdonnance() {
        return ordonnance;
    }

    public void setOrdonnance(Set<String> ordonnance) {
        this.ordonnance = ordonnance;
    }

    /**
     *
     * @return True s'il n'y a aucun medicament dans l'ordonnance
     */
    public boolean ordonnanceVide () {
        return ordonnance.isEmpty();
    }

    /**
     * Ajoute un medicament de nom m dans ordonnance
     * @param m
     */
    public void ajoutMedicament(String m) {
        // A completer ...
    }

    /**
     * Ajoute un medicament de nom m dans ordonnance
     * @param m
     */
    public void supprimerMedicament(String m) {
        // A completer ...
    }

    /**
     * Teste si ordonnance contient un medicament m
     * @param m
     * @return
     */
    public boolean contientMedicament(String m) {
        // A completer ...
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Patient{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", ordonnance=" + ordonnance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Patient)) return false;

        Patient patient = (Patient) o;

        if (getNom() != null ? !getNom().equals(patient.getNom()) : patient.getNom() != null) return false;
        return getPrenom() != null ? getPrenom().equals(patient.getPrenom()) : patient.getPrenom() == null;
    }

    @Override
    public int hashCode() {
        int result = getNom() != null ? getNom().hashCode() : 0;
        result = 31 * result + (getPrenom() != null ? getPrenom().hashCode() : 0);
        return result;
    }
}

