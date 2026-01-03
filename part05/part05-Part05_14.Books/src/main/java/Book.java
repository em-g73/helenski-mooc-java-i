
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals(Object compare) {
        Book comparedBook = (Book) compare;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedBook.name) &&
            this.publicationYear == comparedBook.publicationYear) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

}
