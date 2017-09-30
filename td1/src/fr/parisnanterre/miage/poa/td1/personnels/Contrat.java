package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public abstract class Contrat {
    private double salaire;
    private Date debut;

    double getSalaire() {
        return salaire;
    }

    Date getDebut() {
        return debut;
    }

    @Override
    public String toString() {
        return "Contrat{" +
                "salaire=" + salaire +
                ", debut=" + debut +
                '}';
    }

    void setSalaire(double salaire){
        this.salaire = salaire;
    }

    Contrat(double salaire, Date debut) {

        this.salaire = salaire;
        this.debut = debut;
    }
}
