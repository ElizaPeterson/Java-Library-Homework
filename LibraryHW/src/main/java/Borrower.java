import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> borrowedBooks;

    public Borrower(){
        this.borrowedBooks = new ArrayList<>();
    }

    public void addBook(Book book){
        borrowedBooks.add(book);
    }

    public int bookCount() {
        return this.borrowedBooks.size();
    }

    public void checkoutBookFromLibrary(Library library){
        Book book = library.removeBook();
        addBook(book);
    }
}
