
 class Test{
public void m1(){
System.out.println("class2 method 1");
}

} 

public class Demo1{
	public static void main(String[] args){

		Test obj=new Test();
		int a=10;
        System.out.println(obj.getClass().getName());
}
}

