//no return type for constructors.even void also not applicable.if we try to add returntype compiler will consider as a normal method.we dont get any error.
class case5{
    
    void case5(){
        // it is consider as an method .but not constructor
        System.out.println("constrouctor invoked");
    }
    
   

    public static void main (String args[]){
            case5 obj=new case5();
            obj.case5();//method call
         
    }
}