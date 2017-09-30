package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

public abstract class Personnel {
    private String nom;
    private String prenom;
    private double securite_sociale;

    //Partie 3 du TD1

    private Departements departement;

    Personnel(String nom, String prenom, double securite_sociale, Departements dpt) {
        this.nom = nom;
        this.prenom = prenom;
        this.securite_sociale = securite_sociale;
        this.departement = dpt;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public double getSecurite_sociale() {
        return securite_sociale;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement.toString()+'\''+
                '}';
    }
}
