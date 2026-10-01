class OOP_009 {
    public static void main(String[] args) {

        /*
         * // Creating object-A
         * ParentClass objA = new ParentClass();
         * 
         * objA.setStaticVariable(100);
         * objA.setA(10);
         * objA.setB(20);
         * 
         * // Printing values of object-A
         * System.out.println("Value of a from objA: " + objA.getA()); // 10
         * System.out.println("Value of b from objA: " + objA.getB()); // 20
         * System.out.println("Value of staticVariable from objA: " +
         * objA.getStaticVariable()); // 100
         * 
         * // Creating object-B
         * ParentClass objB = new ParentClass();
         * 
         * // Printing values of object-B
         * System.out.println("Value of a from objB: " + objB.getA()); // 0
         * System.out.println("Value of b from objB: " + objB.getB()); // 0
         * System.out.println("Value of staticVariable from objB: " +
         * objB.getStaticVariable()); // 100
         */

        Student student1 = new Student();
        // student1.rollNo = 20;
        // Student student2 = new Student();
        // student2.rollNo = 30;
        // Student.display(student1);
    }
}

class ParentClass {
    static int staticVariable;
    int a, b;

    // setters functions
    void setA(int a) {
        this.a = a;
    }

    void setB(int b) {
        this.b = b;
    }

    void setStaticVariable(int staticVariable) {
        this.staticVariable = staticVariable;
    }

    // getters functions
    int getA() {
        return a;
    }

    int getB() {
        return b;
    }

    int getStaticVariable() {
        return staticVariable;
    }
}

class Student {
    static {
        System.out.println("Static block executed");
    }
    int rollNo = 10;

    static void display(Student student) {
        // System.out.println("This is a static method");
        // System.out.println(new Student().rollNo);
        System.out.println(student.rollNo);
    }
}
