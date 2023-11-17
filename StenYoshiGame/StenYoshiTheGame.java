package StenYoshiGame;
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
                System.out.println("You are now on stage two, the livingroom.");
                
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
}

