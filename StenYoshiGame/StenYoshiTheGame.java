package StenYoshiGame;

import java.util.Scanner;

class StenYoshiTheGame {
    public static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }

    public static String chooseCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your character:");
        System.out.println("1. Sten");
        System.out.println("2. Yoshi");

        System.out.print("Enter the number of your choice: ");
        return scanner.nextLine();
    }

    public static void displayOptions(Character player) {
        System.out.println("Choose your next action:");
        System.out.println("1. Go to bed");
        System.out.println("2. Start exploring");
        System.out.println("3. Go to the door");

        Scanner scanner = new Scanner(System.in);
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

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                System.out.println("You let Elvira lift you up.");
                System.out.println("Do you want to go to the door again? (yes/no)");
                String goAgain = scanner.nextLine();
                if (goAgain.equalsIgnoreCase("yes")) {
                    goToDoor(player);
                } else {
                    displayOptions(player);
                }
                break;
            case "2":
                System.out.println("Elvira fumbles and trips on the door. The door is now open.");
                System.out.println("You are now on stage two, the living room.");
                // Add code for stage two (living room) here...
                break;
            default:
                System.out.println("Invalid choice.");
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
                return new Sten(name);
        }
    }

    public static void startGame() {
        System.out.println("Welcome to StenYoshiTheGame!");

        String name = getPlayerName();
        String choice = chooseCharacter();

        Character player = createPlayer(name, choice);

        System.out.println("Welcome, " + player.name + "! Your adventure begins...");
        player.displayStats();

        displayOptions(player);
    }
}