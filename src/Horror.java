public class Horror extends Book{
    protected String genreName = "Horror";

    Horror(String name, String authorName, String authorSurname){
        super(name, authorName, authorSurname);
    }
    Horror(String name, String authorName) {
        super(name, authorName);
    }
}
