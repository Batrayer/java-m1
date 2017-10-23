package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

import java.util.Date;

public final class Professeur extends EnseignantPermanent {
    public Professeur(String nom, String prenom, double securite_sociale, Departements dpt, CDI contrat) {
        super(nom, prenom, securite_sociale, dpt, contrat);
    }
}
