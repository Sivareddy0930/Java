
public class Test2 extends Test{
    int a=10;
    static int b=100;
        

    public void m1(){
        int c=1000;
        System.out.println("implimentation for abstract method");
    }

    public static void main(String[] args){

        Test obj=new Test2();
        // Test2 obj=new Test2();

        obj.m1();


    }
} 