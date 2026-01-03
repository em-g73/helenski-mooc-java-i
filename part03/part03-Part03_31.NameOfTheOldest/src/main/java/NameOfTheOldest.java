
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> ageList = new ArrayList<>();
        ArrayList<String> nameList = new ArrayList<>();

        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("")){
                break;
            }
            
            String[] pieces = inputString.split(",");
            nameList.add(pieces[0]);
            ageList.add(Integer.valueOf(pieces[1]));
        }
        int greatest = 0;
        
        for (int age: ageList) {
            if (greatest < age) {
                greatest = age;
            }
        }
        int index = 0;
        
        for (int i = 0; i < ageList.size(); i++) {
            if (ageList.get(i) == greatest) {
                index = i;
            }
        }
        
        System.out.println("Name of the oldest: " + nameList.get(index));
    }
}
