package com.achir.TR.JAVA.exam.year2015_2016.exo2;

import com.achir.TR.JAVA.exam.year2015_2016.exo1.*;

import java.io.*;
import java.util.Iterator;

/**
 * Created by achir on 28/12/2016.
 */

public class LireEcrireComptes {

    public void sauveComptes(Banque banque,String filename){
        File fichier = new File(filename) ;
        Compte compte;
        Writer writer = null;
        try {

            writer = new FileWriter(fichier, true) ; // true to append
            Iterator<Compte> it = banque.getListeComptes().iterator() ;
            String resultat = "";
            while(it.hasNext()) {
                compte = it.next();
                writer.write(compte.getSolde()
                        + "|" + compte.getClient().getNom()
                        + "|" + compte.getClient().getPrenom()
                        + "|" + compte.getClient().getAnneeNaissance()
                        + "|" + compte.getClient().getTel()
                        + "|" + compte.getClient().getAdresse()
                        + "\n") ;
            }
        } catch (IOException e) {
            System.out.println("Erreur " + e.getMessage()) ;
            e.printStackTrace() ;
        } finally {
            if (writer != null) {
                try {
                    writer.close() ;
                } catch (IOException e) {
                    System.out.println("Erreur " + e.getMessage()) ;
                    e.printStackTrace() ;
                }
            }
        }
    }

    public Compte readCompte(String line){
        Compte compte = null;
        Client client;
        String param[];
        param = line.split("\\|");
        client = new Client(param[1], param[2], Integer.parseInt(param[3]),
                Integer.parseInt(param[4]), param[5]);
        compte = new Compte(client, Integer.parseInt(param[0]));
        return compte;
    }

    public Compte readComptes(String nomFichier){

        File fichier = new File(nomFichier);
        String param[];
        Compte compte = null;
        Client client;
        FileReader fr = null ;
        BufferedReader br = null;
        try {
            String line = null;
            fr = new FileReader(fichier) ;
            br = new BufferedReader(fr); // pour lire ligne par ligne

            line = br.readLine();
            param = line.split("\\|");
            client = new Client(param[1], param[2], Integer.parseInt(param[3]),
                    Integer.parseInt(param[4]), param[5]);
            compte = new Compte(client, Integer.parseInt(param[0]));
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        } finally {
            if (fr != null) {
                try {
                    br.close();
                    fr.close() ;
                } catch (IOException e) {
                }
            }
        }
        return compte;
    }

}
