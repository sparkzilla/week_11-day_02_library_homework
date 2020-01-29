import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private ArrayList<BookObject> books;
    private int capacity;
    private ArrayList<Borrower> borrower;

    public Library() {
        this.books = new ArrayList<>();
        this.capacity = 3;
        this.borrower = new ArrayList<>();
    }

    public int capacity(){
        return this.capacity;
    }

    public int totalBooks(){
       return this.books.size();
    }

    public void addBook(BookObject newbook){
        if (totalBooks() < this.capacity) {
            this.books.add(newbook);
        }
    }

    public void lendBook(BookObject book, Borrower borrower){
            this.books.remove(book);
            borrower.borrowBook(book);
        }
    }
