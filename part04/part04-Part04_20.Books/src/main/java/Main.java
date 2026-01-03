import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name:");
            String name = scanner.nextLine();
            if (name.equals("")) {
                break;
            }
            
            System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            
            Book book = new Book(name, pages, year);
            books.add(book);
        }
        
        System.out.println("What information will be printed?");
        String input = scanner.nextLine();
        
        for (Book book: books) {
            if (input.equals("name")) {
                System.out.println(book.getName());
            } else if (input.equals("pages")) {
                System.out.println(book.getPages());
            } else if (input.equals("year")) {
                System.out.println(book.getYear());
            } else if (input.equals("everything")) {
                System.out.println(book.toString());
            }
        }
    }
}
