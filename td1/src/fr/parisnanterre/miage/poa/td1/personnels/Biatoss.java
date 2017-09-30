package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

import java.util.Date;

public class Biatoss extends Personnel {
    private Contrat contrat;

    public Biatoss(String nom, String prenom, double securite_sociale, Departements dpt, Contrat contrat) {
        super(nom, prenom, securite_sociale, dpt);
        this.contrat = contrat;
    }

    public double getSalaire(){ return contrat.getSalaire();}
    public Date getDebut(){ return contrat.getDebut();}

    @Override
    public String toString() {
        return "Biatoss{" +
                "contrat=" + contrat +
                '}';
    }

    public Date getFin(){ return ((CDD)contrat).getFin();}

}
