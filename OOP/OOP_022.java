class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class OOP_022 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();

        try {
            Thread.sleep(1000);
            t1.suspend(); // Deprecated ❌
            System.out.println("Thread suspended");

            Thread.sleep(2000);
            t1.resume(); // Deprecated ❌
            System.out.println("Thread resumed");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
