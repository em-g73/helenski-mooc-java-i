
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numOne = Integer.valueOf(scanner.nextLine());
        int numTwo = Integer.valueOf(scanner.nextLine());
        
        double squareRoot = Math.sqrt((double) numOne + (double) numTwo);
        System.out.println(squareRoot);
    }
}
