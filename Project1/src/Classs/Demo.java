package Classs;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
    static ArrayList<Team> teams = new ArrayList<Team>();
    static ArrayList<Tournament> tournaments = new ArrayList<Tournament>();

    public static <teams, tournaments> void main(String[] args) {

        teams.add(new Team("Liverpool"));
        teams.add(new Team("Manchester City"));
        teams.add(new Team("Barcelona"));
        teams.add(new Team("Bayern München"));
        teams.add(new Team("Juventus"));
        teams.add(new Team("Ajax Amsterdam"));
        teams.add(new Team("Paris Saint-Germain"));
        teams.add(new Team("Chelsea FC"));
        teams.add(new Team("Atlético Madrid"));
        teams.add(new Team("Real Madrid"));

        tournaments.add(new Tournament("AFC")); // Asian Football
        tournaments.add(new Tournament("CAF")); // African Football
        tournaments.add(new Tournament("CONCACAF")); // North, Central American and Caribbean Football
        tournaments.add(new Tournament("CONMEBOL")); // South America Football
        tournaments.add(new Tournament("OFC")); // Oceania Football
        tournaments.add(new Tournament("UEFA")); // Union of European Football

        Scanner scan = new Scanner(System.in);
        int play = 1;
        while(play == 1)
        {
            System.out.println("\nChoose your team and select her number:");
            for(int i = 0 ; i < 10 ; i++)
            {
                int j = i+1;
                System.out.println("#" + j + " " + teams.get(i).getTeam_name());
            }
            int team1Number = scan.nextInt();
            --team1Number;

            System.out.println("\nChoose a team to compete against and select her number:");
            for(int i = 0 ; i < 10 ; i++)
            {
                if(i != team1Number)
                {
                    int j = i+1;
                    System.out.println("#" + j + " " + teams.get(i).getTeam_name());
                }
            }
            int team2Number = scan.nextInt();
            --team2Number;

            System.out.println("\nChoose a tournament to compete in and select his number:");
            for(int i = 0 ; i < 6 ; i++)
            {
                int j = i+1;
                System.out.println("#" + j + " " + tournaments.get(i).getTournament_name());
            }
            int tournamentNumber = scan.nextInt();
            --tournamentNumber;

            UpcomingMatch upcomingMatch = new UpcomingMatch(teams.get(team1Number), teams.get(team2Number), tournaments.get(tournamentNumber));
            teams.get(team1Number).addMatchToList(upcomingMatch);
            teams.get(team2Number).addMatchToList(upcomingMatch);
            tournaments.get(tournamentNumber).addMatchToList(upcomingMatch);

            System.out.println("\nOn this date " +upcomingMatch.getStart_date()+ " these teams will play");

            System.out.println("\nDo you want to end a match for one of the teams? YES = 1 or NO = 0 ");
            int answer = scan.nextInt();
            while(answer == 1)
            {
                System.out.println("\nChoose your team you want to end her match and select her number:");
                for(int i = 0 ; i < 10 ; i++)
                {
                    int j = i+1;
                    System.out.println("#" + j + " " + teams.get(i).getTeam_name());
                }
                int teamNumber = scan.nextInt();
                --teamNumber;

                System.out.println("\nWhat match would you like to end?");
                System.out.println(teams.get(teamNumber).getUpcoming_team_mach());
                int endGameNumber = scan.nextInt();
                --endGameNumber;

                teams.get(teamNumber).endGame(endGameNumber);
                System.out.println("\nDo you want to end another match for one of the teams? YES = 1 or NO = 0 ");
                answer = scan.nextInt();
            }
            System.out.println("\nDo you want to see all the matches of a particular tournament? YES = 1 or NO = 0 ");
            answer = scan.nextInt();
            while(answer == 1)
            {
                System.out.println("\nChoose the tournament you want to watch");
                for(int i = 0 ; i < 6 ; i++)
                {
                    int j = i+1;
                    System.out.println("#" + j + " " + tournaments.get(i).getTournament_name());
                }
                tournamentNumber = scan.nextInt();
                --tournamentNumber;

                System.out.println(tournaments.get(tournamentNumber).getTournament_mach());

                System.out.println("\nWant to see more tournament games?YES = 1 or NO = 0 ");
                answer = scan.nextInt();
            }

            System.out.println("\nDo you want to play again? YES = 1 or NO = 0 ");
            play = scan.nextInt();
        }
        System.out.println("Good Bye");
    }
}
