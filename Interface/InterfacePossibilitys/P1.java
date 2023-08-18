import java.util.*;

interface D {

        void m1();

}interface D1 {



}interface D2 {

    void m1();

}interface D3 {

    void m1();

}
interface D4 extends D,D1,D2,D3{

    void m1();

}

class Z{}
 class A extends Z implements D4{

    public void m1(){
        System.out.println("Hi");
    }
     public static void main(String[] args) {
         D obj=new A();
         obj.m1();
     }
}

