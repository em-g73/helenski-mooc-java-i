
public class HealthStation {
    
    private int weighings = 0;

    public HealthStation() {}
    
    public int weigh(Person person) {
        int weight = person.getWeight();
        weighings += 1;
        return weight;
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        person.setWeight(weight + 1);
    }
    
    public int weighings() {
        return weighings;
    }

}
