package com.achir.M13IR.PO.Serie5;

import com.achir.M13IR.PO.Serie1.Marin;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by achir on 27/12/2016.
 */
public class Sauvegarde {

    public static void sauveFichierTexte(String nomFichier, Marin marin) {
        File fichier = new File(nomFichier);
        Writer writer = null;

        try {
            writer = new FileWriter(fichier,true); // true --> ajouter un nouveau Marin à la fin
            PrintWriter pw = new PrintWriter(writer);

            pw.append(marin.getNom());
            pw.append('|');
            pw.append(marin.getPrenom());
            pw.append('|');
            pw.append(String.valueOf(marin.getSalaire()));
            pw.append('\n'); // retour à la ligne
            pw.close();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public static List<Marin> lisFichierTexte(String nomFichier){

        try
        {
            BufferedReader br = new BufferedReader( new FileReader(nomFichier));
            String strLine;
            StringTokenizer st = null;
            List <Marin> list = new ArrayList<Marin>();
            Marin m;

            while( (strLine = br.readLine()) != null)
            {
                st = new StringTokenizer(strLine, "|");
                m = new Marin(st.nextToken(),st.nextToken(),Integer.parseInt(st.nextToken()));
                list.add(m);
            }
            br.close();
            System.out.println("Liste Marins fichier texte: " + list);
            return list;
        }
        catch(Exception e)
        {
            System.out.println("Exception en cours de lecture du fichier: " + e);
            return null;
        }
    }



}
