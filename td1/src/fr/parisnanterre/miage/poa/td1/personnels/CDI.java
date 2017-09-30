package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public class CDI extends Contrat {
    @Override
    public String toString() {
        return "CDI{}";
    }

    public CDI(int salaire, Date debut) {
        super(salaire, debut);
    }
}

