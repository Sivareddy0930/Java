
// checked exceptions are always to be handled or thrown.
//but unchecked exception are no need to handle.
class tryCatch{
	public static void main(String[] args){
			m1();

	}
	static void m1(){
		Thread.sleep(10000);//checked 
		// System.out.println(10/0);//unchecked
	}
}
 

