// Instance Method, Static Method, Function
class Class1 {
    public static void C1F1() {
        System.out.println("Method 1 of Class 1 gets called");
    }
}

public class OOP_005 {
    public void method1() {
        System.out.println("Method 1 gets called");
    }

    public static void function1() {
        System.out.println("Function 1 gets called");
    }

    public static void main(String args[]) {
        OOP_005 obj = new OOP_005();
        obj.method1();// Instance Method
        function1();// Function. Due to the 'static' keyword cann't be invoked by creating object.
        Class1.C1F1();// Static Method
    }
}
