package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public final class Vacataire extends EnseignantTemporaire {
    @Override
    public String toString() {
        return "Vacataire{}";
    }

    public Vacataire(String nom, String prenom, double securite_sociale, CDD contrat) {
        super(nom, prenom, securite_sociale, contrat);
    }
}
