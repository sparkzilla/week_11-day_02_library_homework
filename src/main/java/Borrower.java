import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<BookObject> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(BookObject book){
        this.borrowedBooks.add(book);
    }

    public int totalBorrowedBooks() {
        return this.borrowedBooks.size();
    }
}
