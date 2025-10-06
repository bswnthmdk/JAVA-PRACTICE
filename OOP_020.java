class SharedResource {
    synchronized void waitForSignal() {
        try {
            System.out.println("Thread1: Waiting for notification...");
            wait(); // Waits until notified
            System.out.println("Thread1: Got notified! Continuing...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void sendSignal() {
        System.out.println("Thread2: Sending notification...");
        notify(); // Notifies one waiting thread
    }
}

class Thread1 extends Thread {
    SharedResource resource;

    Thread1(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        resource.waitForSignal();
    }
}

class Thread2 extends Thread {
    SharedResource resource;

    Thread2(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        try {
            Thread.sleep(1000); // Delay to ensure Thread1 waits first
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        resource.sendSignal();
    }
}

public class WaitNotifyDemo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread1 t1 = new Thread1(resource);
        Thread2 t2 = new Thread2(resource);

        t1.start();
        t2.start();
    }
}
