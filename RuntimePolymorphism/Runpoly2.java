class A {
    void m1(){
        System.out.println("my A");
    }
    void m2(){
        System.out.println("parent method");
    }
}
class B extends A{
      void m1(){
        System.out.println("my B");
    }
}
public class Runpoly2{
   public static void main(String args[]){
    A obj=new B();
    B obj1=(B)obj;//downcasting or narrowing
    obj1.m1();
    obj1.m2();
   }
}