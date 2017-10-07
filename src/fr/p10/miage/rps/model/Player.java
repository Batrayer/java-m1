package fr.p10.miage.rps.model;

import java.util.List;
import java.util.Random;

public class Player {
    private String nom;
    private int score;
    private List<RPSEnum> moves;

    public Player(String nom, List<RPSEnum> moves) {
        this.nom = nom;
        this.moves = moves;
    }

    public Player(String nom) {
        int j;
        Random r = new Random();
        this.nom = nom;
        for(int i=0;i<10;i++){
            j = r.nextInt(3);
            if(j == 0){
                moves.add(RPSEnum.ROCK);
            }else if(j == 1){
                moves.add(RPSEnum.PAPER);
            }else{
                moves.add(RPSEnum.SCISSOR);
            }
        }
    }

    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public int getMoveNum(){
        return moves.size();
    }

    public void setScore(int score) {
        this.score = score;
    }
}
