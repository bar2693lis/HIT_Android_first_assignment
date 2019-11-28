package Classs;

import java.time.LocalDate;

public abstract class Match {
    private String status; // upcoming or played
    private Team team1;
    private Team team2;
    private LocalDate start_date;
    private Tournament tournament;

    public Match(String status, Team team1, Team team2, Tournament tournament) {
        this.status = status;
        this.team1 = team1;
        this.team2 = team2;
        this.start_date = LocalDate.now();
        this.tournament = tournament;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    @Override
    public String toString() {
        return "Match: Status = '" + status + '\'' + ", Team 1 = " + team1 + ", Team 2 = " + team2 + ", Start Date = " + start_date + "," + tournament;
    }
}
