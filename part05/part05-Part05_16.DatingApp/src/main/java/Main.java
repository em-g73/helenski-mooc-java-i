
public class Main {

    public static void main(String[] args) {
        SimpleDate date = new SimpleDate(30, 12, 2015);
        date.advance(3);
        System.out.println(date.toString());
    }
}
