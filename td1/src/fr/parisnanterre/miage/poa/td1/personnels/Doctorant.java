package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

public class Doctorant extends Etudiant {
    public Doctorant(String nom, String prenom, double securite_sociale, Departements dpt, String bourse) {
        super(nom, prenom, securite_sociale, dpt,bourse);
    }
}
