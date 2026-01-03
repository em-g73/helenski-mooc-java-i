
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BirdData birdData = new BirdData();
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            if (command.equals("Add")) {
                System.out.println("Name:");
                String name = scan.nextLine();
                
                System.out.println("Name in Latin:");
                String latinName = scan.nextLine();
                
                birdData.addBird(name, latinName);
                
            } else if (command.equals("Observation")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                
                birdData.addObservation(name);
                
            } else if (command.equals("All")) {
                birdData.printAll();
                
            } else if (command.equals("One")) {
                System.out.println("Bird?");
                String name = scan.nextLine();
                
                birdData.printOne(name);
                
            } else if (command.equals("Quit")) {
                break;
                
            }
            
        }
    }

}
