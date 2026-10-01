class thread1 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 1 is running");
                System.out.println("Good Morning!");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class thread2 extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Thread 2 is running");
                System.out.println("Hello!");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Question2 {
    public static void main(String args[]) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        t1.start();
        t2.start();
    }
}