package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public final class Bibliothequaire extends Biatoss {
    @Override
    public String toString() {
        return "Bibliothequaire{}";
    }


    public Bibliothequaire(String nom, String prenom, double securite_sociale, Date debut_Contrat, Date fin_Contrat, double salaire) {
        super(nom, prenom, securite_sociale, debut_Contrat, fin_Contrat, salaire);
    }
}
