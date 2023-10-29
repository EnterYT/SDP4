import java.util.ArrayList;

public class SciFi extends Book{
    protected String genreName = "SciFi";

    SciFi(String name, String authorName, String authorSurname) {
        super(name, authorName, authorSurname);
    }
    SciFi(String name, String authorName){
        super(name, authorName);
    }
}
