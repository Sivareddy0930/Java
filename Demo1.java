class A{
	static int s=100;
}


public class Demo1 extends A{

	public void m1(){
		System.out.println("hi");
	}

    public static void main(String[] args) 
    {
       Demo1 obj=new Demo1();
			obj.m1();
		System.out.println(A.s);


		
    }

}



