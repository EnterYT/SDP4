public class Book {
    String name;
    String author;
    boolean available = true;
    Book(String name, String author){
        this.author = author;
        this.name = name;
    }

    public boolean isBookAvailable(Book book){
        return book.available;
    }
}