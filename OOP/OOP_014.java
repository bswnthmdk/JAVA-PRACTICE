class A extends Thread {
    public void print() {
        for (int i = 0; i < 100; i++) {
            // System.out.print((i+1) + "->");
            System.out.println("Class A");
        }
    }
}

class B extends Thread {
    public void print() {
        for (int i = 0; i < 100; i++) {
            // System.out.print((i+1) + "->");
            System.out.println("Class B");
        }
    }
}

public class OOP_014 {
    public static void main(String arg[]) {
        A objA = new A();
        B objB = new B();
        objA.start();
        objB.start();
    }
}