
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int addCents = addition.cents();
        int addEuros = addition.euros();
        
        int newCents = this.cents;
        int newEuros = this.euros;
        
        if (newCents + addCents >= 100) {
            newEuros += 1;
            newCents += addCents - 100;
            
            newEuros += addEuros;
        } else {
            newCents += addCents;
            newEuros += addEuros;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }
    
    public Money minus(Money subtraction) {
        int minusCents = subtraction.cents();
        int minusEuros = subtraction.euros();
        
        int newCents = this.cents;
        int newEuros = this.euros;
        
        if (newEuros - minusEuros < 0) {
            newEuros = 0;
            newCents = 0;
            Money newMoney = new Money(newEuros, newCents);
        
            return newMoney;
        }
       
        if (newCents - minusCents < 0) {
            newEuros -= 1;
            newCents = 100 - (minusCents - newCents);
            
            newEuros -= minusEuros;
        } else {
            newCents -= minusCents;
            newEuros -= minusEuros;
        }
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        } else if (this.euros == compared.euros() && this.cents < compared.cents()) {
            return true;
        }
        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
