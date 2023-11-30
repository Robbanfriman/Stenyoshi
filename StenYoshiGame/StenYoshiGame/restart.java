package StenYoshiGame;
import java.util.Scanner;
public class restart {
    public void playAgain(){
    
    Scanner scanner = new Scanner(System.in);
    StenYoshiTheGame game = new StenYoshiTheGame();
        while (true) {
            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.nextLine();
            
            if (playAgain.equalsIgnoreCase("yes")) {
                game.startGame();
            } 
            else if (playAgain.equalsIgnoreCase("no")) {
                System.out.println("Thanks for playing. Have a good day!");
                break;
            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }
        }
        scanner.close();
    }

}
    
     
