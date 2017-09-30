package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public abstract class Enseignant extends Personnel {
    protected Contrat contrat;

    Enseignant(String nom, String prenom, double securite_sociale, Contrat contrat) {
        super(nom, prenom, securite_sociale);
        this.contrat = contrat;
    }



    public double getSalaire() {
        return this.contrat.getSalaire();
    }

    public Date getDebut() {
        return this.contrat.getDebut();
    }

}
