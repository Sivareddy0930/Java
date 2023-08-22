
class A{

    public int m1(){
        return 10;
    }

}
//Applicable only for objects. Object --> String
//not applicable for primmitives
public class CovarientReturnType2 extends A{
        public long m1(){
          return 100l;
    }


public static void main(String[] args){

    CovarientReturnType2 obj=new CovarientReturnType2();
    System.out.println(obj.m1());
}
}