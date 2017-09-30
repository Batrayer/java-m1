package fr.parisnanterre.miage.poa.td1.personnels;

public class Etudiant extends Personnel {
    @Override
    public String toString() {
        return "Etudiant{" +
                "bourse='" + bourse + '\'' +
                '}';
    }

    private String bourse;

    Etudiant(String nom, String prenom, double securite_sociale, String bourse) {
        super(nom, prenom, securite_sociale);
        this.bourse = bourse;
    }
}