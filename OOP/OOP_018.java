class thread extends Thread {
    public void run() {
        System.out.println("'th' thread started.");
        try {
            Thread.sleep(3000); // Simulate some work
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("'th' thread finished.");
    }
}

public class OOP_018 {
    public static void main(String[] args) {
        thread th = new thread();
        th.start();

        System.out.println("Main thread waiting for 'th' to finish...");
        try {
            th.join(); // Main thread waits here
            System.out.println("Main thread resumed after 'th' finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
