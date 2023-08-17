
public class Test2 extends Test{
    int a=10;
    static int b=100;
        

    public void m1(){
      
        System.out.println("implimentation for abstract method");
    }

    public static void main(String[] args){

       
        // Test2 obj=new Test2();
         // System.out.println(obj.a);//error

          Test obj=new Test2();
           obj.m1();
            System.out.println(obj.pp);
            System.out.println(obj.a);
            System.out.println(obj.b);

        

    }
} 