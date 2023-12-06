import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result =0; 
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        for (int i = 10; i >=5; i--) {

             result = number * i;
             System.out.println(i +"x" +number+"="+result);
        }


    }
}
