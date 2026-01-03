
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<Integer> yearList = new ArrayList<>();
        
        while (true) {
            String inputString = scanner.nextLine();
            if (inputString.equals("")){
                break;
            }
            
            String[] pieces = inputString.split(",");
            nameList.add(pieces[0]);
            yearList.add(Integer.valueOf(pieces[1]));
        }
        
        int longestNameAmount = 0;
        String longestName = "";
        
        for (String name: nameList) {
            String[] pieces = name.split("");
            boolean longer = pieces.length > longestNameAmount;
            if (longer) {
                longestName = name;
                longestNameAmount = pieces.length;
            }
        }
        
        int sum = 0;
        for (int year: yearList) {
            sum += year;
        }
        
        double mean = (double)sum/yearList.size();
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + mean);
        
    }
}
