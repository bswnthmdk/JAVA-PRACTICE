class thread1 extends Thread {
    public void run() {
        System.out.println("Thread 'th1' starts");
        try {
            Thread.sleep(3000); // Thread goes to TIMED_WAITING
            System.out.println("Thread 'th1' ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class thread2 extends Thread {
    public void run() {
        System.out.println("Thread 'th2' starts");
        try {
            Thread.sleep(5000); // Thread goes to TIMED_WAITING
            System.out.println("Thread 'th2' ends");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class OOP_017 {
    public static void main(String[] args) {
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        th2.start();
        try {
            th2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        th1.start();
    }
}
