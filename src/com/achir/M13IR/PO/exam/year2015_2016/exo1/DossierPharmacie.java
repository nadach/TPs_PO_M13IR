package com.achir.M13IR.PO.exam.year2015_2016.exo1;

/**
 * Created by achir on 29/12/2016.
 */


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DossierPharmacie {

    private HashMap <String,Patient> patients;

    public DossierPharmacie () {
        patients = new HashMap <String,Patient>();
    }

    /**
     * Ajoute un nouveau patient de nom, prenom et medicaments donnes
     * @param nom : nom du patient
     * @param prenom : prenom du patient
     * @param ord : liste de medicaments
     */
    public void nouveauPatient(String nom, String prenom, Set<String> ord) {
        Patient c = new Patient(nom,prenom);
        c.setOrdonnance(ord);
        String key=nom.toLowerCase()+"."+prenom.toLowerCase();
        if (patients.get(key)!=null)
            System.out.println("Impossible d'ajouter le patient "+
                    nom + " " + prenom + " : ce patient existe déja");
        else {
            patients.put(key, c);
            System.out.println("Ajout avec succes");
        }
    }

    /**
     */
    public void nouveauPatient(Patient p) {
        String key=p.getNom().toLowerCase()+"."+p.getPrenom().toLowerCase();
        if (patients.get(key)!=null)
            System.out.println("Impossible d'ajouter le patient "+
                    p + " : ce patient existe déja");
        else {
            patients.put(key, p);
            System.out.println("Ajout avec succes");
        }
    }

    // Compléter les methodes suivantes
    /**
     * Ajoute un nouveu medicament sur un patient deja existant.
     * Renvoie false si le patient n’existe pas et true si l'ajout a pu etre effectue
     * @param nom
     * @param m
     * @return
     */
    public boolean ajoutMedicament(String nom, String prenom, String m){
        Patient c = patients.get(nom.toLowerCase()+"."+prenom.toLowerCase());
        if (c==null) {
            System.out.println("Le patient " + c + " n'existe pas...");
            return false;
        }
        c.ajoutMedicament(m);
        System.out.println("Ajout avec succes");
        return true;
    }

    /**
     * Affiche l'ordonnance du patient de nom "nom" et de prenom "prenom"
     * @param nom
     * @param prenom
     */
    public void affichePatient(String nom, String prenom){
        Patient c = patients.get(nom.toLowerCase()+"."+prenom.toLowerCase());
        if (c==null)
            System.out.println("Aucun patient de nom "+nom);
        else
            System.out.println(c.getOrdonnance());
    }


    /**
     * Retourne la liste des patients qui prennent le medicament m
     * @param m medicament
     * @return une collection de patient
     */
    public ArrayList<Patient> retPatientAvecMedicament(String m) {
        ArrayList<Patient> lc = new ArrayList<Patient>();
        for (Patient p : patients.values()) {
            if (p.contientMedicament(m)) {
                lc.add(p);
            }
        }
        return lc;
    }

    /**
     * Methode qui parcourt la mappe et enleve de la liste tous les
     * patients d si l’ordonnance est vide.
     */
    public void enleveOrdonnanceVide() {
        Set<Map.Entry<String, Patient>> s = patients.entrySet();
        Iterator<Map.Entry<String, Patient>> it = s.iterator();
        while (it.hasNext()) {
            Patient p = it.next().getValue();
            if (p.ordonnanceVide()){
                it.remove();
            }
        }
    }

    /**
     *
     */
    @Override
    public String toString() {
        return "DossierPharmacie [patients=" + patients + "]";
    }


    /**
     * Ecrire sur fichier
     * @param nomDeFichier
     */
    public void EcrirePatients(String nomDeFichier) {
        // définition d'un fichier
        File fichier =  new File(nomDeFichier) ;

        // la définition du writer doit se faire ici
        // pour des raisons de visibilité
        Writer writer = null ;
        try {
            // ouverture d'un flux de sortie sur un fichier
            // a pour effet de créer le fichier
            writer =  new FileWriter(fichier) ;
            // écriture dans le fichier
            for (Patient p : patients.values()) {
                writer.write(p.getNom()+" ");
                writer.write(p.getPrenom()+" ");
                //writer.write(p.getOrdonnance().size()+" ");
                for (String o: p.getOrdonnance()) {
                    writer.write(o+" ");
                }
                writer.write("\n");
            }
        }
        catch (IOException e) {
            // affichage du message d'erreur et de la pile d'appel
            System.out.println("Erreur " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            // il se peut que l'ouverture du flux ait échoué,
            // et que ce writer n'ait pas été initialisé
            if (writer != null) {
                try {
                    // la méthode close de FileWriter appelle elle-même flush()
                    writer.close();
                }
                catch (IOException e) {
                    System.out.println("Erreur " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     *
     * @param nomDeFichier
     */
    public void LirePatients(String nomDeFichier) {


    }


}
