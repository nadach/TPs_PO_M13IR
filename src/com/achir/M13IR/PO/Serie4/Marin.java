/**
 * This is the second version of Marin class
 * In this class we add the Comparable interface
 */

package com.achir.M13IR.PO.Serie4;

public class Marin implements Comparable<Marin>{

    /**
     *
     */
    private String nom;
    private String prenom;
    private int salaire;

    /**
     *
     * @param nom
     * @param prenom
     * @param salaire
     */
    public Marin(String nom, String prenom, int salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    /**
     *
     * @param nom
     * @param prenom
     */
    public Marin(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     *
     * @return
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
    public int getSalaire() {
        return salaire;
    }

    /**
     *
     * @param salaire
     */
    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Marin{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", salaire=" + salaire +
                '}';
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Marin)) return false;

        Marin marin = (Marin) o;

        if (getSalaire() != marin.getSalaire()) return false;
        if (getNom() != null ? !getNom().equals(marin.getNom()) : marin.getNom() != null) return false;
        return getPrenom() != null ? getPrenom().equals(marin.getPrenom()) : marin.getPrenom() == null;

    }

    /**
     *
     * @return
     */
    @Override
    public int hashCode() {
        int result = getNom() != null ? getNom().hashCode() : 0;
        result = 31 * result + (getPrenom() != null ? getPrenom().hashCode() : 0);
        result = 31 * result + getSalaire();
        return result;
    }

    /**
     *
     * @param augmentation
     */
    public void augmenteSalaire(int augmentation) {
        this.nom = this.nom + augmentation;
    }

    /**
     *
     * @param o
     * @return
     */
    @Override
    public int compareTo(Marin o) {
        if(getNom().equals(o.getNom())){
            return getPrenom().compareTo(o.getPrenom());
        }
        else{
            return getNom().compareTo(o.getNom());
        }
    }
}

