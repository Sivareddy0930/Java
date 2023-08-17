//static is mainly used for memory management.
public class S1{
    //class cannot be static 

        static int i=10;

        static void m1(){
            System.out.println("Static Method");
        }

        static{
            System.out.println("Static Block that used to initalize the static variables");
            
        }

        static class s2{
            static void m2(){
                System.out.println("Static Inner class . and static method");
            }
        }


    public static void main(String args[]){

        System.out.println(i);
        m1();
        s2.m2();

    }
}