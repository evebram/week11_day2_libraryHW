import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }


    public int countCollection(){
        return this.collection.size();
    }

    public void addToCollection(Book book){
        this.collection.add(book);
    }

    public void borrowBook(Library library){
        Book bookRemoved = library.removeBook();
        this.addToCollection(bookRemoved);
    }
}
