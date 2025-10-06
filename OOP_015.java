class A implements Runnable{
    public void run(){
        for (int i = 1; i <= 100; i++){
            System.out.print(i);
        }
    }
}
public class OOP_015{
    public static void main(String args[]){
        Runnable thRun = new A();
        Thread th = new Thread(thRun);
        th.start();
    }
}