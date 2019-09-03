import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp(){
        library = new Library(10);
        book1 = new Book("The Living Mountain", "Nan Shepard", "Scottish");
        book2 = new Book("The Shining", "Stephen King", "Horror");
        book3 = new Book("John MacNab", "John Bucchan", "Adventure");
    }

    @Test
    public void testStockCount(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void testAddBook(){
        library.addBook(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void testRemoveBook(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.removeBook();
        assertEquals(2, library.stockCount());
    }

}
