
public class ShiftOperator {
    
    public static void main(String[] args) {
        //<<
        System.out.println(10<<2);//(10*2^2)
        System.out.println(10<<3);//(10*2^3)


        // >>

         System.out.println(10<<2);//(10/2^2)
        System.out.println(10<<3);//(102^3)
        // >>>

           //For positive number, >> and >>> works same  
    System.out.println(20>>2);  
    System.out.println(20>>>2);  
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2);  
    System.out.println(-20>>>2); 



    }



}
