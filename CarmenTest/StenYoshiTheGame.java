package CarmenTest;
import java.util.Scanner;

class StenYoshiTheGame {
    private static Character player;
     static Scanner scanner = new Scanner(System.in);
    public static String getPlayerName() {
       
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static void startGame() {
        System.out.println("Welcome to StenYoshiTheGame!");
        String name = getPlayerName();
        String choice = chooseCharacter();
        Character player = createPlayer(name, choice);

        System.out.println("Welcome, " + player.name + "! Your adventure begins...");
        player.displayStats();
        System.out.println("   /\\_/\\   ");
        System.out.println("  / o - \\  ");
        System.out.println(" (   \"   ) ");
        System.out.println("  \\~(*)~/  ");
        System.out.println("   // \\\\   "); 

        displayOptions(player);
    }

    public static String chooseCharacter() {
        
        System.out.println("Choose your character:");
        System.out.println("1. Sten");
        System.out.println("2. Yoshi");

        System.out.print("Enter the number of your choice: ");
        return scanner.nextLine();
    }
//Level 1
    public static void displayOptions(Character player) {
        System.out.println("Choose your next action:");
        System.out.println("1. Go to bed");
        System.out.println("2. Start exploring");
        System.out.println("3. Go to the door");

        
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                goToBed(player);
                break;
            case "2":
                startExploring(player);
                break;
            case "3":
                goToDoor(player);
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println();
                displayOptions(player);
                break;
        }
    }

    public static void goToBed(Character player) {
        System.out.println("You are now rested.");
        displayOptions(player);
    }

    public static void startExploring(Character player) {
        System.out.println("You seem to be locked into the bedroom of your pet Elvira. She is now sleeping on the bed.");
        displayOptions(player);
    }

    public static void goToDoor(Character player) {
        System.out.println("Elvira woke up. She is moving towards you.");
        System.out.println("1. Let her lift you up.");
        System.out.println("2. Avoid Elvira.");
    
        String choice = scanner.nextLine();
    
        switch (choice) {
            case "1":
                System.out.println("You let Elvira lift you up.");
                System.out.println("Do you want to go to the door again? (yes/no)");
                String goAgain = scanner.nextLine();
                if (goAgain.equalsIgnoreCase("yes")) {
                    backToDoor();
                } else {
                    displayOptions(player);
                }
                break;
            case "2":
                System.out.println("Elvira fumbles and trips on the door. The door is now open.");
                System.out.println("You are now on stage two, the living room.");
                level2();  // Add this line to go to the next stage
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println();
                displayOptions(player);
                break;
        }
    }    

    public static Character createPlayer(String name, String choice) {
        switch (choice) {
            case "1":
                return new Sten(name);
            case "2":
                return new Yoshi(name);
            default:
                System.out.println("Invalid choice. Defaulting to Sten.");
                System.out.println();
                return new Sten(name);
        }
    }

    public static void backToDoor() {
        System.out.println("You're back at the door");
        System.out.println("1. Let her lift you up again.");
        System.out.println("2. Avoid Elvira this time.");

        
        String choice = scanner.nextLine();

switch (choice) {
        case "1":
            System.out.println("You let Elvira lift you up again.");
            System.out.println("Do you want to go to the door again? (yes/no)");
            String goAgain = scanner.nextLine();
            if (goAgain.equalsIgnoreCase("yes")) {
                backToDoor();
            } else {
                displayOptions(player);
            }
            break;
        case "2":
            System.out.println("Elvira fumbles and trips on the door. The door is now open.");
            System.out.println("You are now on stage two, the living room.");
            // Continue the story or add more options here
            break;
        default:
            System.out.println("Invalid choice.");
            System.out.println();
            backToDoor();
            break;
        }
    }





/// work in progress
    public static void level2() {
        System.out.println("Welcome to stage two, the living room!");
        System.out.println("You are now in the living room. Explore the area:");
        System.out.println("1. Examine the furniture");
        System.out.println("2. Look out the window");
        System.out.println("3. Check the TV");

        String choice = scanner.nextLine();

    switch (choice) {
            case "1":
                examineFurniture();
                break;
            case "2":
                lookOutTheWindow();
                break;
            case "3":
                checkTV();
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println();
                level2();
                break;
        }
    }

    private static void examineFurniture() {
        System.out.println("You examine the furniture and find a hidden key.");
        System.out.println("This key might be useful. Take it?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("You took the key. It might open a locked door.");
                // Add more story or options here
                break;
            case "2":
                System.out.println("You decided not to take the key. Continue exploring.");
                // Add more story or options here
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println();
                examineFurniture(); // Repeat the options if an invalid choice is made
                break;
        }
    }

