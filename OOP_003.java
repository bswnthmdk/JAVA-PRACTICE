class A {
    int a = 10;
}

class OOP_003 {
    public static void main(String a[]) {
        int[] arr = new int[] { 11, 55, 7, 94, 99, 33, 58 };
        for (int i : arr) {
            // System.out.println(i);
        }
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = new A();
        A obj4 = new A();
        A obj5 = new A();
        A[] objArr = new A[] { obj1, obj2, obj3, obj4, obj5 };
        int l = 0;
        for (A obj : objArr) {
            // System.out.println(obj.a);
            l++;
            System.out.println(l);
        }
    }
}
