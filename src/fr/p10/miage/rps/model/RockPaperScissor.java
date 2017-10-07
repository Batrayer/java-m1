package fr.p10.miage.rps.model;

public class RockPaperScissor {

    public Result Result_Play(RPSEnum p1, RPSEnum p2){
        if(p1.equals(RPSEnum.ROCK) && p2.equals(RPSEnum.PAPER)){
            return Result.LOST;
        }else if(p1.equals(RPSEnum.ROCK) && p2.equals(RPSEnum.SCISSOR)){
            return Result.WIN;
        }else if(p1.equals(RPSEnum.ROCK)&&p2.equals(RPSEnum.ROCK)){
            return Result.TIE;
        }else if(p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.ROCK)){
            return Result.WIN;
        }else if(p1.equals(RPSEnum.PAPER)&&p2.equals(RPSEnum.SCISSOR)){
            return Result.LOST;
        }else if(p1.equals(RPSEnum.PAPER) && p2.equals(RPSEnum.PAPER)){
            return Result.TIE;
        }else if(p1.equals(RPSEnum.SCISSOR) && p2.equals(RPSEnum.SCISSOR)){
            return Result.TIE;
        }else if(p1.equals(RPSEnum.SCISSOR) && p2.equals(RPSEnum.PAPER)){
            return Result.WIN;
        }else {
            return Result.LOST;
        }
    }
    public Result result_Play(Player p1, Player p2){
        return Result.LOST;
    }
}
