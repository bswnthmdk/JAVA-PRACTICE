class DemoClass {

    public void method(int a) {
        System.out.println("A method with 1 int parameter " + a);
    }

    public void method(int a, int b) {
        System.out.println("A method with 2 int parameters " + a + b);
    }

    public void method(int a, int b, int c) {
        System.out.println("A method with 3 int parameters " + a + b + c);
    }

    public void method(int a, char ch) {
        System.out.println("A method with 1 int parameter " + a + " And 1 char parameter " + ch);
    }

    public void method(float f, boolean b) {
        System.out.println("A method with 1 float parameter " + f + " And 1 boolean parameter " + b);
    }

    public void method(int a, float f) {
        System.out.println("A method with 1 int parameter " + a + " And 1 float parameter" + f);
    }

    public void method(float f, int a) {
        System.out.println("A method with 1 float parameter " + f + " And 1 int parameter" + a);
    }

}

public class OOP_007 {
    public static void main(String[] args) {
        DemoClass demoObj = new DemoClass();
        demoObj.method(11);
        demoObj.method(11.1f, 22);
        demoObj.method(22, 11.1f);
    }
}
