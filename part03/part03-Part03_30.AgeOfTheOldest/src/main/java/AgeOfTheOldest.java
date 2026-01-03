
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> ageList = new ArrayList<>();

        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("")){
                break;
            }
            
            String[] pieces = inputString.split(",");
            ageList.add(Integer.valueOf(pieces[1]));
        }
        int greatest = 0;
        
        for (int age: ageList) {
            if (greatest < age) {
                greatest = age;
            }
        }
        System.out.println("Age of the oldest: " + greatest);
    }
}
