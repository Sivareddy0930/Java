
class A{

      private void m1(){
       System.out.println("Hii");
    }

}

public class Case4 extends A{
         private void m1(){
       System.out.println("Hello");
          
    }

// we cannot override the private methods beacuse scope is belongs to class level only.
public static void main(String[] args){

    Case4 obj=new Case4();
    obj.m1();//Hello
    //this is not checking  overriding here because due to child object and refernce.
    A obj1=new Case4();
    obj1.m1();
    //this is  checking  overriding here because due to child object and parent refernce.
    //error will get

}
}