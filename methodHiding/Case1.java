class A{
    static void m1(){
        System.out.println("parent class Static method");
    }
}
public class Case1 extends A{
     static void m1(){
        System.out.println("child class Static method");
    }
    public static void main(String args[]){
        A.m1();//parent
        m1();//child
        A obj=new Case1();
        obj.m1();//parent
         Case1 obj1=new Case1();
        obj1.m1();//child
    }
}
