class Case1{
	public static void main(String[] args){
		try{
				System.out.println(10/0);
			
		}
		// if we have child exception and parent exception catch blocks then palce
		//catch with parent Exception must use at end else we got CE.
		// exception ArithmeticException has already been caught
       catch(Exception i){
				System.out.println("Exception is handled");
								
		}
        catch(ArithmeticException e){
				System.out.println("ArithmeticException is handled");
								
		}
        catch(IndexOutOfBoundsException i){
				System.out.println("IndexOutOfBoundException is handled");
								
		}


		
        // catch(ArithmeticException e){
		// 		System.out.println("ArithmeticException is handled");
								
		// }
        // catch(IndexOutOfBoundsException i){
		// 		System.out.println("IndexOutOfBoundException is handled");
								
		// }
		// catch(Exception i){
		// 		System.out.println("Exception is handled");
								
		// }
        

	}
	
}
 

