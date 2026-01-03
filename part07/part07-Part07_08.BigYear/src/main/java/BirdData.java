
import java.util.ArrayList;

public class BirdData {
    
    private ArrayList<Bird> birds;
    
    public BirdData() {
        birds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        if (!(birds.contains(bird))) {
            birds.add(bird);
        }
    }
    
    public void addObservation(String name) {
        boolean birdExists = false;
        
        for (Bird bird: birds) {
            String birdName = bird.getName();
            if (birdName.equals(name)) {
                bird.addObservation();
                birdExists = true;
            }
        }
        
        if (!birdExists) {
            System.out.println("Not a bird!");
        }
    }
    
    public void printAll() {
        for (Bird bird: birds) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String name) {
        for (Bird bird: birds) {
            String birdName = bird.getName();
            if (birdName.equals(name)) {
                System.out.println(bird);
            }
        }
    }
    
}
