
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        int index = 0;
        
        for (int num: array) {
            if (index == array.length - 1) {
                System.out.print(num);
            } else {
                System.out.print(num + ", ");
            }
            index++;
        }
    }
}
