package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

public class Etudiant extends Personnel {
    @Override
    public String toString() {
        return "Etudiant{" +
                "bourse='" + bourse + '\'' +
                '}';
    }

    private String bourse;

    public Etudiant(String nom, String prenom, double securite_sociale, Departements dpt, String bourse) {
        super(nom, prenom, securite_sociale, dpt);
        this.bourse = bourse;
    }
}