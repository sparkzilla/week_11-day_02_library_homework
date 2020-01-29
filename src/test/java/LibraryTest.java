import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private BookObject book1;
    private BookObject book2;
    private BookObject book3;
    private BookObject book4;
    private Borrower borrower1;

    @Before
    public void before(){
        library = new Library();
        book1 = new BookObject("1984", "George Orwell", "Politics");
        book2 = new BookObject("Catch-22", "Joseph Heller", "Satire");
        book3 = new BookObject("Animal Farm", "George Orwell", "Politics");
        book4 = new BookObject("Treasure Island", "RL Sttevenston", "Adventure");
        borrower1 = new Borrower("John");
    }

    @Test
    public void countBooksInLibrary(){
        assertEquals(0, library.totalBooks());
    }

    @Test
    public void getCapacity(){
        assertEquals(3, library.capacity());
    }

    @Test
    public void bookCanBeAdded() {
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.totalBooks());
    }

    @Test
    public void libraryHasCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.totalBooks());

    }

    @Test
    public void lendBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.lendBook(book1, borrower1);
        assertEquals(2, library.totalBooks());
        assertEquals(1, borrower1.totalBorrowedBooks());
    }

}
