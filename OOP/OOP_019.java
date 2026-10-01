class Counter {
    int c = 0;

    // increament() function ta parallely use hochhe(aka Race Condition), toh eta ke
    // stop korar jonno 'synchronized' keyword ta lagiye dite hobe
    public synchronized void increament() {
        c++;
    }
}

class MyThread extends Thread {
    Counter counter;

    MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increament();
        }
    }
}

public class OOP_019 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        MyThread th1 = new MyThread(counter);
        MyThread th2 = new MyThread(counter);

        th1.start();
        th2.start();
        // Nicher 2 to lines er mane ei noi je, 'th1' terminate houar pore 'th2' start
        // hobe ar tarpore giye 'main' thread start hobe. Er mane ei je 'th1' & 'th2'
        // both have already started, now after terminating both the threads 'th1' &
        // 'th2' the 'main' thread will starts.
        th1.join(); // 'th1' sesh holo.
        th2.join(); // 'th2' sesh holo.

        System.out.println("Final value of c: " + counter.c);
    }
}
