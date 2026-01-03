
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        while (true) {
            System.out.println("First: " + firstContainer.toString());
            System.out.println("Second: " + secondContainer.toString());

            String input = scan.nextLine();
            String[] pieces = input.split(" ");
            
            String command = pieces[0];
            int amount = 0;
            if (pieces.length > 1) {
                amount = Integer.valueOf(pieces[1]);
            }
            
            if (input.equals("quit")) {
                break;
                
            } else if (command.equals("add")) {
                firstContainer.add(amount);
                
            } else if (command.equals("move")) {
                if (firstContainer.contains() < amount) {
                    secondContainer.add(firstContainer.contains());
                } else {
                    secondContainer.add(amount);
                }
                firstContainer.remove(amount);
                
            } else if (command.equals("remove")) {
                secondContainer.remove(amount);
                
            }

        }
    }

}
