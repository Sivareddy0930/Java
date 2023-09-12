

class A{
    A(int i){
        System.out.println(" super class constrouctor invoked");

    }
}
class case8 extends A{
    
    case8(){
        // here super() is first statement.
        //we got error here because we are calling constrouctor with no-arugments bu using super().but in class A no such constouctor only parameterized constructor is there.
        System.out.println(" child class constrouctor invoked");
    }
    
    
   

    public static void main (String args[]){
            case8 obj=new case8();
           
         
    }
}