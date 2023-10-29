public abstract class Person {
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
}
