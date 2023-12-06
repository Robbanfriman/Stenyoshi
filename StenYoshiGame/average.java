import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        
     
    Scanner scanner = new Scanner(System.in);

    System.out.println("enter first number");
        int firstNumber = scanner.nextInt();
    System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();
    System.out.println("enter third number");
        int thirdNumber = scanner.nextInt();

        int totalNumber = thirdNumber+secondNumber+firstNumber;

        double average = totalNumber /3;
        
        System.out.println(average);

    }
}
