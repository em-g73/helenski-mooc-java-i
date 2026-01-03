
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<String> list = new ArrayList<>();
        
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            
            while (fileScanner.hasNextLine()) {
                list.add(fileScanner.nextLine());
            }
            
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        for (String line: list) {
            String[] pieces = line.split(",");
            Person person = new Person(pieces[0], Integer.valueOf(pieces[1]));
            persons.add(person);
        }
        
        return persons;

    }
}
