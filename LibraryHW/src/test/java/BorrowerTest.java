import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        library = new Library(100);
        borrower = new Borrower();
        book = new Book("LOTR", "Tolkien","Sci-fi");
    }

    @Test
    public void canAddBookToBorrowedBooks(){
        borrower.addBook(book);
        assertEquals(1, borrower.bookCount());
    }

    @Test
    public void canCheckoutBookFromLibrary(){
        library.addBook(book);
        borrower.checkoutBookFromLibrary(library);
        assertEquals(0, library.stockCount());
        assertEquals(1, borrower.bookCount());
    }

}
