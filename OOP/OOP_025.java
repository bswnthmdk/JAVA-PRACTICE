abstract class Animal {
    abstract void name(); // Abstract method

    void show() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    @Override
    void name() {
        System.out.println("Dog");
    }
}

class Cat extends Animal {
    @Override
    void name() {
        System.out.println("Cat");
    }
}

public class OOP_025 {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.name();

        Animal a2 = new Cat();
        a2.name();
    }
}