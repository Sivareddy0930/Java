class ThrowKeyword4 extends Throwable{
	public static void main(String[] args){
		throw new ThrowKeyword4();//error: unreported exception ThrowKeyword4; must be caught or declared to be thrown.
	}
}
