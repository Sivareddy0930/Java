
class A{

    public Object m1(){
        return null;
    }

}
//Applicable only for objects. Object --> String
//not applicable for primmitives
public class CovarientReturnType extends A{
        public String m1(){
          return null;
    }


public static void main(String[] args){

    CovarientReturnType obj=new CovarientReturnType();
    System.out.println(obj.m1());
}
}