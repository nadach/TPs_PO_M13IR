package com.achir.M13IR.PO.exam.year2015_2016.exo1;

import java.io.File;

/**
 * Created by achir on 29/12/2016.
 */
public class MainExo1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Patient p1 = new Patient("nom","prenom1");
        p1.ajoutMedicament("medoc1");
        p1.ajoutMedicament("medoc2");
        p1.ajoutMedicament("medoc3");
        p1.ajoutMedicament("medoc2");
        System.out.println(p1);

        Patient p2 = new Patient("nom","prenom2");
        p2.ajoutMedicament("medoc1");
        p2.ajoutMedicament("medoc3");
        p2.ajoutMedicament("medoc4");
        p2.ajoutMedicament("medoc5");
        System.out.println(p2);

        Patient p3 = new Patient("nom1","prenom");
        p3.ajoutMedicament("medoc1");
        p3.ajoutMedicament("medoc3");
        p3.ajoutMedicament("medoc5");
        p3.ajoutMedicament("medoc6");
        System.out.println(p3);

        Patient p4 = new Patient("nom2","prenom");
        p4.ajoutMedicament("medoc1");
        p4.ajoutMedicament("medoc2");
        p4.ajoutMedicament("medoc6");
        p4.ajoutMedicament("medoc6");
        System.out.println(p4);

        DossierPharmacie d = new DossierPharmacie();
        d.nouveauPatient(p1);
        d.nouveauPatient(p2);
        d.nouveauPatient(p3);
        d.nouveauPatient(p4);
        d.EcrirePatients("datas" + File.separator + "ecrireSurFichierLesPatients_v0.txt");
        System.out.println(d);

        System.out.println(d.retPatientAvecMedicament("medoc2"));
        p1.supprimerMedicament("medoc1");
        p1.supprimerMedicament("medoc2");
        p1.supprimerMedicament("medoc3");

        d.enleveOrdonnanceVide();
        System.out.println(d.retPatientAvecMedicament("medoc2"));
        System.out.println(d);
        d.EcrirePatients("datas" + File.separator + "ecrireSurFichierLesPatients_V1.txt");
    }

}
