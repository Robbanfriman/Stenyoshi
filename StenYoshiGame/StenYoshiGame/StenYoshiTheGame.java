package StenYoshiGame;
import java.util.Scanner;

class StenYoshiTheGame {
    private Character player;
    public static Scanner scanner = new Scanner(System.in);
    public String getPlayerName() {
       
        System.out.print("Enter your name: ");
        return scanner.nextLine();
    }
public Character createPlayer(String name, String choice) {
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
    public void startGame() {
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

    public String chooseCharacter() {
        
        System.out.println("Choose your character:");
        System.out.println("1. Sten");
        System.out.println("2. Yoshi");

        System.out.print("Enter the number of your choice: ");
        return scanner.nextLine();
    }
//Level 1
    public void displayOptions(Character player) {
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

    public void goToBed(Character player) {
        System.out.println("You are now rested.");
        displayOptions(player);
    }

    public void startExploring(Character player) {
        System.out.println("You seem to be locked into the bedroom of your pet Elvira. She is now sleeping on the bed.");
        displayOptions(player);
    }

    public void goToDoor(Character player) {
        System.out.println("Elvira woke up. She is moving towards you. She is trying to pick you up.");
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
                livingRoomOptions();
               
                
                break;
            default:
                System.out.println("Invalid choice.");
                System.out.println();
                displayOptions(player);
                break;
        }
    }
    public void backToDoor() {
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
            livingRoomOptions();
            break;
        default:
            System.out.println("Invalid choice.");
            System.out.println();
            backToDoor();
            break;
            
        }
        
    }
    public void livingRoomOptions() {
        System.out.println("You are now in the living room. What do you want to do?");
        System.out.println("1. Look around in the room");
        System.out.println("2. Go back to bedroom");
        
        String Livingroom = scanner.nextLine();
    switch (Livingroom) {
        case "1": 
        System.out.println("You look around in the livingroom and see a couch a table a big tv and a chandelier hanging from the cieling.  ");
            livingRoomActions();
            break;
        case "2": 
        System.out.println("You are now back in the bedroom, Elvira is still knocked out on the floor. do you want to go back to livingroom (yes/no)");
        String goBack = scanner.nextLine();
            if (goBack.equalsIgnoreCase("yes")) {
                System.out.println("You look on your pet for a while and then you head back to the livingroom");
                livingRoomOptions();
            } else if (goBack.equalsIgnoreCase("no"))  {
              System.out.println("You Sleep on bed for a while and then you step on Elvira on the way back to the livingroom");
              livingRoomOptions();
            }
            else {
                System.out.println("Hey you, I asked yes or no!.");
                System.out.println("You feel a bit confused before heading back to the living room");
                livingRoomOptions();
            }

            break;
    
        default:
            System.out.println("Invalid choice.");
            livingRoomOptions();
            break;
        }
    }
    public void livingRoomActions() {
        System.out.println("1. Do you want to crawl under the couch?");
        System.out.println("2. Do you want to jump up on the table?");
        System.out.println("3. Do you want to watch the tv?");
        System.out.println("4. Do you want to examine the chandelier?");

        String livingRoomActions = scanner.nextLine();

    switch (livingRoomActions) {
        case "1":
            System.out.println("You crawl under the couch, you get a bit dusty but you find nothing.");
            System.out.println("You crawl back out again.");
            System.out.println("What do you feel like doing now?");
            livingRoomActions();
            break;
        case "2": 
            System.out.println("You jump up on the table there you find a remote control, you feel like it's time for some normal cat stuff and push it down");
            System.out.println("You then jump back on the floor");
            System.out.println("What do you feel like doing now?");
            livingRoomActions();
            break;
        case "3":
            System.out.println("You move closer to the tv, you see there is a green field with pets chasing something.");
            System.out.println("You feel that it looks fun and you stand up and tries to catch the little round thing.");
            System.out.println("After a while you feel bored and turn your back on the tv and starts licking your tail for a while.");
            System.out.println("What do you feel like doing now? ");
            livingRoomActions();
            break;
        case "4":
            System.out.println("You jump up on the chandelier and it starts swingning.");
            System.out.println("Suddenly the chandelier jumps of the hook and falls to the ground with a loud bang. ");
            System.out.println("Elvira wakes up from the noise and comes into the lvvingroom, she sees the mess and runs towards you");
            System.out.println("This time you cant avoid her so she lifts you up in the neck, and walks towards the entrance.");
            System.out.println("SHe opens the door and throws you out.");
            System.out.println("\"Tonight you will be sleeping outside\" she says.");
            System.out.println("You are now on stage three, the outside.");
            theOutside();
            break;

        default:
            System.out.println("Invalid choice.");
            livingRoomActions();
            break;
    }    
    }
   public void theOutside() {
            System.out.println("You have finally escaped the house, what do you feel like doing first with you new found freedom? ");
            System.out.println("1. Do you want to explore the garden?");
            System.out.println("2. Do you want to go to the road?");
            System.out.println("3. Do you want to try to get back inside");

        String outsideActions = scanner.nextLine();

        switch (outsideActions) {
            
            case "1":
                System.out.println("You look around at grass when you see a mouse running by");
                break;
            
            case "2":
                System.out.println("You start walking down the street when a stranger comes up to you.");
                System.out.println("Its a male pet, he introduces himself as Deni. and gave you some candy");
                System.out.println("You look at the candy in disbelief at first and then when you taste it you feel a sudden kick of energy");
                break;
        
            default:
                System.out.println("Invalid choice.");
                theOutside();
                break;
        }
    }

}
       
        
        
    
