package fr.parisnanterre.miage.poa.td1.personnels;

public abstract class EnseignantPermanent extends Enseignant {
    private String domaine_Recherche;

    @Override
    public String toString() {
        return "EnseignantPermanent{" +
                "domaine_Recherche='" + domaine_Recherche + '\'' +
                '}';
    }

    EnseignantPermanent(String nom, String prenom, double securite_sociale, CDI contrat) {
        super(nom, prenom, securite_sociale, contrat);
    }

    public void incrementation(double augmentation){contrat.setSalaire(contrat.getSalaire()+augmentation);}
}
