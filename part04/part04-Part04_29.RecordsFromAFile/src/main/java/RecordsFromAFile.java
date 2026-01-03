
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                list.add(line);
            }
            
        } catch (Exception e) {
            System.out.println("Error e");
        }
        
        for (String line: list) {
            String[] parts = line.split(",");
            System.out.println(parts[0] + ", age: " + parts[1] + " years");
        }
    }   
}
