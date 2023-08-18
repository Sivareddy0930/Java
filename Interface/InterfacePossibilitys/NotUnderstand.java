interface A{
	public  static void main(String[] args){
		System.out.println("Hi");
	}
	

}
class B implements A{
		
// why we not getting the above main method in implemented class .
//But in class to class concept we can achive.
	
}

//--------------------------------------------------------------------------------------------------------------------

// class B{
// 	public static void main(String[] args){
// 			System.out.println("Hi");
// 	}
// }
//  class A extends B{

// 	//we can use the above method here due to extends .
// 	// we can implement class A .even no main method is there  due to inherentace.
	
// }


