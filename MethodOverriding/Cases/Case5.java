
class A{

      final void m1(){
       System.out.println("Hii");
    }

}

public class Case5 extends A{
         final void m1(){
       System.out.println("Hello");
          
    }

// we cannot override the final methods.

public static void main(String[] args){

    Case5 obj=new Case5();
    obj.m1();
    A obj1=new Case5();
    obj1.m1();
   
}
}