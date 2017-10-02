package fr.p10.miage.rps.model;

public enum RPSEnum {
    ROCK("Rock"),
    PAPER("Paper"),
    SCISSOR("Scissor");

    private String choix;

    RPSEnum(String RPS) {
        this.choix = RPS;
    }

    public String getChoix() {
        return choix;
    }
}
