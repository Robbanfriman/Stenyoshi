    
import java.util.Scanner;
public class whileloop {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        

        int even = 0;
        int odd = 0;
        System.out.println("Enter number");
        int intValue = scanner.nextInt();
        while (intValue >=0) {
            
            if (intValue % 2 == 0){
                System.out.println(intValue + " is even"); 
                even ++;  }
            else {
                System.out.println(intValue + " number is odd");
                odd ++;
            }
            intValue--;
            }
        System.out.println("Even numbers" + even + "odd numbers" + odd);
     
        scanner.close(); 
      
    }
}
