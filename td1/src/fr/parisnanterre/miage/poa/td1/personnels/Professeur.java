package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public final class Professeur extends EnseignantPermanent {
    public Professeur(String nom, String prenom, double securite_sociale, CDI contrat) {
        super(nom, prenom, securite_sociale, contrat);
    }
}
