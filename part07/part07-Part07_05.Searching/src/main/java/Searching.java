
import java.util.ArrayList;

public class Searching {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book(254, "name");
        books.add(book1);
        Book book2 = new Book(345, "name");
        books.add(book2);
        Book book3 = new Book(467, "name");
        books.add(book3);
        Book book4 = new Book(555, "name");
        books.add(book4);
        Book book5 = new Book(678, "name");
        books.add(book5);
        
        int book = binarySearch(books, 555);
        System.out.println(book);
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = 0;
        
        for (Book book: books) {
            if (book.getId() == searchedId) {
                return index;
            }
            index++;
        }
        
        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int begin = 0;
        int end = books.size() - 1;
        
        while (true) {
            int middle = (end + begin)/2;
            Book book = books.get(middle);
            
            if (book.getId() == searchedId) {
                return middle;
            }
            
            if (book.getId() < searchedId) {
                begin = middle + 1;
            }
            
            if (book.getId() > searchedId) {
                end = middle - 1;
            }
            
            if (begin > end) {
                return -1;
            }
        }
    }
}

