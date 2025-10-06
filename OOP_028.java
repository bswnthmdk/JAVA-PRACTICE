class Demo{
    final int x;
    // x = 10;// Not allowed directly in the class body
    // {x = 10;}// By using initializer block is allowed
    // Demo(int x){// By using constractor is allowed
    //     this.x = x;
    // }
    // void setX(int x){// By using a method is not allowed for 'final' but allowed in 'static'
    //     this.x = x;
    // }
    void printX(){
        System.out.println(this.x);
    }
}
public class OOP_028{
    public static void main(String args[]){
        Demo obj = new Demo(/*10*/);
            // obj.settX(10);
            obj.printX();
    }
}