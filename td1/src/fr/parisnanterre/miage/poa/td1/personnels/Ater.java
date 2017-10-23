package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

import java.util.Date;

public final class Ater extends EnseignantTemporaire {
    public Ater(String nom, String prenom, double securite_sociale, Departements dpt, CDD contrat) {
        super(nom, prenom, securite_sociale,dpt, contrat);
    }

    @Override
    public String toString() {
        return "Ater{}";
    }
}
