package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public class Biatoss extends Personnel {
    private Contrat contrat;

    Biatoss(String nom, String prenom, double securite_sociale, Contrat contrat) {
        super(nom, prenom, securite_sociale);
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
