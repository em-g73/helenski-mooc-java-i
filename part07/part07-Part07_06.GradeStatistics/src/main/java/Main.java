
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> scores = new ArrayList<>();
        
        System.out.println("Enter point totals, -1 stops");
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input >= 0 && input <= 100) {
                scores.add(input);
            }
        }
        
        printAllInfo(scores);
    }
    
    public static void printAllInfo(ArrayList<Integer> scores) {
        Points points = new Points(scores);
        Grades grades = new Grades(scores);
        
        System.out.println("Point average (all): " + points.average());
        
        double averageOfPassing = points.averageOfPassing();
        if (averageOfPassing == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + averageOfPassing);
        }
        
        System.out.println("Pass percentage: " + points.passingPercentage());
        
        grades.printGradesAsStars();
    }
}
