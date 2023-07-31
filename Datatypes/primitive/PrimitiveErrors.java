public class PrimitiveErrors{
	public static void main(String[] args){
	
	//datatypes like long,float. must have to suffix with it types.

	//long l=100000000000;
	// we get error :- error: integer number too large.
	//to avoid this we have to suffix with l.
	long l=100000000000l;
	
	System.out.println(l);

	//float type

	//float f=4.66;
	// we got error :- error: incompatible types: possible lossy conversion from double to float
	//to avoid this we have to suffix with f.
	float f=4.66f;

	System.out.println(f);


	//double type
	
	double d=9866.4444;
	// for double it considers as double automatically.
	System.out.println(d);

	
}}