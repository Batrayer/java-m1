package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

public abstract class EnseignantPermanent extends Enseignant {
    String domaine_Recherche;

    @Override
    public String toString() {
        return "EnseignantPermanent{" +
                "domaine_Recherche='" + domaine_Recherche + '\'' +
                '}';
    }

    EnseignantPermanent(String nom, String prenom, double securite_sociale, Departements dpt, CDI contrat) {
        super(nom, prenom, securite_sociale, dpt,contrat);
    }

    public void incrementation(double augmentation){contrat.setSalaire(contrat.getSalaire()+augmentation);}
}
