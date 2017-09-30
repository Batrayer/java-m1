package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public final class Ater extends EnseignantTemporaire {
    public Ater(String nom, String prenom, double securite_sociale, CDD contrat) {
        super(nom, prenom, securite_sociale, contrat);
    }

    @Override
    public String toString() {
        return "Ater{}";
    }
}
