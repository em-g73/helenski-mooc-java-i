
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        int count = 0;
        
        for (String line: list) {
            int num = Integer.valueOf(line);
            if (num >= lowerBound && num <= upperBound) {
                count += 1;
            }
        }
        
        System.out.println("Numbers: " + count);
    }
}
