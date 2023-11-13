
    import java.util.Random;

class Step {
    private String event;

    // Constructor
    public Step(String event) {
        this.event = event;
    }

    // Getter for the event
    public String getEvent() {
        return event;
    }
}

class GameWorld {
    private Random random;
    private Character sten;
    private Character yoshi;

    // Constructor
    public GameWorld(Character sten, Character yoshi) {
        this.random = new Random();
        this.sten = sten;
        this.yoshi = yoshi;
    }

    // Method to simulate a dice roll
    private int rollDice() {
        return random.nextInt(6) + 1; // Simulating a 6-sided dice
    }

    // Method to get a random event for a step
    private String getRandomEvent() {
        String[] events = {"Monster Encounter", "Move forward 7 steps", "Move backward 2 steps", "Find a treasure", "Meet a friendly NPC", /* add more events as needed */};
        int randomIndex = random.nextInt(events.length);
        return events[randomIndex];
    }

    // Method to handle different types of events
    private void handleEvent(Step step) {
        String event = step.getEvent();
        switch (event) {
            case "Monster Encounter":
                // Implement combat system or math quiz-based combat
                boolean isVictorious = sten.engageInCombat();
                if (isVictorious) {
                    System.out.println("You defeated the monster and gained experience!");
                    // Update character stats based on the outcome
                } else {
                    System.out.println("You were defeated by the monster. Try again!");
                    // Update character stats (e.g., reduce health) based on the outcome
                }
                break;
            case "Move forward 2 steps":
                // Update character position
                break;
            case "Move backward 2 steps":
                // Update character position
                break;
            case "Find a candy":
                // Implement logic for finding a treasure
                break;
            case "Deni brings candy":
                // Implement interaction with a friendly NPC
                break;
            // Add more cases for additional events
            default:
                // Handle unknown events or add more custom events
                break;
        }
    }

    // Method to simulate a level in the game world
    public void playLevel(int level) {
        System.out.println("=== Level " + level + " ===");

        // 15 steps
        for (int stepNumber = 1; stepNumber <= 15; stepNumber++) {
            System.out.println("Step " + stepNumber);

            // Dice rolling
            int diceRoll = rollDice();

            // Get a random event for the step
            String event = getRandomEvent();
            Step step = new Step(event);

            // Display the event
            System.out.println("Event: " + step.getEvent());

            // Handle the event based on its type
            handleEvent(step);

            // Allow user input for decisions
            System.out.println("Press Enter to continue...");
            new java.util.Scanner(System.in).nextLine();
        }

        System.out.println("=== End of Level " + level + " ===");
    }
}

public class AdventureGame {
    public static void main(String[] args) {
        Character sten = new Character("Sten", 1, 100, 10, 5);
        Character yoshi = new Character("Yoshi", 1, 100, 8, 8);

        GameWorld gameWorld = new GameWorld(sten, yoshi);

        // Game loop for three levels
        for (int level = 1; level <= 3; level++) {
            gameWorld.playLevel(level);
        }

        System.out.println("Congratulations! You completed the adventure!");
}
}
