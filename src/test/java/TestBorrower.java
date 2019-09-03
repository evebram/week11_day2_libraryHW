import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBorrower {
    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void setUp(){
        borrower = new Borrower("Eve");
        book = new Book("Crotal and White", "Finlay .J MacDonald", "Biography");
        library = new Library(10);
    }

    @Test
    public void testCountCollection(){
        assertEquals(0, borrower.countCollection());
    }

    @Test
    public void testAddToCollection(){
        borrower.addToCollection(book);
        assertEquals(1, borrower.countCollection());
    }

    @Test
    public void testBorrowBook(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(1, borrower.countCollection());
    }
}
