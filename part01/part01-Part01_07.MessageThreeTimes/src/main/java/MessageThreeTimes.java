
import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {
        System.out.println("Write a message:");
        Scanner scanner = new Scanner(System.in);
        
        String message = scanner.nextLine();
        
        System.out.println(message);
        System.out.println(message);
        System.out.println(message);

    }
}
