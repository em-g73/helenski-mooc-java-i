
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int firstContainer = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            String[] pieces = input.split(" ");
            
            String command = pieces[0];
            int amount = 0;
            if (pieces.length > 1) {
                amount = Integer.valueOf(pieces[1]);
            }
            
            if (command.equals("quit")) {
                break;
                
            } else if (command.equals("add")) {
                if (amount + firstContainer > 100) {
                    firstContainer = 100;
                } else if (amount > 0) {
                    firstContainer += amount;
                }
                
            } else if (command.equals("move")) {
                if (secondContainer + amount > 100) {
                    secondContainer = 100;
                    firstContainer -= amount;
                    if (firstContainer < 0) {
                        firstContainer = 0;
                    }
                } else if (amount > firstContainer) {
                    secondContainer += firstContainer;
                    firstContainer = 0;
                } else if (amount > 0) {
                    secondContainer += amount;
                    firstContainer -= amount;
                }
                
            } else if (command.equals("remove")) {
                if (secondContainer - amount < 0) {
                    secondContainer = 0;
                } else if (amount > 0) {
                    secondContainer -= amount;
                }
                
            }

        }
    }

}
