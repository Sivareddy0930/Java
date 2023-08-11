package pack2;
import pack1.A;
 class B extends A{

	
    
    public static void main(String[] args) {
      
	
    System.out.println("class B and pack2"); 

			B obj=new B();

	 System.out.println(obj.id);
	obj.m1();
	obj.m2();//public method we can access without inhertance relation also.
	//obj.m3();//Error it is a default method.

 


    }}
