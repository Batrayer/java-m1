package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

public class Secretaire extends Biatoss{
    @Override
    public String toString() {
        return "Secretaire{}";
    }

    public Secretaire(String nom, String prenom, double securite_sociale, Departements dpt, Contrat contrat) {
        super(nom, prenom, securite_sociale, dpt, contrat);
    }
}
