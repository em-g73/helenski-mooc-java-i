
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();

        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.equals("")) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            String item = identifier + ": " + name;
            boolean inList = false;
            
            for (String i: items) {
                String[] pieces = i.split(": ");
                if (pieces[0].equals(identifier)) {
                    inList = true;
                    break;
                }
            }
            
            if (!(inList)) {
                items.add(item);
            }
        }
        System.out.println("==Items==");
        
        for (String item: items) {
            System.out.println(item);
        }
    }
}
