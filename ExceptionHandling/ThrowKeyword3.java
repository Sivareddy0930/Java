class ThrowKeyword3{
	public static void main(String[] args){
		throw new ThrowKeyword3();// we cannot throw the normal java class objects .
		// we can only throw the throwabale types.(only subclass types of Throwable is possible to throw).
		//error: incompatible types: ThrowKeyword3 cannot be converted to Throwable.
	}
}
