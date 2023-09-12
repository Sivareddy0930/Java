// can we  call constructor multipule times.
// NO, we cannot call same constructor multiple times.because  a constuctor is called  at time of object creation.if we want to call it again we have to create another object.
//calling the constructor more than once on the same object may not be possible.
//Additionally, points to be noted :
// 1. Explicit invocation of a Constructor can be done only from within another Constructor using this() method.
// 2. Recursive call to a constructor will throw an error. So that's not possible.
// 3. But you can invoke other constructors from a constructor. constrouctor chaining possible
class case3{
    
    case3(){
        this(10);
        System.out.println("constrouctor invoked");
    }
    case3(int i){
        this(10.5);
        System.out.println("constrouctor with int type");
    }
    case3(double d){
        System.out.println("constrouctor with double type");
    }

    public static void main (String args[]){
            case3 obj=new case3();// here i have called only one constructor .
            //but constructor chaining is happend through this()
           

         
    }
}