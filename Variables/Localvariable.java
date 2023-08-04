

//Local variable is variable  that declared inside method.
//local variables cannot access outside method .
//if we using local variable must and should have to be instantiated.
public class Localvariable {

    
//    static  void m1(){
//         int a=100;
//         System.out.println(a);//100
//     }


//  static  void m1(){
//         int a=100;
//         System.out.println(a);
//         int b;
//         //here no errors at both compile and runtime.
//     }
    

 static  void m1(){
        int a=100;
        System.out.println(a);
        int b;
        //System.out.println(b); 
        //if we try to print. we get error
        // now error occure because of we are not initilized the variable to use.
        // if a variable is a local vaiable that you are using to print .that must be initilized.
    }
    public static void main(String[] args) {
        m1();
    }
}