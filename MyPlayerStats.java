import java.util.ArrayList;

public class MyPlayerStats {
    private ArrayList<Player> players;

    public MyPlayerStats(ArrayList<Player> player) {
        this.players = players;
    }

    public double calculateAveragePoints() {
        double totalPoints = 0;
        for(Player player : players) {
            totalPoints += player.getPointsScored();
        }
        return totalPoints / players.size();
    }

    public double calculateAverageRebounds() {
        double totalRebounds = 0;
        for (Player player : players) {
            totalRebounds += player.getRebounds();
        }
        return totalRebounds / players.size();
    }

    public double calculateAverageAssits() {
        double totalAssists = 0;
        for(Player player : players) {
            totalAssists += player.getAssists();
        }
        return totalAssists / players.size();
    }

    public void generateReport(Player player) {
        System.out.println("Player Report for: "+player.getName());
        System.out.println("Age: " + player.getAge());
        System.out.println("Points Scored: " + player.getPointsScored());
        System.out.println("Rebounds: " + player.getRebounds());
        System.out.println("Assists: " + player.getAssists());
        System.out.println("-----------------------------");
    }

    public void generateTeamReport() {
        System.out.println("Team Report");
        System.out.println("Average Points Scored: " + calculateAveragePoints());
        System.out.println("Average Assists: " + calculateAverageAssits());
        System.out.println("------------------------------------------");
    }
    
}
