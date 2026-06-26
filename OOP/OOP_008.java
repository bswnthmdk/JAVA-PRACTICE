class A{
    public A(){
        System.out.println("Default A");
    }
    public A(int x){
        System.out.println("Parameterized A of int");
    }
    public A(char ch){
        System.out.println("Parameterized A of char");
    }
}
class B extends A{
    public B(){
        System.out.println("Default B");
    }
    public B(int x){
        super('x'); //Implements 'char' Parameterized constructor of A 
        // Due to the constructor overloading to type char
        System.out.println("Parameterized B of int");
    }
    public B(char ch){
        System.out.println("Parameterized B of char");
    }
}
class Animal{
    String str = "Animal";
    void eat(){
        System.out.println("Animal Eats");
    }
}
class Dog extends Animal{
    String str = "Dog";
    void eat(){
        System.out.println("Dog Eats");
    }
    void print(){
        super.eat();
        System.out.println(super.str);
        eat();
        System.out.println(str);
    }
}
public class OOP_008{
    public static void main(String args[]){
        //Implements 'int' Parameterized constructor of B
        // B obj = new B(10); 
        Dog objDog = new Dog();
        objDog.print(); 
    }
}