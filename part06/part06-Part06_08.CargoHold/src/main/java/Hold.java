
import java.util.ArrayList;

public class Hold {
    
    private int maxWeight;
    private int weight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.weight = 0;
        this.hold = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (weight + suitcase.totalWeight() <= maxWeight) {
            this.hold.add(suitcase);
            this.weight += suitcase.totalWeight();
        }
    }
    
    public String toString() {
        if (hold.isEmpty()) {
            return "no suitcases (0 kg)";
        }
        
        if (hold.size() == 1) {
            return "1 suitcase (" + this.weight + " kg)";
        }
                
        return hold.size() + " suitcases (" + this.weight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase: hold) {
            suitcase.printItems();
        }
    }
}
