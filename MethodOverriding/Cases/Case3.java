
class A{

      void m1(){
       System.out.println("Hii");
    }

}

public class Case3 extends A{
         public void m1(){
       System.out.println("Hello");
          
    }

// we cannot decrease accessbility but we can increase. from default to public 
// private<default<protected<public
public static void main(String[] args){

    A obj=new Case3();
    obj.m1();
}
}