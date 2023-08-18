

interface A{
	void m1();
}

abstract class  B implements A{

	public void m1(){
		System.out.println("HI");
			}
	
}
class Demo2 extends B{
	public static void main(String[] args){
				Demo2 obj=new Demo2();

				obj.m1();
	}
}

