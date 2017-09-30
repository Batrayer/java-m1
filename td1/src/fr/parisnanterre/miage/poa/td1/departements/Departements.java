package fr.parisnanterre.miage.poa.td1.departements;

import fr.parisnanterre.miage.poa.td1.personnels.Personnel;

import java.util.List;

public abstract class Departements {
    private List<Personnel> personnels;
/*

*/

    Departements()
    {

    }

    public boolean add(Personnel p){
        if(personnels.contains(p)){
            return false;
        }else{
            personnels.add(p);
            return true;
        }
    }


    public boolean remove(Personnel p){
        if(!(personnels.contains(p))){
            return false;
        }else{
            personnels.remove(p);
            return true;
        }
    }
    @Override
    public String toString() {
        return "Departements{}";
    }
}
