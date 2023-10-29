public class Fantasy extends Book{
    protected String genreName = "Fantasy";

    Fantasy(String name, String authorName, String authorSurname) {
        super(name, authorName, authorSurname);
    }
    Fantasy(String name, String authorName) {
        super(name, authorName);
    }
}
