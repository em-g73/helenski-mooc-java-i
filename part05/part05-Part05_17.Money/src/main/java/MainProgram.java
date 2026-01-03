
public class MainProgram {

    public static void main(String[] args) {
        System.out.println("PART ONE");
        Money firstMoneyObject = new Money(7, 50);
        Money secondMoneyObject = new Money(1, 60);
        Money firstPlusSecond = firstMoneyObject.plus(secondMoneyObject);
        System.out.println(firstPlusSecond); //Should be 9.1
        System.out.println("----------");
        
        System.out.println("PART TWO");
        System.out.println("----------");
        
        System.out.println("PART THREE");
        Money thirdMoneyObject = new Money(1, 50);
        Money fourthMoneyObject = new Money(2, 0);
        Money firstMinusSecond = thirdMoneyObject.minus(fourthMoneyObject); 
        System.out.println(firstMinusSecond); //Should be 0
        firstMinusSecond.cents();
        System.out.println("----------");
    }
}
