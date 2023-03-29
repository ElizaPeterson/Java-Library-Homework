import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private Integer capacity;


    public Library(Integer capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int stockCount() {
        return books.size();
    }

    public void addBook(Book book) {
        if (stockCount() < capacity) {
            this.books.add(book);
        }
    }

    public Book removeBook() {
        return this.books.remove(0);
    }


}
