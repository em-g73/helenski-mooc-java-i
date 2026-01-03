
import java.util.ArrayList;

public class Points {
    
    private ArrayList<Integer> scores = new ArrayList<>();
    
    public Points(ArrayList<Integer> scores) { 
        this.scores = scores;
    }
    
    public double average() { //Returns average of grades
        int sum = 0;
        
        for (int score: scores) {
            sum += score;
        }
        
        return (double)sum/scores.size();
    }
    
    public double averageOfPassing() { //Returns average of passing grades
        int sum = 0;
        int amount = 0;
        
        for (int score: scores) {
            if (score >= 50) {
                sum += score;
                amount ++;
            }
        }
        
        return (double)sum/amount;
    }
    
    public double passingPercentage() { //Returns percentage of passing grades
        int amount = 0;
        
        for (int score: scores) {
            if (score >= 50) {
                amount++;
            }
        }
        
        return (double)amount/scores.size() * 100;
    }
    
}
