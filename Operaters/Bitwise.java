package Operaters;

public class Bitwise {
public static void main(String[] args) {
    
        int a=10;
        int b=20;
   System.out.println(a<100 && b>100);//False
   System.out.println(a<100 & b>100);//False

   System.out.println(a<100 || b>100);//True
   System.out.println(a<100 | b>100);//True


int c=150;
 System.out.println(c<100 & c++ >100);//false
 System.out.println(c);
   System.out.println(c<100 | c++>100);//true
   System.out.println(c);

}
}
