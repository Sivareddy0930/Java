public class Tasks{
    public static void main(String args[]){

        
        String s1=new String("ok bro");
        String s2=new String("ok bro");
        System.out.println(s1==s2);//false

        String s3="ok bro";
        System.out.println(s1==s3);//false

        String s4="ok bro";
        System.out.println(s3==s4);//true

        String s5="ok"+" bro";//At compile time they become ok bro .because they are constants.
        System.out.println(s4==s5);//true

        String s6="ok";
        String s7= s6+" bro";//At run time they become ok bro .because s6 is variable and " bro" is constant.
        System.out.println(s4==s7);//false

        final String s8="ok";
        String s9= s8+" bro";//At compile time they become ok bro .because they are constants. due to final s8 also constant.
        System.out.println(s4==s9);//true


      
        
        




       






    }
}