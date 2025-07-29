package Com.practice.reflection;

public class Person {
    private String name = "John Doe";
    public int age = 30;

    public Person() {}
    
    public void greet(String message) {
        System.out.println(message + ", " + name);
    }
}

