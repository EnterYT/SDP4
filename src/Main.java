public class Main {
    //Start of the Project
    public static void main(String[] args) {
        Person David = new Librarian("David");
        Person Jimmy = new Customer("Jimmy");
        Book CallOfCthulhu = new Horror("CallOfCthulhu","Howard", "Lovecraft");
        Book StarOdyssey = new SciFi("StarOdyssey", "Alfonco", "Brescia");
        Book AGameOfThrones = new Fantasy("AGameOfThrones","George", "Martin");
    }
}