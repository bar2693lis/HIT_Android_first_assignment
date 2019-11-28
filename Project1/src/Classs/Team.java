package Classs;

import java.util.ArrayList;
import java.util.Random;

public class Team{
    private int id;
    private String team_name;

    private   ArrayList<Match> upcoming_team_mach = new ArrayList<Match>();
    private   ArrayList<Match> finished_team_mach = new ArrayList<Match>();

    public Team(String team_name) {
        Random rand = new Random();
        this.id = (int)rand.nextInt(100);
        this.team_name = team_name;
    }

    public int getId() {
        return id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public ArrayList<Match> getUpcoming_team_mach() {
        return upcoming_team_mach;
    }

    public void addMatchToList(Match match)
    {
        if("Upcoming".equals(match.getStatus()))
        {
            upcoming_team_mach.add(match);
        }
        else
        {
            finished_team_mach.add(match);
        }
    }

    public void endGame (int endGameNumber)
    {
        FinishedMatch endGame = new FinishedMatch(upcoming_team_mach.get(endGameNumber).getTeam1(),upcoming_team_mach.get(endGameNumber).getTeam2(), upcoming_team_mach.get(endGameNumber).getTournament());
        addMatchToList(endGame);
        upcoming_team_mach.remove(endGameNumber);
        System.out.println("\n" + finished_team_mach);
    }

    @Override
    public String toString() {
        return getTeam_name() + ',' + " Team ID = " + getId();
    }
}
