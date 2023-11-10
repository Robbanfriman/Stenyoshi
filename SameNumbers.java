import java.util.Scanner;

public class SameNumbers {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.println("Enter second number");
        double secondNumber = scanner.nextDouble();


        if (firstNumber == secondNumber){
        System.out.println("The numbers has the same value ");
        }
        else {System.out.println("The numbers are not the same");

        }

        scanner.close();
    }
    
}
