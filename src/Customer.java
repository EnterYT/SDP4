import java.util.ArrayList;

public class Customer extends Person{
    public String name;
    private int age;
    ArrayList<Book> rentedBooks = new ArrayList<>();
    Customer(String name) {
        super(name);
    }
    Customer(String name, int age){
        super(name, age);
    }

    public void askBookAvailable(Book book){
        System.out.printf("Is this book available?");
    }
    public void rentBook(Book book){
        book.available = false;
        rentedBooks.add(book);
    }
    public String listBooks(ArrayList<Book> bookList, int i){
        Book currentBook = bookList.get(i);
        if (i==1){
            return currentBook.name;
        }
        System.out.println(listBooks(bookList, i-1));
        return null;
    }
}
