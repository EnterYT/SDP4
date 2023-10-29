public class Librarian extends Person{
    public String name;
    private int age = 20;

    Librarian(String name){
        super(name);
    }
    Librarian(String name, int age){
        super(name, age);
    }
    public void checkBookAvailable(Book book){
        System.out.printf((book.isBookAvailable(book)) ? "This Book is now available" : "This Book is unavailable now");
    }
    public void cleanLibrary(){
        System.out.println("Library cleaned...");
    }
}
