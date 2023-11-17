package StenYoshiGame;

import java.util.Scanner;

public class TheGame {
        private Character player;
    public static Scanner scanner = new Scanner(System.in);
    public String getPlayerName() {
       
        System.out.print("Enter your name: ");
        return scanner.nextLine();
}
}
