import lesson1.Author;
import lesson1.Book;

public class Main {
    public static void main(String[] args) {

        Author author = new Author("Lev", "Tolstoy");

        Book book = new Book("Война и мир", author, 1867);

        System.out.println(book.getWritingDate());
        book.setWritingDate(1866);

        System.out.println(book.getWritingDate());
    }
}