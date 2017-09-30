package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public final class MaitreConference extends EnseignantPermanent {
    public MaitreConference(String nom, String prenom, double securite_sociale, CDI contrat) {
        super(nom, prenom, securite_sociale, contrat);
    }

    @Override
    public String toString() {
        return "MaitreConference{" +
                "domaine_Recherche='" + domaine_Recherche + '\'' +
                ", salaire=" + getSalaire() +
                '}';
    }
}
