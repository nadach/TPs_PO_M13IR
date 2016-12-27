package com.achir.M13IR.PO.Serie3;

/**
 * Created by achir on 26/12/2016.
 */
public class Bateau {

    private String nom;
    private int tonnage;
    private EquipageCommande equipageCommande;

    public Bateau(String nom, int tonnage, EquipageCommande equipageCommande) {
        this.nom = nom;
        this.tonnage = tonnage;
        this.equipageCommande = equipageCommande;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public EquipageCommande getEquipageCommande() {
        return equipageCommande;
    }

    public void setEquipageCommande(EquipageCommande equipageCommande) {
        this.equipageCommande = equipageCommande;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bateau)) return false;

        Bateau bateau = (Bateau) o;

        if (getTonnage() != bateau.getTonnage()) return false;
        if (getNom() != null ? !getNom().equals(bateau.getNom()) : bateau.getNom() != null) return false;
        return getEquipageCommande() != null ? getEquipageCommande().equals(bateau.getEquipageCommande()) : bateau.getEquipageCommande() == null;
    }

    @Override
    public int hashCode() {
        int result = getNom() != null ? getNom().hashCode() : 0;
        result = 31 * result + getTonnage();
        result = 31 * result + (getEquipageCommande() != null ? getEquipageCommande().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bateau{" +
                "nom='" + nom + '\'' +
                ", tonnage=" + tonnage +
                ", equipageCommande=" + equipageCommande +
                '}';
    }
}
