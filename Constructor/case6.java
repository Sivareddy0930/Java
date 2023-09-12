// constructor overloading.
class case6{
    
    case6(){
        
        System.out.println("constrouctor invoked");
    }
    case6(int i){
        
        System.out.println("constrouctor with int type");
    }
    case6(double d){
        
        System.out.println("constrouctor with double type");
    }
    
   

    public static void main (String args[]){
            case6 obj=new case6();
            case6 obj1=new case6(100);
            case6 obj2=new case6(1000000l);// it is promoted to from long => float => double
         
    }
}