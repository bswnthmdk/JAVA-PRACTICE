class Circle {
    float radius = 0.0f;

    synchronized void output() {
        System.out.println("output method invoked for displaying area of circle..");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        if (radius == 0.0) {
            System.out.println("Waiting for input radius..");
            try {
                Thread.sleep(1000);
                wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Area : " + (3.14 * radius * radius));
    }

    synchronized void input(float r) {
        try {
            System.out.println("Inputting radius..");
            Thread.sleep(1000);
            radius = r;
            System.out.println("Radius value received..");
            Thread.sleep(1000);
            notify();
        } catch (Exception e) {
        }

    }
}

class thread1 extends Thread {
    Circle c;

    thread1(Circle c) {
        this.c = c;
    }

    public void run() {
        c.output();
    }
}

class thread2 extends Thread {
    Circle c;
    float radius;

    thread2(Circle c, float radius) {
        this.c = c;
        this.radius = radius;
    }

    public void run() {
        c.input(radius);
    }
}

public class OOP_021 {
    public static void main(String args[]) {

        Circle c = new Circle();
        thread1 th1 = new thread1(c);
        thread2 th2 = new thread2(c, 2.5f);
        th1.start();
        th2.start();
    }
}