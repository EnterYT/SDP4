public class Book {
    Genre genre;
    String name;
    String author;
    Book(String name, String author, Genre genre){
        this.genre = genre;
        this.author = author;
        this.name = name;
    }
}