// inheritance is not possible with constructor.
//and overriding is also not possible.
//But we can access super class constructor with super()

class A{
    A(){
        System.out.println(" super class constrouctor invoked");

    }
}
class case7 extends A{
    
    case7(){
        // here super() is first statement.
        System.out.println(" child class constrouctor invoked");
    }
    
    
   

    public static void main (String args[]){
            case7 obj=new case7();
           
         
    }
}