
public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }
    
    public int getSquares() {
        return this.squares;
    }
    
    public int getPricePerSquare() {
        return this.pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (compared.getSquares() < this.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int price = this.squares * this.pricePerSquare;
        int comparedPrice = compared.getSquares() * compared.getPricePerSquare();
        
        if (price > comparedPrice) {
            return price - comparedPrice;
        }
        return comparedPrice - price;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (compared.getSquares() * compared.getPricePerSquare() < this.squares * this.pricePerSquare) {
            return true;
        }
        return false;
    }
}
