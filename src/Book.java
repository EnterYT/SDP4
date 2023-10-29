import java.util.ArrayList;

public class Book {
    String name;
    String authorName;
    String authorSurname;
    protected String review = null;
    ArrayList<String> comments = new ArrayList<>();
    boolean available = true;
    Book(String name, String authorName, String authorSurname){
        this.authorName = authorName;
        this.authorSurname = authorSurname;
        this.name = name;
    }
    Book(String name, String authorName){
        this.name = name;
        this.authorName = authorName;
        this.authorSurname = "";
    }
    public boolean isBookAvailable(Book book){
        return book.available;
    }
    public String showReview(){
        return review;
    }
}