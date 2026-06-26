class Person {
    private String name;
    private int age;

    // Constructor with all parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with one parameter, calls the all-parameters constructor
    public Person(String name) {
        this(name, 30); // default age is 30
    }

    // Default constructor, calls the one-parameter constructor
    public Person() {
        this("John Doe"); // default name is "John Doe"
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class OOP_004 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.displayInfo(); // Output: Name: John Doe, Age: 30

        Person person2 = new Person("Alice");
        person2.displayInfo(); // Output: Name: Alice, Age: 30

        Person person3 = new Person("Bob", 25);
        person3.displayInfo(); // Output: Name: Bob, Age: 25
    }
}
