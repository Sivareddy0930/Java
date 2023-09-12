import java.io.IOException;

class A{
    A() throws IOException{
        System.out.println(" super class constrouctor invoked");

    }
}
class case9 extends A{
    
    case9(){
        // here super() is first statement.
        //here we calling super class constructor that throws an Exception but case9 is the caller method so must it have to provide handling code.
        //CE:-unreported exception IOException; must be caught or declared to be thrown
        //*********if a  parent class constructor throws an checked exception then must its child also throws same exception  or its parent Exception . for unchecked exceptions no worrys********
        System.out.println(" child class constrouctor invoked");
    }
    
    
   

    public static void main (String args[]){
            case9 obj=new case9();
           
         
    }
}