class Bike {
    void m1(){
        System.out.println("my Bike");
    }
    void m2(){
        System.out.println("parent method");
    }
}
class Bmw extends Bike{
      void m1(){
        System.out.println("my Bike");
    }
}
public class Runpoly{
   public static void main(String args[]){
     Bike b=new Bmw();//upcasting or widening
    b.m1();
    b.m2();
   }
}