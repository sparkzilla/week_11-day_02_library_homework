import org.junit.Before;
import org.junit.Test;

public class BorrowerTests {

    private Library library;
    private BorrowedBooks borrowedBooks;
    private BookObject book1;
    private BookObject book2;
    private BookObject book3;
    private BookObject book4;


    @Before
    public void before() {
        library = new Library();
        book1 = new BookObject("1984", "George Orwell", "Politics");
        book2 = new BookObject("Catch-22", "Joseph Heller", "Satire");
        book3 = new BookObject("Animal Farm", "George Orwell", "Politics");
        book4 = new BookObject("Treasure Island", "RL Stevenston", "Adventure");
    }

}
