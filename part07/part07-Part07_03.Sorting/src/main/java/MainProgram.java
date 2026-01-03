
public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        
        for (int num: array) {
            if (num < smallest) {
                smallest = num;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        int smallestIndex = 0;
        
        for (int num: array) {
            if (num < smallest) {
                smallest = num;
                smallestIndex = index;
            }
            index += 1;
        }
        
        return smallestIndex;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = 0;
        int smallestIndex = startIndex;
        
        for (int num: table) {
            if (index >= startIndex) {
                if (num < smallest) {
                    smallest = num;
                    smallestIndex = index;
                }
            }
            index += 1;
        }
        
        return smallestIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int index = 0;
        int numOne = 0;
        int numTwo = 0;
        
        for (int num: array) {
            if (index == index1) {
                numOne = num;
            }
            if (index == index2) {
                numTwo = num;
            }
            index += 1;
        }
        
        array[index1] = numTwo;
        array[index2] = numOne;
    }
    
    public static void sort(int[] array) {
        for (int index = 0; index != array.length; index++) {
            int indexOfSmallest = indexOfSmallestFrom(array, index);
            swap(array, index, indexOfSmallest);
            System.out.println(array.toString());
        }
    }
}
