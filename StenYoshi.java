import java.util.Scanner;

public class StenYoshi {
    public static void main(String[] args) {
        Character player = new Character("Hero", 100, 10);
        int playerPosition = 1;

        Dice dice = new Dice();

        int boardLength = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Adventure Game!");

        while (playerPosition <= boardLength && player.isAlive()) {
            System.out.println("Current Position: " + playerPosition);
            System.out.println("Player Health: " + player.getHealth());

            System.out.println("Choose an option:");
            System.out.println("1. Roll the dice");
            System.out.println("2. Go to base");

            int choice = scanner.nextInt();

            if (choice == 1) {
                int diceRoll = dice.roll();
                System.out.println("You rolled a " + diceRoll);

                playerPosition += diceRoll;

                if (playerPosition > boardLength) {
                    playerPosition = boardLength;
                }

                if (playerPosition % 5 == 0) {
                    Enemies monster = new Enemies("Monster", 30, 8);
                    System.out.println("You encounter a " + monster.getName() + "!");
                    while (player.isAlive() && monster.isAlive()) {
                        int playerAttack = dice.roll() * player.getAttackPower();
                        int monsterAttack = dice.roll() * monster.getAttackPower();

                        System.out.println("You attack the " + monster.getName() + " for " + playerAttack + " damage.");
                        monster.takeDamage(playerAttack);

                        System.out.println(monster.getName() + " attacks you for " + monsterAttack + " damage.");
                        player.takeDamage(monsterAttack);

                        System.out.println("Your Health: " + player.getHealth());
                        System.out.println(monster.getName() + " Health: " + monster.getHealth());
                    }

                    if (player.isAlive()) {
                        System.out.println("You defeated the " + monster.getName() + "!");
                    } else {
                        System.out.println("You were defeated by the " + monster.getName() + "!");
                    }
                }
            } else if (choice == 2) {
                int healthRestored = 20; 
                player.heal(healthRestored);
                System.out.println("You went to the base and restored " + healthRestored + " health.");
            }

            if (playerPosition == boardLength) {
                System.out.println("Congratulations! You've reached the end of the game.");
            }

            if (!player.isAlive()) {
                System.out.println("Game over! You've been defeated.");
            }
        }

        scanner.close();
    }
}
