
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numQuantity = 0;
        double mean = 0;
        int oddNum = 0;
        int evenNum = 0;
        
        while (true) {
            System.out.println("Give numbers:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == -1) {
                break;
            }
            
            if (num % 2 == 0){
                evenNum += 1;
            } else {
                oddNum += 1;
            }
            
            sum += num;
            numQuantity++;
        }
        mean = sum / (double) numQuantity;
        
        System.out.println("Thx! Bye");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numQuantity);
        System.out.println("Average: " + mean);
        System.out.println("Even: " + evenNum);
        System.out.println("Odd: " + oddNum);
    }
}
