import java.util.Scanner;

public class boolleee {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");

        // Read the user's input as an integer
        int age = scanner.nextInt();

        // TODO: Write the logic to check eligibility using a boolean variable
        boolean isEligible = age >=18;

        // Display the result based on eligibility
        if (isEligible) {
            System.out.println("You are eligible to vote. Exercise your right!");
        } else {
            System.out.println("Sorry, you are not eligible to vote yet. Wait for a few more years!");
        }

        // Close the Scanner to prevent resource leak
        scanner.close();
    }
}