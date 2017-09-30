package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

import java.util.Date;

public final class Bibliothequaire extends Biatoss {
    @Override
    public String toString() {
        return "Bibliothequaire{}";
    }


    public Bibliothequaire(String nom, String prenom, double securite_sociale, Departements dpt, Contrat contrat) {
        super(nom, prenom, securite_sociale, dpt, contrat);
    }
}
