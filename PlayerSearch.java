import java.util.ArrayList; 

public class PlayerSearch {
    private static Player player1;
    private static Player player2;
    private ArrayList<Player> players;
    // Constructor that accepts the player list
    public PlayerSearch(ArrayList<Player> players) {
        if (players != null && !players.isEmpty()) {
            this.players = players;
        } else {
            this.players = new ArrayList<>();
        }
    
    }
    
    // Method to add a new player
    public void addPlayer(Player player) {
        if (player != null) {
            players.add(player);
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> playerList = new ArrayList<>();
       
        // Create a new player 
        new Player("Naku Dallo", 30, 290.4, 85.5, 25, 10, 5);
        new Player("Ticoh Dallo", 33, 192.0, 113.3, 20, 11, 4);

        PlayerSearch playerSearch = new PlayerSearch(playerList);

                // Add the players to the playerSearch object
            
                playerSearch.addPlayer(player1);
                playerSearch.addPlayer(player2);

                System.out.println("Player before removal:");
                for(Player player : playerSearch.players) {
                    System.out.println(player);
                }

                playerSearch.removePlayer(null);

                System.out.println("\nPlayers after removal: ");
                for(Player player : playerSearch.players) {
                    System.out.println(player);
                }
        
    }


    // Method to remove players
    public void removePlayer(Player player) {
        if (player != null) {
            players.remove(player);
        }
    }


    // Method to search players by age
    public ArrayList<Player> searchByAge(int targetAge) {
        ArrayList<Player> result = new ArrayList<>();
        for (Player player : players) {
            if (player.getAge() == targetAge) {
                result.add(player);
            }
        }
        return result;
    }


    // Method to search Player by height 

    public ArrayList<Player> searchByHeight(double minHeight, double maxHeight) {
        ArrayList<Player> result = new ArrayList<>();
        for (Player player : players) {
        double height = player.getHeight();
            if (height >= minHeight && height <= maxHeight) {
                result.add(player);
        }
    }
    return result;
}

    // Method to search players by weight range
    /**
     * @param minWeight
     * @param maxWeight
     * @return
     */
    public ArrayList<Player> searchByWeightRange(double minWeight, double maxWeight) {
        ArrayList<Player> result = new ArrayList<>();
        for (Player player : players) {
        double weight = player.getWeight();
         if (weight >= minWeight && weight <= maxWeight) {
            result.add(player);
        }
    }
    return result;    

}


    // Method to search players by name
    /**
     * @param playerName
     * @return
     */
    public ArrayList<Player> searchByName(String playerName) {
        ArrayList<Player> result = new ArrayList<>();
        for (Player player : players) {
        // Case-insensitive search for player names
            if (player.getName().toLowerCase().contains(playerName.toLowerCase())) {
                result.add(player);
            }
        }
        return result;
    }

    public ArrayList<Player> advancedSearch(SearchCriteria criteria) {
        // Implement your advanced search logic here using the criteria
        ArrayList<Player> result = new ArrayList<>();

        // check each criterion and add players that match all criteria
        for(Player player : players) {
            boolean matchesAllCriteria = true;

            if (criteria.getTargetAge() != null && player.getAge() != ((Integer) criteria.getTargetAge()).intValue()) {
            }

            if(criteria.getMinHeight() != null && criteria.getMinHeight() != null) {
                double height = player.getHeight();
                if (height < criteria.getMinHeight() || height > criteria.getMinHeight()) {
                    matchesAllCriteria = false;
                }
            }

            if (criteria.getMinWeight() !=null && criteria.getMaxWeight() != null) {
                double weight =player.getWeight();
                if (weight < criteria.getMinWeight() || weight > criteria.getMaxWeight()) {
                    matchesAllCriteria = false;
                }
            }

            if (matchesAllCriteria) {
                result.add(player);
            }
        }
        return result;

        
    }

}



