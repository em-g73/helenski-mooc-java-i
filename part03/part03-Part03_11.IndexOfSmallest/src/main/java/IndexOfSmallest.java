
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numList = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }

            numList.add(input);
        }
        
        int smallest = numList.get(0);

        for(int i = 0; i < numList.size(); i++) {
            int number = numList.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }

        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < numList.size(); i++) {
            if (numList.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
