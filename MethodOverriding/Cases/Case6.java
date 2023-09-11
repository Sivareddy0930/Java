import java.io.IOException;
import java.io.EOFException;

class A{
    void m1() throws EOFException,IOException
     {
        System.out.println("Class A . m1() method");
    }
}

public class Case6 extends A{
    
     void m1() throws EOFException {
        System.out.println("Class Child . m1() method");
    }
    public static void main(String args[]){
            A obj=new Case6();
           // obj.m1();
    }
}