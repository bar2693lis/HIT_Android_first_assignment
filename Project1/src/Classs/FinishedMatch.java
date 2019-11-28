package Classs;

import java.util.Random;

public class FinishedMatch extends Match{
    private String score;

    public FinishedMatch(Team team1, Team team2, Tournament tournament) {
        super("Played", team1, team2, tournament);
        this.score = Score();
    }

    private String Score()
    {
        Random rand = new Random();
        int score1 = rand.nextInt(5);
        int score2 = rand.nextInt(5);
        return score1 + " : " + score2;
    }

    @Override
    public String toString() {
        return super.toString() + " Score = '" + score + "\'\n";
    }
}
