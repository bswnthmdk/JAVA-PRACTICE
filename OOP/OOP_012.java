import java.util.Scanner;

class MyException extends Exception {
    public MyException(String e) {
        super(e);
    }
}

public class OOP_012 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter your balance: ");
            double balance = sc.nextDouble();
            if (balance < 500) {
                throw new MyException("Balance is less than 500");
            }
        } catch (MyException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}