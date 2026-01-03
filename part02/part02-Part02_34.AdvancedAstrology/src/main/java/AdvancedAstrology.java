
public class AdvancedAstrology {

    public static void printStars(int number) {
        while (true) {
            System.out.print("*");
            number--;
            if (number == 0) {
                System.out.println("");
                break;
            }
        }
    }

    public static void printSpaces(int number) {
        while (true) {
            if (number <= 0) {
                break;
            }
            number--;
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        int starLoop = 0;
        while (true) {
            starLoop++;
            printSpaces(size-starLoop);
            printStars(starLoop);
            if (starLoop == size) {
                break;
            }
        }
    }

    public static void christmasTree(int height) {
        int starLength = 1;
        int fullLength = 1 + (2*height);
        while (true) {
            printSpaces(((fullLength-starLength)/2)-1);
            printStars(starLength);
            starLength += 2;
            if (starLength >= fullLength) {
                int loopTimes = 2; 
                while (true) {
                    printSpaces(((fullLength-3)/2)-1);
                    printStars(3);
                    loopTimes--;
                    if (loopTimes == 0) {
                        break;
                    }
                }
                break;
            }
        }
        
        
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.
        christmasTree(10);
        System.out.println("----");
    }
}
