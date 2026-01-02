
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        System.out.println("What's your name?");
        Scanner scanner = new Scanner(System.in);
        
        String name = scanner.nextLine();
        
        System.out.println("Hi " + name);

    }
}
