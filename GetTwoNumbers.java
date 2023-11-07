import java.util.Scanner;

 public class GetTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("You entered the first number: " + firstNumber);
        System.out.println("You entered the second number: " + secondNumber);
   
        System.out.println("Your numbers");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");

        int choice = scanner.nextInt();

        if (choice == 1) {
            double result = addNumbers(firstNumber, secondNumber);
            System.out.println("Result of addition: " + result);
        } else if (choice == 2) {
            double result = subtractNumbers(firstNumber, secondNumber);
            System.out.println("Result of subtraction: " + result);
        } else {
            System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static double addNumbers(double a, double b) {
        return a + b;
    }

    public static double subtractNumbers(double a, double b) {
        return a - b;
    }
}
 