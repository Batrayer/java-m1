package fr.parisnanterre.miage.poa.td1.personnels;

import fr.parisnanterre.miage.poa.td1.departements.Departements;

import java.util.Date;

public abstract class EnseignantTemporaire extends Enseignant {

    @Override
    public String toString() {
        return "EnseignantTemporaire{" +
                "fin_Contrat=" + getFin_Contrat() +
                '}';
    }

    public Date getFin_Contrat() {
        return ((CDD)contrat).getFin();
    }

    EnseignantTemporaire(String nom, String prenom, double securite_sociale, Departements dpt, CDD contrat) {
        super(nom, prenom, securite_sociale, dpt,contrat);
    }
}
