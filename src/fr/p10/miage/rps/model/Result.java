package fr.p10.miage.rps.model;

public enum Result {
    WIN("win"),
    LOST("lost"),
    TIE("tie");

    private String res;

    Result(String res){
        this.res = res;
    }

    public String getResult() {
        return res;
    }
}
