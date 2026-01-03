
import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    private int weight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.weight = 0;
    }
    
    public void addItem(Item item) {
        if (this.weight + item.getWeight() <= maxWeight) {
            items.add(item);
            this.weight += item.getWeight();
        }
    }
    
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        
        if (items.size() == 1) {
            return "1 item (" + this.weight + " kg)";
        }
                
        return items.size() + " items (" + this.weight + " kg)";
    }
    
    public void printItems() {
        for (Item item: items) {
            System.out.println(item.toString());
        }
    }
    
    public int totalWeight() {
        return weight;
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviest = items.get(0);
        
        for (Item item: items){
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
}
