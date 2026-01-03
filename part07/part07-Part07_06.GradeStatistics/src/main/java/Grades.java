
import java.util.ArrayList;

public class Grades {
    
    private ArrayList<Integer> scores = new ArrayList<>();
    
    public Grades(ArrayList<Integer> scores) {
        this.scores = scores;
    }
    
    public ArrayList<Integer> pointsToGrade() {
        int grade = 0;
        ArrayList<Integer> grades = new ArrayList<>();
        
        for (int score: scores) {
            if (score < 50) {
                grade = 0;
            } else if (score < 60) {
                grade = 1;
            } else if (score < 70) {
                grade = 2;
            } else if (score < 80) {
                grade = 3;
            } else if (score < 90) {
                grade = 4;
            } else if (score >= 90) {
                grade = 5;
            }
            
            grades.add(grade);
        }
        
        return grades;
    }
    
    public void printGradesAsStars() {
        ArrayList<Integer> grades = pointsToGrade();
        String starsZero = "";
        String starsOne = "";
        String starsTwo = "";
        String starsThree = "";
        String starsFour = "";
        String starsFive = "";
        
        for (int grade: grades) {
            if (grade == 5) {
                starsFive = starsFive + "*";
            } else if (grade == 4) {
                starsFour = starsFour + "*";
            } else if (grade == 3) {
                starsThree = starsThree + "*";
            } else if (grade == 2) {
                starsTwo = starsTwo + "*";
            } else if (grade == 1) {
                starsOne = starsOne + "*";
            } else if (grade == 0) {
                starsZero = starsZero + "*";
            }
        }
        
        System.out.println("5: " + starsFive);
        System.out.println("4: " + starsFour);
        System.out.println("3: " + starsThree);
        System.out.println("2: " + starsTwo);
        System.out.println("1: " + starsOne);
        System.out.println("0: " + starsZero);
    }
    
}
