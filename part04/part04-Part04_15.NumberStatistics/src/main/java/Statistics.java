
public class Statistics {

    private int count;
    private int sum;

    public Statistics() {}

    public void addNumber(int number) {
        sum += number;
        count += 1;
    }

    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        if (count != 0) {
            return sum/(double)count;
        } else {
            return 0;
        }
    }
    
}
