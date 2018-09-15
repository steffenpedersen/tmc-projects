
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class NhlStatisticsPart2 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("NHL statistics service");

        while (true) {
            System.out.println("");
            System.out.print("command (points, goals, assists, penalties, player, club, quit): ");
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("points")) {
                NHLStatistics.sortByPoints();
                NHLStatistics.top(10);
            } else if (command.equals("goals")) {
                NHLStatistics.sortByGoals();
                NHLStatistics.top(10);
            } else if (command.equals("assists")) {
                NHLStatistics.sortByAssists();
                NHLStatistics.top(10);
            } else if (command.equals("penalties")) {
                NHLStatistics.sortByPenalties();
                NHLStatistics.top(10);
            } else if (command.equals("player")) {
                System.out.print("Which player's statistics are needed? ");
                String playerStatistics = reader.nextLine();

                NHLStatistics.searchByPlayer(playerStatistics);
            } else if (command.equals("club")) {
                System.out.print("Which club's statistics are needed? ");
                String clubStatistics = reader.nextLine();

                NHLStatistics.sortByPoints();
                NHLStatistics.teamStatistics(clubStatistics);
            }

        }
    }
}
