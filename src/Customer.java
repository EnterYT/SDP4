public class Customer extends Person{
    public String name;
    private int age;
    Customer(String name) {
        super(name);
    }
    Customer(String name, int age){
        super(name, age);
    }
}
