public class EqualsAndOperator{
    public static void main(String args[]){

        // equals and == 

        EqualsAndOperator obj1=new EqualsAndOperator();

        EqualsAndOperator obj2 =new EqualsAndOperator();

        System.out.println(obj1.equals(obj2));//false
        System.out.println(obj1==obj2);//false


    
        String s="Siva";
        String s1=new String("Siva");

        System.out.println(s.equals(s1));//true
        System.out.println(s==s1);//false
       






    }
}