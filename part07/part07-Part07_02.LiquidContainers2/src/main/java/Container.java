
public class Container {
    
    private int liquidAmount;
    
    public Container() {
        liquidAmount = 0;
    }
    
    public int contains() {
        return liquidAmount;
    }
    
    public void add(int amount) {
        if (liquidAmount + amount > 100) {
            liquidAmount = 100;
        } else if (amount > 0) {
            liquidAmount += amount;
        }
    }
    
    public void remove(int amount) {
        if (liquidAmount - amount < 0) {
            liquidAmount = 0;
        } else if (amount > 0) {
            liquidAmount -= amount;
        }
    }
    
    public String toString() {
        return liquidAmount + "/100";
    }
}
