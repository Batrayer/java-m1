package fr.parisnanterre.miage.poa.td1.personnels;

import java.util.Date;

public class CDD extends Contrat {
    private Date fin;

    @Override
    public String toString() {
        return "CDD{" +
                "fin=" + fin +
                '}';
    }

    public CDD(int salaire, Date debut, Date fin) {
        super(salaire, debut);
        this.fin = fin;
    }

    public Date getFin() {
        return fin;
    }
}
