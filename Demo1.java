abstract class A{
	abstract void m1();
}
abstract class B{
	abstract void m1();
}



public class Demo1 extends A,B{

	public void m1(){
		System.out.println("hi");
	}

    public static void main(String[] args) 
    {
       Demo1 obj=new Demo1();
			obj.m1();

		
    }

}



