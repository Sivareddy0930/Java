// class ThrowKeyword2{
// 	static ArithmeticException a=new ArithmeticException("/by zero");
// 	public static void main(String[] args){
// 		throw a;
// 	}
// }
class ThrowKeyword2{
	static ArithmeticException a;
	public static void main(String[] args){
		throw a;//Exception in thread "main" java.lang.NullPointerException: Cannot throw exception because "ThrowKeyword2.a" is null at ThrowKeyword2.main(ThrowKeyword2.java:10)
	}
}
