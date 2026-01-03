
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public void advance() {
        if (this.day == 30) {
            day = 1;
            if (this.month == 12) {
                month = 1;
                year += 1;
            } else {
                month += 1;
            }
        } else {
            day += 1;
        }
    }
    
    public void advance(int howManyDays) {
        if (this.day + howManyDays >= 30) {
            day = (this.day + howManyDays) - 30 + (30 * (howManyDays/30));
            if (this.month == 12) {
                month += 1 + ((howManyDays/30) - 12);
                year += 1;
            } else {
                month += howManyDays/30;
            }
        } else {
            day += howManyDays;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);

        return newDate;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
