 

public abstract interface Demo1{

	default void m2(){
		System.out.println("Default");
	}

	
}
class B implements Demo1{

	public static void main(String[] args){
		B obj=new B();
		obj.m2();
		

	}
}



