
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {

        System.out.println("Top 10 by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top 25 by penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();

        System.out.println("Anaheim Ducks");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
    }
}
