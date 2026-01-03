
import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stack;
    
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public String take() {
        String taken = stack.get(stack.size() - 1);
        this.stack.remove(taken);
        return taken;
    }
    
    public ArrayList<String> values() {
        ArrayList<String> values = new ArrayList<>();
        
        for (String value: stack) {
            values.add(value);
        }
        
        return values;
    }
}
