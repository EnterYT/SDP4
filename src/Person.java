import java.util.Scanner;

public abstract class Person {
    Scanner sc = new Scanner(System.in);
    protected String name;
    int age;
    Person(String name){
        this.name = name;
    }
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    protected void communicate(String text){
        System.out.println("Talking...");
    }
    protected void searchBook(Book book){
        System.out.printf((book.isBookAvailable(book)) ? "This Book is now available" : "This Book is unavailable now");
    }
    public void addComment(Book book, String comment){
        book.comments.add(comment);
    }
    public void readComments(Book book){
        int l = book.comments.size();
        if (l == 0)
            return;
        for (int i = 0; i < l - 1; i++) {
            String comment = book.comments.get(i);
            System.out.print("Next comment?(Y/N): ");
            String answer = sc.nextLine();
            if(answer == "N" || answer == "n")
                return;
            System.out.println(comment);
        }
        System.out.printf(book.comments.get(l));
        System.out.println("This is the last comment");
    }
}