    private static void lookOutTheWindow() {
        System.out.println("You look out the window and see a beautiful garden.");
        System.out.println("There's a door leading to the garden. Open it?");
        System.out.println("1. Yes");
        System.out.println("2. No");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("You opened the door and stepped into the garden.");
                
                break;
            case "2":
                System.out.println("You decided not to open the door. Continue exploring.");
                
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println();
                lookOutTheWindow();
                break;
        }
    }

    private static void checkTV() {
        System.out.println("You check the TV, and it turns on. A mysterious message plays.");
        System.out.println("It says, 'To unlock the next stage, find the hidden code.'");
        System.out.println("1. Search for the hidden code");
        System.out.println("2. Ignore the message");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("You search for the hidden code and find it under the sofa.");
                System.out.println("Stage 2 is now unlocked!");
               
                break;
            case "2":
                System.out.println("You decided to ignore the message. Continue exploring.");
                
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println();
                checkTV();
                break;
        }
    }

public static void level3() {
    System.out.println("Welcome to stage three, the kitchen!");
    System.out.println("You find yourself in a mysterious kitchen. Explore the area:");

    // Add more options for the kitchen
    System.out.println("1. Open the fridge");
    System.out.println("2. Check the cabinets");
    System.out.println("3. Inspect the dining table");

    String choice = scanner.nextLine();

    switch (choice) {
        case "1":
            openFridge();
            break;
        case "2":
            checkCabinets();
            break;
        case "3":
            inspectDiningTable();
            break;
        default:
            System.out.println("Invalid choice.");
            System.out.println();
            level3(); // Repeat the options if an invalid choice is made
            break;
    }
}

private static void openFridge() {
    System.out.println("You open the fridge and find a strange potion.");
    System.out.println("Drink the potion?");
    System.out.println("1. Yes");
    System.out.println("2. No");

    String choice = scanner.nextLine();

    switch (choice) {
        case "1":
            System.out.println("You drank the potion. Something feels different...");
            // Add more story or options here
            break;
        case "2":
            System.out.println("You decided not to drink the potion. Continue exploring.");
            // Add more story or options here
            break;
        default:
            System.out.println("Invalid choice.");
            System.out.println();
            openFridge(); // Repeat the options if an invalid choice is made
            break;
    }
}

private static void checkCabinets() {
    System.out.println("You check the cabinets and find a locked box.");
    System.out.println("Try to open the box?");
    System.out.println("1. Yes");
    System.out.println("2. No");

    String choice = scanner.nextLine();

    switch (choice) {
        case "1":
            openBox();
            break;
        case "2":
            System.out.println("You decided not to open the box. Continue exploring.");
            // Add more story or options here
            break;
        default:
            System.out.println("Invalid choice.");
            System.out.println();
            checkCabinets(); // Repeat the options if an invalid choice is made
            break;
    }
}

private static void openBox() {
    System.out.println("You successfully opened the box and found a magical wand.");
    System.out.println("The wand seems to have some power. Take it?");
    System.out.println("1. Yes");
    System.out.println("2. No");

    String choice = scanner.nextLine();

    switch (choice) {
        case "1":
            System.out.println("You took the magical wand. It might be useful on your journey.");
            // Add more story or options here
            break;
        case "2":
            System.out.println("You decided not to take the wand. Continue exploring.");
            // Add more story or options here
            break;
        default:
            System.out.println("Invalid choice.");
            System.out.println();
            openBox(); // Repeat the options if an invalid choice is made
            break;
    }
}

private static void inspectDiningTable() {
    System.out.println("You inspect the dining table and find a mysterious puzzle.");
    System.out.println("Solve the puzzle?");
    System.out.println("1. Yes");
    System.out.println("2. No");

    String choice = scanner.nextLine();

    switch (choice) {
        case "1":
            solvePuzzle();
            break;
        case "2":
            System.out.println("You decided not to solve the puzzle. Continue exploring.");
            // Add more story or options here
            break;
        default:
            System.out.println("Invalid choice.");
            System.out.println();
            inspectDiningTable(); // Repeat the options if an invalid choice is made
            break;
    }
}

private static void solvePuzzle() {
    System.out.println("You successfully solved the puzzle and revealed a hidden door.");
    System.out.println("Open the door?");
    System.out.println("1. Yes");
    System.out.println("2. No");

    String choice = scanner.nextLine();

    switch (choice) {
        case "1":
            System.out.println("You opened the door and entered a magical realm.");
            System.out.println("Congratulations! You completed the game!");
            // Add more concluding story or options here
            break;
        case "2":
            System.out.println("You decided not to open the door. Continue exploring.");
            // Add more story or options here
            break;
        default:
            System.out.println("Invalid choice.");
            System.out.println();
            solvePuzzle(); // Repeat the options if an invalid choice is made
            break;
    }
  }
}
