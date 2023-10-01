
interface A{
	public abstract void m1();
}
class Demo2 {
	public static void main(String[] args){
			
			A obj =new A(){
				public void m1(){System.out.println("Anonymous inner class");}};
		obj.m1();
	}
	
}
 

