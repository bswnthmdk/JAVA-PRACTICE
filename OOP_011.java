import java.io.*;
class Example{
    public void method(int age) {
        // Just throwing an checked example
        if (age < 0) {
            throw new ArithmeticException("INVALID AGE");
        }
        else{
            System.out.println("Valid age: " + age);
        }
    }
}
public class OOP_011{
    public static void main(String arg[]){
        Example eg = new Example();             
        try{
            eg.method(-20);
        }
        catch(ArithmeticException e){
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}