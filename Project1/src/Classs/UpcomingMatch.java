package Classs;

import java.time.LocalTime;

public class UpcomingMatch extends Match{
    private LocalTime kick_off_time;


    public UpcomingMatch(Team team1, Team team2, Tournament tournament) {
        super("Upcoming", team1, team2, tournament);
        this.kick_off_time = LocalTime.now();
    }

    @Override
    public String toString() {
        return super.toString() + " Kick Off Time = " + kick_off_time + "\n";
    }
}
