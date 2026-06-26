class thread1 extends Thread{
    public void run(){
        System.out.println("Thread no. 1");
    }
}
class thread2 extends Thread{
    public void run(){
        System.out.println("Thread no. 2");
    }
}
class thread3 extends Thread{
    public void run(){
        System.out.println("Thread no. 3");
    }
}
class thread4 extends Thread{
    public void run(){
        System.out.println("Thread no. 4");
    }
}
class thread5 extends Thread{
    public void run(){
        System.out.println("Thread no. 5");
    }
}
public class OOP_016{
    public static void main(String args[]){
        thread1 th1 = new thread1();
        thread2 th2 = new thread2();
        thread3 th3 = new thread3();
        thread4 th4 = new thread4();
        thread5 th5 = new thread5();
        th5.setPriority(Thread.MAX_PRIORITY);
        th5.setPriority(Thread.MIN_PRIORITY);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
    }
}