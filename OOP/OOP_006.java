class Parent {
    Parent() {
        System.out.println("I am Parent Constructor");
    }

    public void fun1() {
        System.out.println("This is function 1");
    }

    public void fun2() {
        System.out.println("This is function 2");
    }
}

class Child {
    Child() {
        System.out.println("Child Constructor ");
    }

    Child(int a) {
        System.out.println("Child Constructor " + a);

    }

    Child(int a, int b) {
        System.out.println("Child Constructor " + a + b);
    }

    public void childFun1() {
        System.out.println("Child class property");
    }
}

class OOP_006 {
    public static void main(String[] a) {
        Child chd = new Child(11, 22);
        // chd.fun2();
        chd.childFun1();
        // chd.fun1();
    }
}