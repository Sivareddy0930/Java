

class B{
	static void m1(){
		System.out.println("Hello");
	}
}
abstract class A extends B{

	public static void m1(){
		System.out.println("HI");
			}
			public static void main(String[] args){
				B.m1();
	}
	
}

