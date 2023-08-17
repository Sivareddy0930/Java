

public class Demo2{

	 final int i=10;
	 final synchronized void m1(){
        System.out.println("m1 method");

	 }
	public static void main(String[] args){
		Demo2 obj =new Demo2();
        System.out.println(obj.i);
		obj.m1();


}
}