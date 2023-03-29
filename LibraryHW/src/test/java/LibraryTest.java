import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(100);
        book = new Book("LOTR", "Tolkien","Sci-fi");
    }

    @Test
    public void libraryStockStartsAt0(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void atCapacity(){
        library = new Library(1);
        library.addBook(book);
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }
    @Test
    public void canRemoveBook(){
        library.addBook(book);
        library.removeBook();
        assertEquals(0, library.stockCount());
    }
}
