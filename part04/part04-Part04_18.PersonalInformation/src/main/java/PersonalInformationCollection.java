
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String input = "null";
        
        while (true) {
            System.out.println("First name:");
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String first_name = input;
            
            System.out.println("Last name:");
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String last_name = input;
            
            System.out.println("Identification number:");
            input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String idNumber = input;
            
            PersonalInformation person = new PersonalInformation(first_name, last_name, idNumber);
            infoCollection.add(person);
        }
        
        for (PersonalInformation person: infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }
    }
}
