
import java.sql.SQLException;
import java.io.FileNotFoundException;

class MultipleCatch{
	public static void main(String[] args){
		try{
				System.out.println(10/0);
			
		}
        // catch(SQLException f){          //exception SQLException is never thrown in body of corresponding try statement
		// 		System.out.println("SQLException is handled");
								
		// }
        catch(ArithmeticException e){
				System.out.println("ArithmeticException is handled");
								
		}
        catch(IndexOutOfBoundsException i){
				System.out.println("IndexOutOfBoundException is handled");
								
		}
        // catch(FileNotFoundException g){
		// 		System.out.println("FileNotFoundException is handled");

        // }

	}
	
}
 

