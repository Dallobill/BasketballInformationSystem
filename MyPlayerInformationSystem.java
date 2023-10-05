import java.util.ArrayList;
import java.util.Scanner;

public class MyPlayerInformationSystem {
    private ArrayList<Player> players;
    private Scanner scanner;

    public MyPlayerInformationSystem() {
        players = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        MyPlayerInformationSystem system = new MyPlayerInformationSystem();
        system.run();
    }
    // Method to run the main program loop
    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("MyPlayer Information System");
            System.out.println("1. Add Player");
            System.out.println("2. Edit Player");
            System.out.println("3. View Player");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            // Use a swtich statement to handle different user choices
            switch (choice) {
                case 1:
                    // Call the addPlayer() method to add a new player
                    addPlayer();
                    break;
                case 2:
                    System.out.print("Enter player name to edit: ");
                    String nameToEdit = scanner.nextLine();
                    // Call the editPlayer() method with the provided player name 
                    editPlayer(nameToEdit);
                    break;
                case 3:
                    // Set exit to true to exit the proram loop
                    exit = true;
                    break;
                default:
                    // Handle invalid choices
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        // Close the Scanner to release resources
        scanner.close();
    }
    // Add a new player
    private void addPlayer() {
    System.out.println("Adding a new player:");
    System.out.print("Enter player name: ");
    String name = scanner.nextLine();

    System.out.print("Enter player age: ");
    int age = scanner.nextInt();

    System.out.print("Enter player height (in cm): ");
    double height = scanner.nextDouble();

    System.out.print("Enter player weight (in kg): ");
    double weight = scanner.nextDouble();

    // Create a new player and add them to the list
    Player newPlayer = new Player(name, age, height, weight, weight, age, age);
    players.add(newPlayer);

    System.out.println("Player added successfully.");
}

// Method to edit player information by name
public void editPlayer(String name) {
    Player playerToEdit = getPlayerByName(name);

    if (playerToEdit != null) {
        System.out.println("Editing player: " + playerToEdit.getName());

        // Allow the user to update player attributes
        System.out.print("Enter new age: ");
        int newAge = scanner.nextInt();
        playerToEdit.setAge(newAge);

        System.out.print("Enter new height (in cm): ");
        double newHeight = scanner.nextDouble();
        playerToEdit.setHeight(newHeight);

        System.out.print("Enter new weight (in kg): ");
        double newWeight = scanner.nextDouble();
        playerToEdit.setWeight(newWeight);

        // You can add similar prompts for other attributes as needed

        System.out.println("Player information updated successfully.");
    } else {
        System.out.println("Player not found.");
    }
}

public void deletePlayer() {
    System.out.println("Deleting a player:");
    System.out.print("Enter the name of the player you want to delete: ");
    String nameToDelete = scanner.nextLine();

    Player playerToDelete = getPlayerByName(nameToDelete);

    if (playerToDelete != null) {
        players.remove(playerToDelete);
        System.out.println("Player " + nameToDelete + " has been deleted.");
    } else {
        System.out.println("Player not found. Deletion failed.");
    }
}

// Method to calculatge and display player stats
public void calculateAndDisplayStats() {
    // Calculate average points per game
    double totalPoints = 0.0;
    int numberOfPlayers = players.size();

    for(Player player : players) {
        totalPoints += player.getPointsScored();
    }

    double averagePoints = totalPoints / numberOfPlayers;

    // Display the calculated Stats
    System.out.println("Player Stats: ");
    System.out.println("Points per game: " + averagePoints);
    System.out.println("Assist per game: ");
    System.out.println("Rebounds per game: ");
    System.out.println("Steals per game: ");
    System.out.println("Blocks per game: ");
}

public void viewPlayers() {
    System.out.println("List of Players: ");
    for (Player player : players) {
        System.out.println(player);
    }
}

private Player getPlayerByName(String name) {
    return null;
}

}
