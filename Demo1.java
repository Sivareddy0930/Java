class A{
	final void m1(){
		System.out.println("hi");
	}
	
}


public class Demo1 extends A{

	private final void m1(){
		System.out.println("hello");
	}

    public static void main(String[] args) 
    {
       Demo1 obj=new Demo1();
			obj.m1();
		System.out.println();


		
    }

}



