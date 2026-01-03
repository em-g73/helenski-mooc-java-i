

public class FromOneToParameter {

    public static void main(String[] args) {
        printUntilNumber(5);
    }
    
    public static void printUntilNumber(int number) {
        int i = 0;
        while (true) {
            i++;
            System.out.println(i);
            
            if (i == number) {
                break;
            }
        }
    }
}
