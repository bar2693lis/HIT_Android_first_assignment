package Classs;

import java.util.ArrayList;
import java.util.Random;

public class Tournament{
    private int id;
    private String tournament_name;

    private ArrayList<Match> finished_tournament_mach = new ArrayList<Match>();
    private ArrayList<Match> upcoming_tournament_mach = new ArrayList<Match>();

    public Tournament(String tournament_name) {
        Random rand = new Random();
        this.id = (int)rand.nextInt(100);
        this.tournament_name = tournament_name;
    }

    public int getId() {
        return id;
    }

    public String getTournament_name() {
        return tournament_name;
    }

    public void setTournament_name(String tournament_name) {
        this.tournament_name = tournament_name;
    }

    public void addMatchToList(Match match)
    {
        if("Upcoming".equals(match.getStatus()))
        {
            upcoming_tournament_mach.add(match);
        }
        else
        {
            finished_tournament_mach.add(match);
        }
    }

    public ArrayList<Match> getTournament_mach() {
        return upcoming_tournament_mach;
    }

    @Override
    public String toString() {
        return " Tournament ID = " + id + ", Tournament Name = '" + tournament_name + "\',";
    }
}
