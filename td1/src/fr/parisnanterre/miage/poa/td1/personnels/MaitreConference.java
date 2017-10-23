package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

import java.util.Date;

public final class MaitreConference extends EnseignantPermanent {
    public MaitreConference(String nom, String prenom, double securite_sociale, Departements dpt, CDI contrat) {
        super(nom, prenom, securite_sociale,dpt, contrat);
    }

    @Override
    public String toString() {
        return "MaitreConference{" +
                "domaine_Recherche='" + domaine_Recherche + '\'' +
                ", salaire=" + getSalaire() +
                '}';
    }
}
