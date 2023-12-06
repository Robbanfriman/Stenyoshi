
import java.util.Scanner;


public class person {

    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
    String type = "";
        
    System.out.println("Enter name");
        String name = scanner.nextLine();
    System.out.println("Enter age");
        int age = scanner.nextInt();
    if (age >50){
        type = "senior";
        System.out.println("hello");
    }
    else if ( age <18)
        type = "junior";
    else
        type = "an adult";
    System.out.println("Enter height");
        double height = scanner.nextDouble();
        
        System.out.println("Your age is " + age + "your height is " + height + "and your name is " + name + "And you are " + type);

    }

}
