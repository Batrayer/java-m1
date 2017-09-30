package fr.parisnanterre.miage.poa.td1.personnels;

public class Secretaire extends Biatoss{
    @Override
    public String toString() {
        return "Secretaire{}";
    }

    public Secretaire(String nom, String prenom, double securite_sociale, Contrat contrat) {
        super(nom, prenom, securite_sociale, contrat);
    }
}
