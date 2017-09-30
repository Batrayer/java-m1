package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

import java.util.Date;

public abstract class Enseignant extends Personnel {
    protected Contrat contrat;

    public Enseignant(String nom, String prenom, double securite_sociale, Departements dpt, Contrat contrat) {
        super(nom, prenom, securite_sociale, dpt);
        this.contrat = contrat;
    }

    public double getSalaire() {
        return this.contrat.getSalaire();
    }

    public Date getDebut() {
        return this.contrat.getDebut();
    }

}
